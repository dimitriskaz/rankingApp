 import java.util.Scanner​;

/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sort
{
    public static void sortRating() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Sort shows according to rating");

        int input;
        boolean go = true;
        while(go){
            do {
                System.out.println("==============================");
                System.out.println("In what order do you want to sort the shows?");
                System.out.println(" ");
                System.out.println("1. Ascending ");
                System.out.println("2. Discending");

                System.out.println(" ");
                System.out.println("Choose one of the above options: ");

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
                        System.out.println("!Please try again:");

                    }

                }

                if (input == 1)
                {
                    Show[] shows = ShowList.readShowList();
                    Show[] shows2 = new Show[shows.length];
                    System.out.println("*Shows sorted from Low quality to High quality*");
                    System.out.println(" ");
                    Show temp2;
                    for (int i = 0; i < shows.length ; i++){
                        for(int j=1; j < (shows.length-i); j++){
                            if(shows[j-1].getRating() > shows[j].getRating()){
                                //swap the elements!
                                temp2 = shows[j-1];
                                shows[j-1] = shows[j];
                                shows[j] = temp2;

                            }
                            for (int k = 0; k < shows.length ; k++) {

                                shows2[k] = shows[j];

                            }
                        }

                    }

                    for (int m = 0; m < shows2.length ; m ++){
                        System.out.println(shows[m].getTitle()+ " → " + shows[m].getRating());
                        System.out.println("--------------------------------");
                    }
                    go = false; 
                    System.out.println(" ");
                    System.out.println("Do you want to continue? If No, please press (N).");

                    char c = sc.next().charAt(0);

                    if (c == 'N' || c == 'n') {
                        CryptoFile.encryptMethod();
                        System.exit(0);
                    }else {
                        new Main_Menu();

                    }

                }else if (input == 2) {
                    Show[] shows = ShowList.readShowList();
                    Show[] shows2 = new Show[shows.length];
                    System.out.println("*Shows sorted from High quality to Low quality*");
                    System.out.println(" ");
                    Show temp2;
                    for (int i = 0; i < shows.length ; i++){
                        for(int j=1; j < (shows.length-i); j++){
                            if(shows[j-1].getRating() < shows[j].getRating()){
                                //swap the elements!
                                temp2 = shows[j-1];
                                shows[j-1] = shows[j];
                                shows[j] = temp2;

                            }
                            for (int k = 0; k < shows.length ; k++) {

                                shows2[k] = shows[j];

                            }
                        }

                    }

                    for (int m = 0; m < shows2.length ; m ++){
                        System.out.println(shows[m].getTitle()+ " → " + shows[m].getRating());
                        System.out.println("--------------------------------");
                    }
                    go = false; 
                    System.out.println(" ");
                    System.out.println("Do you want to continue? If No, please press (N).");

                    char c = sc.next().charAt(0);

                    if (c == 'N' || c == 'n') {
                        CryptoFile.encryptMethod();
                        System.exit(0);
                    }else {
                        new Main_Menu();

                    }

                } 
            }while (input !=1 && input !=2);
        }
    }
    
    public static void sortTimes()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Sort shows according to times aired");

        int input;
        boolean go = true;
        while(go){
            do {
                System.out.println("===================================");
                System.out.println("In what order do you want to sort the shows?");
                System.out.println(" ");
                System.out.println("1. Ascending ");
                System.out.println("2. Discending");

                System.out.println(" ");
                System.out.println("Choose one of the above options: ");

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
                        System.out.println("!Please try again:");

                    }

                }

                if (input == 1)
                {
                    Show[] shows = ShowList.readShowList();
                    Show[] shows2 = new Show[shows.length];
                    System.out.println("*Shows sorted from Least to Greatest Times Aired *");
                    System.out.println(" ");
                    Show temp2;
                    for (int i = 0; i < shows.length ; i++){
                        for(int j=1; j < (shows.length-i); j++){
                            if(shows[j-1].getT_Aired() > shows[j].getT_Aired()){
                                //swap the elements!
                                temp2 = shows[j-1];
                                shows[j-1] = shows[j];
                                shows[j] = temp2;

                            }
                            for (int k = 0; k < shows.length ; k++) {

                                shows2[k] = shows[j];

                            }
                        }

                    }

                    for (int m = 0; m < shows2.length ; m ++){
                        System.out.println(shows[m].getTitle()+ " → " + shows[m].getT_Aired());
                        System.out.println("--------------------------------");
                    }
                    go = false; 
                    System.out.println(" ");
                    System.out.println("Do you want to continue? If No, please press (N).");

                    char c = sc.next().charAt(0);

                    if (c == 'N' || c == 'n') {
                        CryptoFile.encryptMethod();
                        System.exit(0);
                    }else {
                        new Main_Menu();

                    }

                }else if (input == 2) {
                    Show[] shows = ShowList.readShowList();
                    Show[] shows2 = new Show[shows.length];
                    System.out.println("*Shows sorted from Greatest to Least Times Aired*");
                    System.out.println(" ");
                    Show temp2;
                    for (int i = 0; i < shows.length ; i++){
                        for(int j=1; j < (shows.length-i); j++){
                            if(shows[j-1].getT_Aired() < shows[j].getT_Aired()){
                                //swap the elements!
                                temp2 = shows[j-1];
                                shows[j-1] = shows[j];
                                shows[j] = temp2;

                            }
                            for (int k = 0; k < shows.length ; k++) {

                                shows2[k] = shows[j];

                            }
                        }

                    }

                    for (int m = 0; m < shows2.length ; m ++){
                        System.out.println(shows[m].getTitle()+ " → " + shows[m].getT_Aired());
                        System.out.println("--------------------------------");
                    }
                    go = false; 
                    System.out.println(" ");
                    System.out.println("Do you want to continue? If No, please press (N).");

                    char c = sc.next().charAt(0);

                    if (c == 'N' || c == 'n') {
                        CryptoFile.encryptMethod();
                        System.exit(0);
                    }else {
                        new Main_Menu();
                    }

                } 
            }while (input !=1 && input !=2);
        }
    }
    
    
    static String input(String var)
    {  String inputLine = "";
        System.out.print(var);
        try
        {
            inputLine = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();
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
