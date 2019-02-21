package Coffee_shop;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier {
    
    private String cashierName;
    private Barista barista;
    static int counter;
    private Queue<Customer> customers = new LinkedList<>();
    private double orderMoney;
    
    public Barista getBarista() {
        return barista;
    }
    
    public void setBarista(Barista barista) {
        this.barista = barista;
    }
    
    public double getOrderMoney() {
        return orderMoney;
    }
    
    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }
    
    public String getCashierName() {
        return cashierName;
    }
    
    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
    
    public void createOrder() {
        counter++;
        Order order = new Order();
        this.setOrderMoney(order.getOrderPrice());
        
        Customer customer = new Customer();
        customer.setAmountPaid(order.getOrderPrice());
        customers.add(customer);
        order.setTokenNo(counter);
        customer.setTokenNo(counter);
        barista.placeInOrderQueue(order);
    }
}
