
/**
 * The client adds a show in the list.
 **/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Calendar;

public class Input_Show
{
    private String title;
    private String id;
    private int duration;
    private String p_company;
    private String p_date;
    private int rating;
    private int t_aired;
    private String d_aired;
    private String cabinet;

    public Show showEntry()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Adding a new show");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("Show's details");
        System.out.println("--------------");
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the show: ");
        String title = sc.nextLine();
        System.out.println("The title is " + title);
        while (title.length() <= 0 || title.length()> 25){
            System.out.println("Error: The title you have entered is empty or has more than 20 characters");
            System.out.println("Write again the title of the show: ");
            title = sc.nextLine();

        }
        System.out.println("--------------------------------------------------");

        String id = inputId();

        int duration = inputDuration();

        System.out.println("--------------------------------------------------");
        System.out.println("Enter the name of the company that produced the show: ");
        String p_company = sc.nextLine();
        System.out.println("The company's name is " + p_company);
        while (p_company.length() <= 0 ||p_company.length()> 36){
            System.out.println("Error: The name of the company you have entered is empty or has more than 20 characters");
            System.out.println("Write again the name of the company: ");
            p_company = sc.nextLine();

        }
        System.out.println("--------------------------------------------------");

        String p_date = inputP_Date();

        int rating = inputRating();
        System.out.println("Enter the times that the show has been aired by the channel: ");
        int t_aired = sc.nextInt();
        
        System.out.println("The show has been aired " + t_aired + " times.");
        System.out.println("--------------------------------------------------");

        String d_aired = inputD_Aired();

        String cabinet = inputCabinet(); 

        Show a = new Show(title, id, duration, p_company, p_date, rating, t_aired, d_aired, cabinet);
        return a;

    }

    public String inputId() {
        System.out.println("Enter the ID of the show: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        //The first 5 letters are: MOVIE, SPORT, DOCUM, MUSIC, ENTER, FASHI, TALEN, SERIE
        //MOVIE stands for movies
        //SPORT stands for sports
        //DOCUM stands for documentaries
        //MUSIC stands for musical shows
        //ENTER stands for entertainment shows
        //FASHI stands for fashion shows
        //TALEN stands for talent shows
        //SERIE stands for series

        while(id.length() != 10) //Each ID should have exactly 10 Strings
        {
            System.out.println("Error: The ID you have entered is invalid.");
            return inputId();
        }
        
        String letters = id.substring(0,5).toUpperCase();//First five Strings are specific words
        if (letters.matches("MOVIE|SPORT|DOCUM|MUSIC|ENTER|FASHI|SERIE|TALEN"))//only specific types of shows can be accepted
        {
            System.out.println("Type: " + letters);
        } else {
            System.out.println("Error: The type that you have entered is invalid.");
            return inputId(); //Method calls itself and runs again
        }
        
        String numbers = id.substring(5,10);//Next five Strings are numbers
        if (numbers.matches("\\d{5}") && numbers.matches("[0-9][0-9][0-9][0-9][0-9]"))//only numbers are accepted
        {  
            System.out.println("Numbers: " + numbers);
        }else 
        {   //if the user inputs a character rather than number then the program outputs that tha data input is invalid
            System.out.println("Error: The number that you have entered is invalid.");
            return inputId();//Method calls itself and runs again
        }
        
        
        Show[] shows = ShowList.readShowList();//Calls method from another class to read data from the file
        boolean found = false;
        
        for(int i = 0; i < shows.length; i++) {
            if(shows[i].getID().equals(id.toUpperCase()))//Checks whether this ID already exists in the list
            {
                found = true;
                System.out.println("---------------------------------------------------------");
                System.out.println("*The ID that you have entered already exists in the list*");
                System.out.println("---------------------------------------------------------");
                return inputId();
            }  
        }
        
        if (found = false) //If no similar ID exists in the list, the ID is accepted
        {
            System.out.println("The ID of the show is: " + letters + numbers);
        }
        System.out.println("--------------------------------------------------");
        return id.toUpperCase(); //returns the ID to the showEntry() method

    }

    public int inputDuration() {
        System.out.println("Enter the duration of the show: ");
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

    public String inputP_Date() {
         

        System.out.println("Enter the date that the show was produced: ");
        Scanner sc = new Scanner(System.in);
        String p_date = sc.nextLine();
        System.out.println("--------------------------------------------");

        String day = p_date.substring(0,2);
        if (day.matches("\\d{2}") && day.matches("[0-2][0-9]|3[0-1]"))
        {
            System.out.println("Day: " + day);
        } else {

            System.out.println("Error: The day that you have entered is invalid.");
            return inputP_Date();

        }

        String month = p_date.substring(2,4);

        if (month.matches("\\d{2}") && month.matches("0[1-9]|1[0-2]"))
        {
            System.out.println("Month: " + month);
        }else {

            System.out.println("Error: The month that you have entered is invalid.");
            return inputP_Date();
        }

        String year = p_date.substring(4,8);

        if (year.matches("\\d{4}") && year.matches("19[0-9][0-9]|20[0-1][0-7]"))
        {
            System.out.println("Year: " + year);
            System.out.println("Production date is: " + day + "/" + month + "/" + year);
        }else {
            System.out.println("Error: The year that you have entered is invalid.");
            return inputP_Date();
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
            return inputP_Date();
        }

        System.out.println("--------------------------------------------------");

        return day + "/" + month + "/" + year;
    }

    public int inputRating()
    {
        System.out.println("Enter the rating of the show: ");
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

    public String inputD_Aired() {

        System.out.println("Enter the date that the show was last aired: ");
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

    public String inputCabinet()
    {
        System.out.println("Enter on which cabinet the DVD of the show is placed: ");
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

