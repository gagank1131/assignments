package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class question9 {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println("Today's date is :" + date.toString());
        
        Locale china = new Locale(Locale.CHINA.getLanguage(), Locale.CHINA.getCountry());
        Locale germany = new Locale(Locale.GERMANY.getLanguage(), Locale.GERMANY.getCountry());
        Locale french = new Locale(Locale.FRANCE.getLanguage(), Locale.FRANCE.getCountry());
        Locale korea = new Locale(Locale.KOREA.getLanguage(), Locale.KOREA.getCountry());
        Locale japan = new Locale(Locale.JAPAN.getLanguage(), Locale.JAPAN.getCountry());
        
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, china);
        System.out.println("china :" + dateFormat.format(date));
        
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, germany);
        System.out.println("germany :" + dateFormat1.format(date));
        
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, french);
        System.out.println("france :" + dateFormat2.format(date));
        
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, korea);
        System.out.println("korea :" + dateFormat3.format(date));
        
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, japan);
        System.out.println("japan :" + dateFormat4.format(date));
        
    }
}
