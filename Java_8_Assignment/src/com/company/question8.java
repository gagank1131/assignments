package com.company;

interface ParentInterface {
    
    default String compute() {
        
        return "This is the default of Parent Interface";
        
    }
}

interface ChildInterface1 extends ParentInterface {
    default String compute() {
        return "This is the default of child 1";
    }
}

interface ChildInterface2 extends ParentInterface {
    default String compute() {
        return "This is the default of child 2";
    }
}


public class question8 implements ChildInterface1, ChildInterface2 {
    @Override
    public String compute() {
        return "This is the method implementation in class......";
    }
    
    
    public static void main(String[] args) {
        question8 ob = new question8();
        System.out.println(ob.compute());
        
    }
}
