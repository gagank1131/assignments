import java.util.Scanner;

public class question8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String myString = sc.nextLine();
        
        while (!myString.equals("done")) {
            
            if (myString.charAt(0) == myString.charAt(myString.length() - 1)) {
                System.out.println("First and last characters are the same ");
            } else {
                System.out.println("First and last charcaters are not same ");
            }
            myString = sc.nextLine();
        }
    }
}
