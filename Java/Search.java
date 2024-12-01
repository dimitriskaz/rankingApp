import java.util.Scanner​;

public class Search
{
    public static void searchTitle() 
    {

        Show[] shows = ShowList.readShowList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the show desired: ");
        String title = sc.nextLine();
        System.out.println("=====================================");
        boolean found = false;

        for(int i = 0; i < shows.length; i++) {
            if(shows[i].getTitle().equals(title)) {
                found = true;
                System.out.println("→Title: " + shows[i].getTitle());
                System.out.println("-------------------------------------");
                System.out.println("→ID: " + shows[i].getID());
                System.out.println("-------------------------------------");
                System.out.println("→Duration: " + shows[i].getDuration());
                System.out.println("-------------------------------------");
                System.out.println("→Production Company: " + shows[i].getP_Company());
                System.out.println("-------------------------------------");
                System.out.println("→Production Date: " + shows[i].getP_Date());
                System.out.println("-------------------------------------");
                System.out.println("→Rating: " + shows[i].getRating());
                System.out.println("-------------------------------------");
                System.out.println("→Times Aired: " + shows[i].getT_Aired());
                System.out.println("-------------------------------------");
                System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                System.out.println("-------------------------------------");
                System.out.println("→Cabinet: " + shows[i].getCabinet());

            }  
        }

        if (!found) {
            System.out.println("---------------------------------------------");
            System.out.println("The show that you have entered was not found.");
            System.out.println("---------------------------------------------");
            searchTitle();
        }

    }

