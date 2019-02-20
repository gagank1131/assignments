import java.util.Scanner;

public class question7 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Seconds");
        int seconds = sc.nextInt();
        Convert(seconds);
    }
    
    private static void Convert(int seconds) {
        
        int day = seconds / (24 * 3600);
        
        seconds = seconds % (24 * 3600);
        int hour = seconds / 3600;
        
        seconds %= 3600;
        int minutes = seconds / 60;
        
        seconds %= 60;
        int second = seconds;
        
        System.out.println("Days :"+day);
        System.out.println("Hours :"+hour);
        System.out.println("Minutes :"+minutes);
        System.out.println("Seconds :"+second);
    }
}
