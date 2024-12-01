import java.io.*;
import java.util.Scanner;
import java.util.Date; 

public class Main_Menu
{ 
    ShowList sl;

    public static void main(String[] args) 
    {
        CryptoFile.decryptMethod();
        new Main_Menu();
        System.exit(0);
    }
 
    public Main_Menu()
    {
        Date date = new Date();
        System.out.println(date.toString());
        
        sl = new ShowList();

        int User_Input ;
        boolean ok = true;
        while (ok) {
            do
            {  
                System.out.println("===============================================");
                System.out.println("         List with the shows purchased         ");
                System.out.println("===============================================");
                System.out.println(" ");
                System.out.println("Welcome Antonis!");
                System.out.println(" ");
                System.out.println("You have access to the list with the shows purchased.");
                System.out.println("-----------------------------------------------------");
                System.out.println("Choose one of the below options:");
                System.out.println(" ");
                System.out.println("1. Search shows");
                System.out.println("2. Sort shows");
                System.out.println("3. List all the shows");
                System.out.println("4. Add a show in the list");
                System.out.println("5. Remove a show from the list");
                System.out.println("6. Recommend a show");
                System.out.println("7. Update a show");
                System.out.println("8. Back up file");
                System.out.println("9. Quit");
                System.out.println(" ");
                Scanner sc = new Scanner(System.in);

                System.out.println("Please enter one of the above options:");
                while (true)
                {
                    try 
                    {	

                        User_Input = Integer.parseInt(sc.nextLine());

                        break;

                    } catch (NumberFormatException nfe) 
                    {
                        System.out.println("**ERROR: Your input is not valid.**");
                        System.out.println("Please try again:");

                    }

                }

                if (User_Input == 1)
                 {System.out.println("You pressed 1");
                    int input;
                    boolean go = true;
                 while(go){
                        do {
                            System.out.println("=======================================================");
                            System.out.println("What are you willing to search for?");
                            System.out.println(" ");
                            System.out.println("1. Search for a show's details by using its title");
                            System.out.println("2. Search for shows according to specific type");
                            System.out.println("3. Search for shows according to production company's name"); 
                            System.out.println("4. Find the location of the DVD of a show");
                            System.out.println("5. Go back to main menu");

                            System.out.println(" ");
                            System.out.println("Choose one of the below options: ");

                            while (true)
                            {
                                try 
                                {	

                                    input = Integer.parseInt(sc.nextLine());
                                    System.out.println("-------------------------------------------------------");
                                    break;

                                } catch (NumberFormatException nfe) 
                                {
                                    System.out.println("**ERROR: Your input is not valid.**");
                                    System.out.println("Please try again:");

                                }

                            }

                            if (input == 1)
                            {
                                System.out.println("You pressed 1");
                                Search.searchTitle();
                            }else if (input == 2) 
                            {
                                System.out.println("You pressed 2");
                                Search.searchType();
                            }else if (input == 3) {
                                System.out.println("You pressed 3");
                                Search.searchCompany();
                            }else if (input == 4) {
                               System.out.println("You pressed 4");
                               Search.searchLocation();
                            }
                            else if (input == 5){
                                System.out.println("You pressed 5");
                                new Main_Menu();
                            }

                        }   while (input !=1 && input !=2 && input !=3 && input != 4 && input != 5 && input != 6 );

                        System.out.println("Do you want to continue? If No, please press (N).");
                        char c = sc.nextLine().charAt(0);

                        if (c == 'N' || c == 'n') {
                            go = false;
                        }
                    }
                    
                }
                else if (User_Input ==2)
                {
                    System.out.println("You pressed 2");
                    int input;
                    boolean go = true;
                    while(go){
                        do {
                            System.out.println("=======================================================");
                            System.out.println("What are you willing to sort?");
                            System.out.println(" ");

                            System.out.println("1. Sort shows according to rating");
                            System.out.println("2. Sort shows according to times aired");
                            System.out.println("3. Go back to main menu");

                            System.out.println(" ");
                            System.out.println("Choose one of the below options: ");

                            while (true)
                            {
                                try 
                                {	

                                    input = Integer.parseInt(sc.nextLine());
                                    System.out.println("-------------------------------------------------------");
                                    break;

                                } catch (NumberFormatException nfe) 
                                {
                                    System.out.println("**ERROR: Your input is not valid.**");
                                    System.out.println("Please try again:");

                                }

                            }

                            if (input == 1)
                            {
                                System.out.println("You pressed 1");
                                Sort.sortRating();
                            }else if (input == 2) {
                                System.out.println("You pressed 2");
                                Sort.sortTimes();
                            }else if (input == 3) {
                                System.out.println("You pressed 3");
                                new Main_Menu();

                            }

                        }   while (input !=1 && input !=2 && input !=3);

                        System.out.println("Do you want to continue? If No, please press (N).");
                        char c = sc.nextLine().charAt(0);

                        if (c == 'N' || c == 'n') {
                            go = false;
                        }
                    }
                }else if (User_Input == 3)
                {
                    System.out.println("You pressed 3");
                    ShowList.outputAllShowsToTerminal();
                }
                else if (User_Input == 4)
                {
                    System.out.println("You pressed 4");
                    AddMethod.addShow();
                }
                else if (User_Input == 5)
                {
                    System.out.println("You pressed 5");
                    RemoveMethod.removeShow(); 
                }
                else if (User_Input == 6)
                {
                    System.out.println("You pressed 6");
                    RecommendMethod.recommendShow();
                }
                else if (User_Input == 7)
                {
                    System.out.println("You pressed 7");
                    UpdateMethod.updateShow();
                }else if (User_Input == 8) 
                {
                    System.out.println("You pressed 8");
                    BackUp.backupMethod();
                }else if (User_Input == 9)
                {
                    System.out.println("You pressed 9");
                    CryptoFile.encryptMethod();
                    System.exit(0);
                }

            } while (User_Input !=1 && User_Input !=2 && User_Input !=3 && User_Input != 4 && User_Input != 5 && User_Input != 6 && User_Input != 7 && User_Input != 8);

            System.out.println("---------------------------------------------------");
            System.out.println("Do you want to continue? If No, please press (N).");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') {
                CryptoFile.encryptMethod();
                System.exit(0);
            }
        }

    }

    static String input(String var)
    {  String inputLine = "";
        System.out.print(var);
       try
        {inputLine = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();
        }
        catch (Exception e)
        { String error = e.toString();
            System.out.println(error);
            inputLine = "";
        }
        return inputLine;
    }

    static char inputChar(String var)
    {  char result=(char)0;
        try
        {
            result=input(var).charAt(0);
        }
        catch (Exception e)
        {
            result = (char)0;
       }
        return result;
    }

}