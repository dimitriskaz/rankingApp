
/**
 * Write a description of class AddRemoveMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class AddMethod
{
    public static void addShow() {

        ShowList sl;
        
        sl = new ShowList();

        Input_Show addShow = new Input_Show();
        Show b = addShow.showEntry();
        

        sl.writeToShowList(b);
        
        System.out.println("");

    }

}
