public class question11 {
    
    public static void main(String[] args) {
        
        int s = 0;
        int t = 1;
        int i = 0;
        while (i < 10) {
            
            
            s = s + i;
            int j = i;
            
            while (j > 0) {
                
                t = t * (j - i);
                j--;
                
            }
            s = s * t;
            i++;
            System.out.println("T is " + t);
        }
        
        System.out.println("S is " + s);
    }
    
    
}
