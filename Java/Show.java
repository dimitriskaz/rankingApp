
/**
*Set details of Shows
*Get details of Shows
*
*@author(Dimitrios Kazantzis)
*
 */
import java.util.*;
public class Show
{
    /**
    * Setting the details of the shows:
    * 1. The title of the show
    * 2. The id of the show (which is unique for each)
    * 3. The duration of the show (it is neccessary for the client to know in order to manage the timelines of the channel)
    * 4. The name of the company that has produced the specific show
    * 5. The date that the show was produced (to determine whether it is an old or a new shows
    * 6. The rating of the show (an important variable that determines the quality of the show)
    * 7. The times that the show has been aired by the channel
    * 8. The location of the DVD of the show (the client stores the DVDs in a library with cabinets)
    * 9. The last time that the show was aired
    */
    
    private String title;
    private String id;
    private int duration;
    private String p_company;
    private String p_date;
    private int rating;
    private int t_aired;
    private String d_aired;
    private String cabinet;

    public Show(String t, String i, int d, String p_c, String p_d, int r, int t_a , String d_a, String c)
    {
        setTitle(t);
        setID(i);
        setDuration(d);
        setP_Company(p_c);
        setP_Date(p_d);
        setRating(r);
        setT_Aired(t_a);
        setD_Aired(d_a);
        setCabinet(c);
    }
    
    
   /**
    * This is the title property setter
    * 
    * @param title
    * 
    */
   public void setTitle(String t)
    {
        title = t;
    }
    
    /**
    * This is the id property setter
    * 
    * @param id
    * 
    */
   public void setID(String i)
    {
       id = i;
    }

    /**
    * This is the duration property setter
    * 
    * @param duration
    * 
    */
   public void setDuration(int d)
    {
        duration = d;
    }
    
    /**
    * This is the p_company property setter
    * 
    * @param p_copmany
    * 
    */
   public void setP_Company(String p_c)
    {
        p_company = p_c;
    }
    
    /**
    * This is the p_date property setter
    * 
    * @param p_date
    * 
    */
   public void setP_Date(String p_d)
    {
        p_date = p_d;
    }
    
    /**
    * This is the rating property setter
    * 
    * @param rating
    * 
    */
   public void setRating(int r)
    {
        rating = r;
    }
    
    /**
    * This is the t_aired property setter
    * 
    * @param t_aired
    * 
    */
   public void setT_Aired(int t_a)
    {
       t_aired = t_a;
    }
   
   /**
    * This is the d_aired property setter
    * 
    * @param d_aired
    * 
    */
   public void setD_Aired(String d_a)
    {
       d_aired = d_a;
    }
    
    /**
    * This is the cabinet property setter
    * 
    * @param cabinet
    * 
    */
   public void setCabinet(String c)
    {
        cabinet = c;
    }

    
    /**
    * This is the title property getter
    * 
    * @return title
    * 
    */
   public String getTitle()
    {
        return title;
    }
    
   /**
    * This is the id property getter
    * 
    * @return id
    * 
    */ 
    public String getID()
    {
        return id;
    }
   
   /**
    * This is the duration property getter
    * 
    * @return duration
    * 
    */
     public int getDuration()
    {
        return duration;
    }
    
    
   /**
    * This is the p_company property getter
    * 
    * @return p_company
    * 
    */
   public String getP_Company()
    {
        return p_company;
    }
    
    /**
    * This is the p_date property getter
    * 
    * @return p_date
    * 
    */
   public String getP_Date()
    {
        return p_date;
    }
    
    /**
    * This is the rating property getter
    * 
    * @return rating
    * 
    */
   public int getRating()
    {
        return rating;
    }
    
   /**
    * This is the t_ aired getter
    * 
    * @return t_aired
    * 
    */
   public int getT_Aired()
    {
        return t_aired;
    }
    
   /**
    * This is the d_ aired getter
    * 
    * @return d_aired
    * 
    */
   public String getD_Aired()
    {
        return d_aired;
    }
    
    
    /**
    * This is the cabinet property getter
    * 
    * @return cabinet 
    * 
    */
   public String getCabinet()
    {
        return cabinet;
    }
}
