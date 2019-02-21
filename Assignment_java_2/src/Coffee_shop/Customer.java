package Coffee_shop;

public class Customer {
    
    private String customerName;
    private int tokenNo;
    private double amountPaid;
    
    public double getAmountPaid() {
        return amountPaid;
    }
    
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
    
    public int getTokenNo() {
        return tokenNo;
    }
    
    public void setTokenNo(int tokenNo) {
        this.tokenNo = tokenNo;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
