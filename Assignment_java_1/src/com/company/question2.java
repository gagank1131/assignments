package com.company;

public class question2 {
    
    String name = "gagan kushwaha gagan ttn ttn ";
    
    
    public void countOccurrence() {
        
        String words[] = name.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            
            int numberOfOccurences = 0;
            
            for (int j = i + 1; j < words.length; j++) {
                
                if (words[i].equals(words[j])) {
                    numberOfOccurences++;
                    words[j] = "*";
                }
                
            }
            if (words[i] != "*") {
                System.out.println(words[i] + "=" + (numberOfOccurences + 1));
            }
            
        }
        
    }
    
    
    public static void main(String[] args) {
        
        question2 object = new question2();
        object.countOccurrence();
        
        
    }
}
