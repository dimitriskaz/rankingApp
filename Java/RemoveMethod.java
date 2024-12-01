/**
 * The client removes a show from the list.
 **/

import java.util.Scanner​;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 

import java.io.*;

public class RemoveMethod

{
    public static void removeShow() {
        Show[] shows = ShowList.readShowList();
        boolean found = false; 
        System.out.println("Type in one of the following shows to remove:");
        System.out.println(" ");

        for(int i = 0; i < shows.length; i++) {
            System.out.println("→" + shows[i].getTitle());
        }

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Enter the title: ");
        String title = sc.next();
        int indexToRemove = -1;

        for(int i = 0; i < shows.length; i++) {
            if(title.equals(shows[i].getTitle())) {
                found = true; 
                indexToRemove = i;
                break;
            }else {
                found = false;
            }
        }

        Show[] showsNew = new Show[shows.length-1];
        String FILENAME = "theShowList.txt";
        int j = 0;

        for(int i = 0; i < shows.length; i++) {
            if (i != indexToRemove && found == true) {

                showsNew[j] = shows[i];
                j++;
            }
        }

        if (found = true){

            try {
                //set up data file for writing
                FileWriter theShowList = new FileWriter(FILENAME);
                PrintWriter outFile = new PrintWriter(theShowList);      

                outFile.println(showsNew.length);

                for(int i=0; i<showsNew.length; i++) {
                    Show s = showsNew[i];
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
            removeShow();
        }
    }
}
