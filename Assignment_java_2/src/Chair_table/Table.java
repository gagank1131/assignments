package Chair_table;

public class Table extends Furniture {
    
    @Override
    public boolean getStressTestStatus() {
        return (type.equals("metal"));
    }
    
    @Override
    public boolean getFireTestStatus() {
        return (type.equals("metal"));
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                '}';
    }
    
    public Table(String type) {
        this.type = type;
    }
    
    @Override
    public void result() {
        if (getStressTestStatus()) {
            System.out.println(this + " passed stress test");
        } else {
            System.out.println(this + " failed stress test");
        }
        if (getFireTestStatus()) {
            System.out.println(this + " passed fire test");
        } else {
            System.out.println(this + " failed fire test");
        }
    }
    
}
