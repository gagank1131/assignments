import java.util.Scanner;

public class question2 {
    
    public void Sort(String string) {
        
        char[] arr = string.toCharArray();
        char temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
                
            }
            
        }
        //to print the String
        System.out.print("The sorted String is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        question2 object = new question2();
        System.out.println("Enter String : ");
        String userString = sc.nextLine();
        object.Sort(userString);
        
    }
    
}
