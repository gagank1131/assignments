class Student implements Cloneable {
    
    private String FirstName;
    private String LastName;
    
    public String getFirstName() {
        return FirstName;
    }
    
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    
    public String getLastName() {
        return LastName;
    }
    
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    
    public Student(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
    
    public Student(Student student) {
        FirstName = student.FirstName;
        LastName = student.LastName;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}

public class copyConstructor {
    
    
    public static void main(String[] args) {
        try {
            
            
            Student student1 = new Student("Gagan", "Kushwaha");
            Student student2 = new Student(student1);
            Student student3 = (Student) student1.clone();      //by overriding clone() of object and casting the return to (Student)
            
            System.out.println("first name student 1  : " + student1.getFirstName());
            System.out.println("first name student 2 : " + student2.getFirstName());
            System.out.println("first name student 3 : " + student3.getFirstName());
            
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }
}
