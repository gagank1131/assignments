package Coffee_shop;

public class Order {
    private int tokenNo;
    private int orderPrice;
    private boolean orderStatus;
    
    public int getOrderPrice() {
        return orderPrice;
    }
    
    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
    
    public void setOrderStatus(boolean b) {
        orderStatus = b;
    }
    
    public int getTokenNo() {
        return tokenNo;
    }
    
    public void setTokenNo(int tokenNo) {
        this.tokenNo = tokenNo;
    }
}
