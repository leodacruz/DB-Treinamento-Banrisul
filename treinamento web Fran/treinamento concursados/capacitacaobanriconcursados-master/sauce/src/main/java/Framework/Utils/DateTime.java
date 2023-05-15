package Framework.Utils;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    
    public static String  getDateTimeFormatReport() {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date now = new Date();
        return dateFormat.format(now);
    }
    
   public static String getDateTimeFormatScreenshot() {
       
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyy_hh'h'mm'm's's'");
       LocalDateTime localTime = LocalDateTime.now();
       return dateTimeFormatter.format(localTime);
   } 

}
