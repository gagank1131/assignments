

class Parent extends Grandparent {
    //instance block
    {
        System.out.println("instance - parent");
    }
    //constructor
    public Parent() {
        System.out.println("constructor - parent");
    }
    //static block
    static {
        System.out.println("static - parent");
    }
}

class Grandparent {
    //static block
    static {
        System.out.println("static - grandparent");
    }
    //instance block
    {
        System.out.println("instance - grandparent");
    }
    
    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {
    //constructor
    public Child() {
        System.out.println("constructor - child");
    }
    //static block
    static {
        System.out.println("static - child");
    }
    //instance block
    {
        System.out.println("instance - child");
    }
}



public class question12 {
    public static void main(String[] args) {
        Child child=new Child();
    }
}