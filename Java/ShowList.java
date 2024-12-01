
/**
 * class ShowFile
 * This class reads the file/list where all the shows purchased are stored.
 * In addition, this class is capable of writing a new show to the file.
 */

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 
public class ShowList
{ 
    static final String FILENAME = "theShowList.txt";

    public static Show[] readShowList()
    { 
        Show[] shows = null;

        try {
            FileReader theShowList = new FileReader(FILENAME);
            BufferedReader input = new BufferedReader(theShowList);

            String line;
            int i = 0;

            line = input.readLine();
            int elements = Integer.parseInt(line);
            shows = new Show[elements];

            while ((line = input.readLine()) != null)
            {

                String[] showDetails = line.split(":");
                String title = showDetails[0];
                String id = showDetails[1];
                int duration = Integer.parseInt(showDetails[2]);
                String p_company = showDetails[3];
                String p_date = showDetails[4];
                int rating = Integer.parseInt(showDetails[5]);
                int t_aired = Integer.parseInt(showDetails[6]);
                String d_aired = showDetails[7];
                String cabinet = showDetails[8];

                shows[i] = new Show(title, id, duration, p_company, p_date, rating, t_aired, d_aired, cabinet);

                i++;
            }
            /**
            System.out.println("The shows stored in the list are the following:");

            for(int j=0; j<shows.length; j++) {
                System.out.println();
                if (shows[j] != null) {
                    System.out.println(shows[j].getTitle() 
                        + ":" 
                        + shows[j].getID() 
                        + ":"
                        + shows[j].getDuration()
                        + ":"
                        + shows[j].getP_Company()
                        + ":"
                        + shows[j].getP_Date()
                        + ":"
                        + shows[j].getRating()
                        + ":"
                        + shows[j].getT_Aired()
                        + ":"
                        + shows[j].getCabinet()
                        );
                } else {
                    break;
                }

                System.out.println("=================================");
                input.close();
            } 
                 */
        }catch (Exception e) 
        {
            String err = e.toString();

            //System.out.println("");
            //System.out.println("The list does not exist or cannot be reached.");
            System.out.println("");

        }

        return shows;
    }

    public static void writeToShowList(Show b)
    {
        Show[] shows = readShowList();
        Show[] showsWithAddedShow;

        if (shows != null) {

            showsWithAddedShow = new Show[shows.length+1];

            for (int i=0; i < shows.length; i++)  {

                showsWithAddedShow[i] = shows[i];

            }

            showsWithAddedShow[showsWithAddedShow.length-1] = b;
        }

        else {
            showsWithAddedShow = new Show[1];
            showsWithAddedShow[0] = b;
        }

        writeShowsToShowList(showsWithAddedShow);
    }

    public static void writeShowsToShowList(Show[] shows)
    {
        PrintWriter output = null;

        try {

            FileWriter theShowList = new FileWriter(FILENAME);
            output = new PrintWriter(theShowList);
            

        } catch (Exception e) {
            String err = e.toString();
            System.out.println("");
            System.out.println("The file can not be created.");
            System.out.println("");

        }

        if (shows != null && shows.length != 0) {

            output.println (shows.length);

            for(int i=0; i < shows.length; i++) {
                Show temp = shows[i];

                String title = temp.getTitle();
                String id = temp.getID();
                int duration = temp.getDuration();
                String p_company = temp.getP_Company();
                String p_date = temp.getP_Date();
                int rating = temp.getRating();
                int t_aired = temp.getT_Aired();
                String d_aired = temp.getD_Aired();
                String cabinet = temp.getCabinet();

                output.print(title + ":");
                output.print(id + ":");
                output.print(duration + ":");
                output.print(p_company + ":");
                output.print(p_date + ":");
                output.print(rating + ":");
                output.print(t_aired + ":");
                output.print(d_aired + ":");
                output.println(cabinet);
            }
            
        } 
        
        output.close();
    }

    public static void outputAllShowsToTerminal()
    {
        Show[] shows = null;

        shows = readShowList();

        if(shows != null) {
            if(shows.length ==0) {
                System.out.println("");
                System.out.println("The list is empty...");
                System.out.println("");
            }
            for (int i=0; i < shows.length; i++) {
                Show temp = shows[i];

                String title = temp.getTitle();
                String id = temp.getID();
                int duration = temp.getDuration();
                String p_company = temp.getP_Company();
                String p_date = temp.getP_Date();
                int rating = temp.getRating();
                int t_aired = temp.getT_Aired();
                String d_aired = temp.getD_Aired();
                String cabinet = temp.getCabinet();

                System.out.println("");
                System.out.println("===========================");
                System.out.println("Title: " + title);
                System.out.println("ID: " + id);
                System.out.println("Duration: " + duration);
                System.out.println("Production Company: " + p_company);
                System.out.println("Production Date: " + p_date);
                System.out.println("Rating: " + rating);
                System.out.println("Times Aired: " + t_aired);
                System.out.println("Last Date Aired: " + d_aired);
                System.out.println("Cabinet: " + cabinet);
                System.out.println("============================");

            }
        }else {
            System.out.println("");
            System.out.println("There are no shows in the list");
            System.out.println("");

        }
    } 
}

