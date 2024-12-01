import net.codejava.crypto.*;

import java.io.File;
import java.io.*;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;

//Import libraries for backing up file.
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * This class contains the method of backing up the file with the shows purchased by the TV channel.
 * This method creates a new file with the data of the main file and is held independently from the main file.
 * It decrases the probability for data loss to occur.
 * 
 * @author (Dimitrios Kazantzis) 
 * @version 1.0
 * @since 2016-12-07
 */
public class BackUp
{
    static final String FILENAME = "theShowList.txt";//Determines the main file that contains the data (the shows purchased) 

    public static void backupMethod() {

        try 
        {
            Path source = Paths.get(FILENAME);//gets the data of the Main file
            Path target = Paths.get("Backup_" + FILENAME);//gets the data of the Back up file
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);//Copies the data of the main file to the back up file
                                                                            //replacing the existing data held in the back up file with the new one 
        } 
        catch (IOException e) 
        { //if any error occurs during the process, the progra, should inform the user
            System.out.println("Error backing up file.");
        }   

        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");

        int input;
        boolean go = true;
        while(go){
            do {

                System.out.println("What do you want to do with the Back_Up File?");
                System.out.println(" ");
                System.out.println("1. Encrypt ");
                System.out.println("2. Decrypt ");
                System.out.println("3. Exit ");

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
                    String key = "Mary has one cat";
                    File decryptedFile = new File("Backup_theShowList.txt");
                    File encryptedFile = new File("Backup_theShowList.encrypted");

                    try {

                        CryptoUtils.encrypt(key, decryptedFile, encryptedFile); //Encrypt file.
                        decryptedFile.delete(); //Delete decrypted file.

                    } catch (CryptoException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
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
                    String key = "Mary has one cat";
                    File decryptedFile = new File("Backup_theShowList.txt");
                    File encryptedFile = new File("Backup_theShowList.encrypted");

                    try {

            
                        //Starting the program with an encrypted file, we decrypt it and delete the encrypted file.
                        //When closing the program we encrypt the decrypted file and delete the decrypted file.

                        CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
                        encryptedFile.delete(); //Delete encrypted file.

                    } catch (CryptoException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
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

                } else if (input == 3) {
                    CryptoFile.encryptMethod();
                    System.exit(0);
                } 
            }while (input !=1 && input !=2);
        }
    }

}
