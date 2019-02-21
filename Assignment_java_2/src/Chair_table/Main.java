package Chair_table;

public class Main {
    
    public static void main(String[] args) {
        Chair chair1 = new Chair("metal");
        chair1.result();
        System.out.println();
        Chair chair2 = new Chair("wood");
        chair2.result();
        System.out.println();
        Table t1 = new Table("metal");
        t1.result();
        System.out.println();
        Table t2 = new Table("wood");
        t2.result();
    }
}
