package com.company;
import java.util.Stack;

class myStack {
    
    Stack<Integer> stack;
    Integer minElement;
    
    public myStack() {
        stack = new Stack<Integer>();
    }
    
    public void peek() {
        
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty ....");
        }
        Integer t = stack.peek();
        if (t < minElement) {
            System.out.println("Top most element is :" + minElement);
        } else
            System.out.println("Top most element is :" + t);
    }
    
    public void push(Integer i) {
        
        if (stack.isEmpty()) {
            minElement = i;
            stack.push(i);
            System.out.println("Element inserted :" + i);
            
            return;
        }
        
        if (i < minElement) {
            stack.push(2 * i - minElement);
            minElement = i;
            
        } else
            stack.push(i);
        
        System.out.println("Element inserted :" + i);
    }
    
    
    public void pop() {
        
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, cannot pop an element");
            return;
        }
        Integer t = stack.pop();
        
        if (t < minElement) {
            
            System.out.println("element removed :" + minElement);
            
            minElement = 2 * minElement - t;
            
        } else
            System.out.println("element removed :" + t);
    }
    
    public void getMinElement() {
        
        if (stack.isEmpty()) {
            System.out.println("stack is empty..");
        } else
            System.out.println("min element is :" + minElement);
        
    }
    
    
}


public class question7 {
    
    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.getMinElement();
        stack.pop();
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(8);
        stack.getMinElement();
        stack.peek();
        stack.pop();
        stack.getMinElement();
        stack.pop();
        stack.getMinElement();
        
        
    }
}
