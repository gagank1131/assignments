import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world ..");
        
        Date now = new Date();
        Locale locale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("GB")
                .build();
        
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale);
    
        System.out.println(formatter.format(now));
        
    }
}
