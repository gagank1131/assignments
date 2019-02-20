import java.util.Scanner;

class InvalidAgeException extends Exception{
    
    
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class CustomException {
    
    
    static void Validate(int age)throws InvalidAgeException{
        
        if(age<18){
            
            throw new InvalidAgeException("invalid");
        }
        else{
            System.out.println("The User can register ");
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
    
        try {
            Validate(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Occurred :"+e);
            
        }
    
    }
}
