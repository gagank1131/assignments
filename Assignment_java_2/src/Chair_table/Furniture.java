package Chair_table;

abstract class Furniture {
    
    protected String type;
    
    abstract boolean getStressTestStatus();
    
    abstract boolean getFireTestStatus();
    
    abstract void result();
    
    abstract String getType();
}
