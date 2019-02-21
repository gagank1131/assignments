package Coffee_shop;

import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    private Queue<Order> orders=new LinkedList<>();
    private Queue<Order>orderCompleted=new LinkedList<>();
    
    public void placeInOrderQueue(Order order){
        orders.add(order);
    }
    
    public Queue<Order> getOrderCompleted() {
        return orderCompleted;
    }
    public void prepareOrder(){
        /*gets order from the queue and prepares it and removes order from the queue */
        for(int i=0;i<orders.size();i++)
        {
            Order order=orders.remove();
            order.setOrderStatus(true);
            orderCompleted.add(order);
        }
    }
    
}