    public static void searchType(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Search for a show according to specific type: ");

        int input;
        boolean go = true;
        while(go){
            do {
                System.out.println("=======================================================");
                System.out.println("What type of shows do you want to search for?");
                System.out.println("--------------------------------------------------------");
                System.out.println("1. Movie");
                System.out.println("2. Documentary");
                System.out.println("3. Entertainment show");
                System.out.println("4. Fashion show");
                System.out.println("5. Talent show");
                System.out.println("6. Serie");
                System.out.println("7. Sport show");
                System.out.println("8. Go back to the Main Menu");

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
                    System.out.println("You pressed 1");
                    Show[] shows = ShowList.readShowList();
                    String a = "MOVIE";
                    boolean found = false;

                    System.out.println("The movies available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }
                    System.out.println(" ");
                    System.out.println("Enter the title of the movie desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }

                }else if (input == 2) {
                    System.out.println("You pressed 2");
                    Show[] shows = ShowList.readShowList();
                    String a = "DOCUM";
                    boolean found = false;

                    System.out.println("The documentaries available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }
                    System.out.println(" ");
                    System.out.println("Enter the title of the dcoumentary desired:");
                    String title = sc.nextLine();
                    System.out.println("===========================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }

                }else if (input == 3) {
                    System.out.println("You pressed 3");
                    Show[] shows = ShowList.readShowList();
                    String a = "ENTER";
                    boolean found = false;

                    System.out.println("The entertainment shows available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }

                    System.out.println(" ");
                    System.out.println("Enter the title of the show desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }
                }else if (input == 4) {
                    System.out.println("You pressed 4");
                    Show[] shows = ShowList.readShowList();
                    String a = "FASHI";
                    boolean found = false;

                    System.out.println("The fashion shows available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }
                    System.out.println(" ");
                    System.out.println("Enter the title of the show desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }
                }else if (input == 5){
                    System.out.println("You pressed 5");
                    Show[] shows = ShowList.readShowList();
                    String a = "TALEN";
                    boolean found = false;

                    System.out.println("The talent shows available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }
                    System.out.println(" ");
                    System.out.println("Enter the title of the show desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }
                }else if (input == 6){
                    System.out.println("You pressed 6");
                    Show[] shows = ShowList.readShowList();
                    String a = "SERIE";
                    boolean found = false;

                    System.out.println("The series available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }
                    System.out.println(" ");
                    System.out.println("Enter the title of the serie desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }
                }else if (input == 7){
                    System.out.println("You pressed 7");
                    Show[] shows = ShowList.readShowList();
                    String a = "SPORT";
                    boolean found = false;

                    System.out.println("The sport shows available in the list are: ");
                    System.out.println(" ");
                    for(int i = 0; i < shows.length; i++) {
                        String temp = shows[i].getID().substring(0,5).toUpperCase();
                        if (temp.equals(a)) {
                            found = true;
                            System.out.println("→" + shows[i].getTitle());
                            System.out.println("---------------------------------------------");
                        }  
                    }

                    if (found != true){
                        System.out.println("              **Error: Not found!**              ");
                    }

                    System.out.println(" ");
                    System.out.println("Enter the title of the show desired:");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found2 = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found2 = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("-------------------------------------");
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("-------------------------------------");
                            System.out.println("→Duration: " + shows[i].getDuration());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("-------------------------------------");
                            System.out.println("→Production Date: " + shows[i].getP_Date());
                            System.out.println("-------------------------------------");
                            System.out.println("→Rating: " + shows[i].getRating());
                            System.out.println("-------------------------------------");
                            System.out.println("→Times Aired: " + shows[i].getT_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                            System.out.println("-------------------------------------");
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found2) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchTitle();
                    }
                }else if (input == 8){

                    System.out.println("You pressed 8");
                    new Main_Menu();
                }

            }   while (input !=1 && input !=2 && input !=3 && input != 4 && input != 5 && input !=6 && input !=7 );

            System.out.println(" ");
            System.out.println("Do you want to continue? If No, please press (N).");

            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') {
                CryptoFile.encryptMethod();
                System.exit(0);
            }else 
            {
                searchType();
            }
        } 

    }

    public static void searchCompany(){
        Show[] shows = ShowList.readShowList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for a Show according to production company's name: ");
        String p_company = sc.nextLine();
        System.out.println("===========================================================");
        boolean found = false;

        for(int i = 0; i < shows.length; i++) {
            if(shows[i].getP_Company().equals(p_company)) {
                found = true;
                System.out.println("→Production Company: " + shows[i].getP_Company());
                System.out.println("-------------------------------------");
                System.out.println("→ID: " + shows[i].getID());
                System.out.println("-------------------------------------");
                System.out.println("→Duration: " + shows[i].getDuration());
                System.out.println("-------------------------------------");
                System.out.println("→Title: " + shows[i].getTitle());
                System.out.println("-------------------------------------");
                System.out.println("→Production Date: " + shows[i].getP_Date());
                System.out.println("-------------------------------------");
                System.out.println("→Rating: " + shows[i].getRating());
                System.out.println("-------------------------------------");
                System.out.println("→Times Aired: " + shows[i].getT_Aired());
                System.out.println("-------------------------------------");
                System.out.println("→Last Date Aired: " + shows[i].getD_Aired());
                System.out.println("-------------------------------------");
                System.out.println("→Cabinet: " + shows[i].getCabinet());

            }  
        }

        if (!found) {
            System.out.println("---------------------------------------------");
            System.out.println("The show that you have entered was not found.");
            System.out.println("---------------------------------------------");
            searchCompany();
        }

    }

    public static void searchLocation(){
        Show[] shows = ShowList.readShowList();
        Scanner sc = new Scanner(System.in);

        int input;
        boolean go = true;
        while(go){
            do {
                System.out.println("=========================================");
                System.out.println("Search for the location of the DVD: ");
                System.out.println(" ");
                System.out.println("What detail of the show do you remember? ");
                System.out.println("-----------------------------------------");
                System.out.println("1. Title");
                System.out.println("2. ID");
                System.out.println("3. Production Company");
                System.out.println("4. Exit");
                System.out.println(" ");
                System.out.println("Choose one of the above options: ");

                while (true)
                {
                    try 
                    {	

                        input = Integer.parseInt(sc.nextLine());
                        System.out.println("------------------------------------");
                        break;

                    } catch (NumberFormatException nfe) 
                    {
                        System.out.println("**ERROR: Your input is not valid.**");
                        System.out.println("!Please try again:");

                    }

                }

                if (input == 1)
                {
                    System.out.println("Enter the title of the show: ");
                    String title = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getTitle().equals(title)) {
                            found = true;
                            System.out.println("→Title: " + shows[i].getTitle());
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchLocation();
                    }
                }else if (input == 2) {
                    System.out.println("Enter the ID of the show: ");
                    String id = sc.nextLine();
                    System.out.println("=====================================");
                    boolean found = false;

                    for(int i = 0; i < shows.length; i++) {
                        if (shows[i].getID().equals(id.toUpperCase())) {
                            found = true;
                            System.out.println("→ID: " + shows[i].getID());
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchLocation();
                    }

                }else if (input == 3) {
                    System.out.println("Enter the production company's name of the show: ");
                    String p_company = sc.nextLine();
                    boolean found = false;

                    for(int i = 0; i < shows.length; i++) {
                        if(shows[i].getP_Company().equals(p_company)) {
                            found = true;
                            System.out.println("→Production Company: " + shows[i].getP_Company());
                            System.out.println("→Cabinet: " + shows[i].getCabinet());

                        }  
                    }

                    if (!found) {
                        System.out.println("---------------------------------------------");
                        System.out.println("The show that you have entered was not found.");
                        System.out.println("---------------------------------------------");
                        searchLocation();
                    }

                } else if (input == 4) {
                    System.out.println("You pressed 4");
                    new Main_Menu();
                }
            }while (input !=1 && input !=2 && input !=3 );

            System.out.println(" ");
            System.out.println("Do you want to continue? If No, please press (N).");

            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') {
                CryptoFile.encryptMethod();
                System.exit(0);
            }else {
                searchLocation();
            }
        }
    }

    static String input(String var)
    {  String inputLine = "  ";
        System.out.print(var);
        try
        {
            inputLine = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();
        }
        catch (Exception e)
        { 
            String error = e.toString();
            System.out.println(error);
            inputLine = "";
       }
       return inputLine;
    }

    static char inputChar(String var)
    { char result=(char)0;
        try{
            result=input(var).charAt(0);
        }catch (Exception e)
        {
            result = (char)0;
      }
      return result;

    }
}