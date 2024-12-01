import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class RecommendMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecommendMethod
{
    //Quicksort 
    //FIRST sort according to Least times aired 
    //Ask for type 
    //Search for the desired duration
    //For R>70

    public static void quickSort(Show[] shows, int first, int last)
    {

        Show temp;
        int left = first;
        int right = last;
        int mid = shows[(first + last)/2].getT_Aired();
        //pivot element chosen from the pivot of the list
        while (right > left)
        {

            while (shows[left].getT_Aired() < mid) {  
                left = left + 1;  
            }

            while (mid < shows[right].getT_Aired())
            {  
                right = right - 1; 
            }

            if (left <= right)
            {
                temp = shows[left];
                shows[left] = shows[right];
                shows[right] = temp;
                left = left + 1;
                right = right - 1;

            }

        }

        if (first < right)
        {  
            quickSort(shows, first, right);  
        }

        if (left < last)
        {  
            quickSort(shows, left, last);
        }
    }

    public static void recommendShow(){
        Scanner sc = new Scanner(System.in);
        Show[] shows = ShowList.readShowList();

        System.out.println("========================================");
        System.out.println("*Sorting according to least Times Aired*");

        quickSort(shows, 0, shows.length-1);

        int input;
        boolean go = true;
        while(go){
            do {
                System.out.println("========================================");
                System.out.println("What type of shows do you want to search for?");
                System.out.println("---------------------------------------------");
                System.out.println("1. Movie");
                System.out.println("2. Documentary");
                System.out.println("3. Entertainment show");
                System.out.println("4. Fashion show");
                System.out.println("5. Talent show");
                System.out.println("6. Serie");
                System.out.println("7. Go back to the Main Menu");

                System.out.println(" ");
                System.out.println("Choose one of the above options: ");

                while (true)
                {
                    try 
                    {	

                        input = Integer.parseInt(sc.nextLine());
                        System.out.println("---------------------------------------------");
                        break;

                    } catch (NumberFormatException nfe) 
                    {
                        System.out.println("      **ERROR: Your input is not valid**      ");
                        System.out.println("!Please try again:");

                    }

                }

                if (input == 1)
                {
                    System.out.println("Type: Movie");

                    String a = "MOVIE";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();

                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;

                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    ok = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;

                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  

                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }

                }else if (input == 2) {
                    System.out.println("Type: Documentary");

                    String a = "DOCUM";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();

                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;

                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;
                                    ok = true;
                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  
                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }

                }else if (input == 3) {
                    System.out.println("Type: Entertainment");

                    String a = "ENTER";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();

                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;

                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;
                                    ok = true;

                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  
                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }

                }else if (input == 4) {
                    System.out.println("Type: Fashion");

                    String a = "FASHI";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();
                            ok = true;
                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;
                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;
                                    ok = true;
                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  
                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }

                }else if (input == 5){
                    System.out.println("Type: Talent");

                    String a = "TALEN";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();
                            ok = true;
                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;

                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;
                                    ok = true;
                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  
                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }

                }else if (input == 6){
                    System.out.println("Type: Serie");

                    String a = "SERIE";
                    boolean found = false;
                    boolean ok = false;

                    System.out.println(" ");
                    Show[] shows2 = new Show[shows.length];
                    Show[] shows3 = new Show[shows.length];
                    String temp;
                    int temp2;
                    int temp3;
                    int k = 0;
                    int m = 0;
                    System.out.println("Enter the duration of the show desired:");
                    int duration = sc.nextInt();
                    System.out.println("=======================================");

                    for(int i = 0; i < shows.length; i++) 
                    {
                        temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a))
                        {
                            found = true;
                            temp2 = shows[i].getDuration();
                            ok = true;
                            k = 0;
                            if (temp2 == duration)
                            {
                                found = true;

                                shows2[k] = shows[i];
                                k = k + 1;

                                temp3 = shows[i].getRating();
                                m = 0;
                                if(temp3 >= 70){
                                    found = true;
                                    shows3[m] = shows[i];
                                    m = m + 1;
                                    ok = true;
                                    System.out.println("→Title: " + shows[i].getTitle());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Rating: " + shows[i].getRating());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Times Aired: " + shows[i].getT_Aired());
                                    System.out.println("-------------------------------------");
                                    System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                                    System.out.println("=====================================");
                                }

                            }
                        }

                    }  
                    if (ok != true){
                        System.out.println("        **Error: Not found!**          ");
                        System.out.println("=======================================");
                    }


                }else if (input == 7){

                    System.out.println("You pressed 7");
                    CryptoFile.encryptMethod();
                    new Main_Menu();
                }

            }   while (input !=1 && input !=2 && input !=3 && input != 4 && input != 5 && input !=6 && input !=7 );

            System.out.println(" ");
            System.out.println("Do you want to continue? If No, please press (N).");

            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') 
            {
                CryptoFile.encryptMethod();
                System.exit(0);
            }
            else
            {
                recommendShow();
            }
        } 

    }

}
