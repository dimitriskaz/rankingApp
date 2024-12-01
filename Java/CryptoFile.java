
import net.codejava.crypto.*;

import java.io.File;
 
/**
 * A tester for the CryptoUtils class.
 * @author www.codejava.net
 * http://www.codejava.net/coding/file-encryption-and-decryption-simple-example
 */
public class CryptoFile {

    public static void decryptMethod()
    {
        String key = "Antonis TV shows";//Creates the symmetric-key (of 16 bytes) for decrypting file
        File decryptedFile = new File("theShowList.txt");//Declares the decrypted file
        File encryptedFile = new File("theShowList.encrypted");//Declares the encrypted file
         
         try {
            //Starting the program with an encrypted file, we decrypt it and delete the encrypted file
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);//Decrypt file
            encryptedFile.delete(); //Delete encrypted file
            
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    
    }
    
    public static void encryptMethod() {
        String key = "Antonis TV shows";//Creates the same key for encrypting the file
        File decryptedFile = new File("theShowList.txt");//Declares the decrypted file
        File encryptedFile = new File("theShowList.encrypted");//Declares the encrypted file
        
        try {
            //When closing the program we encrypt the decrypted file and delete the decrypted file
            CryptoUtils.encrypt(key, decryptedFile, encryptedFile); //Encrypt file
            decryptedFile.delete(); //Delete decrypted file

        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}