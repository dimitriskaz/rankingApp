import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Calendar;
/**
 * Write a description of class UpdateMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpdateMethod
{

    public static void updateShow()
    {

        Show[] shows = ShowList.readShowList();

        //ShowList sl;
        //sl = new ShowList();
        //Input_Show addShow = new Input_Show();

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please select which show you want to update: ");

       
        boolean found = true;
        int temp = -1;
        String title = sc.nextLine();

        for(int i = 0; i < shows.length; i++) {
            if(shows[i].getTitle().equals(title)) {
                found = true;
                temp = i;
            }  
        }

        System.out.println("Title: " + title);
        System.out.println(" ");
        System.out.println("What would you like to change?");
        System.out.println(" ");
        System.out.println("1. ID: " + shows[temp].getID());
        System.out.println("2. Duration: " + shows[temp].getDuration());
        System.out.println("3. Rating: " + shows[temp].getRating());
        System.out.println("4. Times Aired: " + shows[temp].getT_Aired());
        System.out.println("5. Last Date Aired: " + shows[temp].getD_Aired());
        System.out.println("6. Cabinet: " + shows[temp].getCabinet());

        int option = sc.nextInt();

        
        System.out.println(" ");

        switch(option)
        {
            case 1: System.out.println("Please enter the new ID: ");
            String id = inputId();
            shows[temp].setID(id);
            break;
            case 2: System.out.println("Please enter the new duration: ");
            int duration = inputDuration();
            shows[temp].setDuration(duration);
            break;
            case 3: System.out.println("Please enter the new rating: "); 
            int rating = inputRating();
            shows[temp].setRating(rating);
            break;
            case 4: System.out.println("Please enter the times the show has been aired: ");
            int t_aired = sc.nextInt();
            shows[temp].setT_Aired(t_aired);
            break;
            case 5: System.out.println("Please enter the last date the show was aired: ");
            String d_aired = inputD_Aired();
            shows[temp].setD_Aired(d_aired);
            break;
            case 6: System.out.println("Please enter the new location of the show's DVD: ");
            String cabinet = inputCabinet();
            shows[temp].setCabinet(cabinet);
            break;
        }

        String FILENAME = "theShowList.txt";
        
        if (found = true){

            try {
                //set up data file for writing
                FileWriter theShowList = new FileWriter(FILENAME);
                PrintWriter outFile = new PrintWriter(theShowList);      

                outFile.println(shows.length);

                for(int i=0; i<shows.length; i++) {
                    Show s = shows[i];
                    outFile.println(s.getTitle() + ":" + s.getID() + ":" + s.getDuration() + ":" + s.getP_Company() + ":" + s.getP_Date() + ":" + s.getRating() + ":" + s.getT_Aired()+ ":" + s.getD_Aired()+ ":" + s.getCabinet());
                }

                outFile.close();

            } catch (IOException io) {
                System.out.println("Error writing to the data file - " + io.getMessage());
            }

        }

        if (found = false)
        {
            System.out.println("Error!");
            updateShow();
        }
    }

    public static String inputId() 
    {
        
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        //The first 5 letters are: MOVIE, SPORT, DOCUM, NEWSS, MUSIC, ENTER, FASHI, TALEN, SERIE
        //MOVIE stands for movies
        //SPORT stands for sports
        //DOCUM stands for documentaries
        //ENTER stands for entertainment shows
        //FASHI stands for fashion shows
        //TALEN stands for talent shows
        //SERIE stands for series

        while(id.length() != 10) {
            System.out.println("Error: The ID you have entered is invalid.");
            return inputId();

        }
        String letters = id.substring(0,5).toUpperCase();
        if (letters.matches("MOVIE|SPORT|DOCUM|NEWSS|MUSIC|ENTER|FASHI|SERIE|TALEN"))
        {
            System.out.println("Type: " + letters);
        } else {
            System.out.println("Error: The type that you have entered is invalid.");
            return inputId();
        }
        String numbers = id.substring(5,10);

        if (numbers.matches("\\d{5}") && numbers.matches("[0-9][0-9][0-9][0-9][0-9]"))
        {
            System.out.println("Numbers: " + numbers);

        }else {
            System.out.println("Error: The number that you have entered is invalid.");
            return inputId();
        }
        Show[] shows = ShowList.readShowList();
        boolean found = false;

        for(int i = 0; i < shows.length; i++) {
            if(shows[i].getID().equals(id.toUpperCase()))
            {
                found = true;
                System.out.println("---------------------------------------------------------");
                System.out.println("*The ID that you have entered already exists in the list*");
                System.out.println("---------------------------------------------------------");
                return inputId();
            }  
        }

        if (found = false) {
            System.out.println("The ID of the show is: " + letters + numbers);
        }
        

        return id.toUpperCase();

    }

    public static int inputDuration() {
        
        Scanner sc = new Scanner(System.in);
        int duration = sc.nextInt();

        if (duration == 60 || duration == 120 || duration == 180 || duration == 210) {
            System.out.println("The Duration is " + duration + " minutes");
        } else {

            System.out.println("Error: The Duration time that you entered is not correct.");
            inputDuration();

        }

        return duration;
    }

    public static int inputRating()
    {
        
        System.out.println("**Remember: Rating can be from 0 to 100!**");
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();

        if (rating >=0 && rating <= 100)
        {
            System.out.println("The rating of the show is: " + rating);
        } else {
            System.out.println("Error: The rating that you have entered is invalid.");
            return inputRating();
        }

        System.out.println("---------------------------------------------------");

        return rating;
    }

    public static String inputD_Aired() {

        Scanner sc = new Scanner(System.in);
        String d_aired = sc.nextLine();
        System.out.println("--------------------------------------------");
        String day = d_aired.substring(0,2);

        if (day.matches("\\d{2}") && day.matches("[0-2][0-9]|3[0-1]"))
        {
            System.out.println("Day: " + day);
        } else {

            System.out.println("Error: The day that you have entered is invalid.");
            return inputD_Aired();
        }

        String month = d_aired.substring(2,4);

        if (month.matches("\\d{2}") && month.matches("0[1-9]|1[0-2]"))
        {
            System.out.println("Month: " + month);
        }else {

            System.out.println("Error: The month that you have entered is invalid.");
            return inputD_Aired();
        }

        String year = d_aired.substring(4,8);

        if (year.matches("\\d{4}") && year.matches("19[0-9][0-9]|20[0-1][0-7]"))
        {
            System.out.println("Year: " + year);
            System.out.println("Last Date Aired is: " + day + "/" + month + "/" + year);
        }else {
            System.out.println("Error: The year that you have entered is invalid.");
            return inputD_Aired();
        }

        int current_day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int current_month = Calendar.getInstance().get(Calendar.MONTH);
        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        int day2 = Integer.parseInt(day);
        int month2 = Integer.parseInt(month);
        int year2 = Integer.parseInt(year);

        if(day2 > current_day && month2 >= current_month && year2  >= current_year)
        {
            System.out.println("Error: The date that you have entered is invalid.");
            return inputD_Aired();
        }

        System.out.println("--------------------------------------------------");

        return day + "/" + month + "/" + year;

    }

    public static String inputCabinet()
    {
        
        Scanner sc = new Scanner(System.in);
        String cabinet = sc.nextLine();

        if (cabinet.matches("[A-Z][0-9][0-9]"))
        {
            System.out.println("The DVD is located on the cabinet with the number: " + cabinet);
        } else {
            System.out.println("Error: The number of the cabinet that you have entered is invalid");
            return inputCabinet();  
        }
        System.out.println("--------------------------------------------------");   

        return cabinet;
    }
}
