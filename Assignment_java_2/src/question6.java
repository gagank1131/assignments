public class question6 {
    
    public static void main(String[] args) {
        
        try {
            int number[] = new int[5];
            
            number[5] = 30 / 0;
            
        } catch (ArithmeticException e) {
            
            System.out.println("Arithmetic Exception occurs");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Array Index Out of bounds occurs");
            
        } finally {
            
            System.out.println("This block will executes no matter what , regardless of the catch block ");
        }
        
    }
}
