package com.company.Bank_Question;

public class Main {
    public static void main(String[] args) {
        
        ICICI icici = new ICICI(10,500,500000);
        BOI boi = new BOI(15,548,1547831);
        SBI sbi  = new SBI(9,900,789879);
        
        System.out.println("Details of ICICI");
        icici.getDetails();
        System.out.println("Details of BOI");
        boi.getDetails();
        System.out.println("Details of SBI");
        sbi.getDetails();
        
    }

    
}
