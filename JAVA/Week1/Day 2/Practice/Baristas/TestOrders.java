import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1=new Item("cappuccino",4.5);
        Item item2=new Item("latte",2.5);
        Item item3=new Item("express",2.1);
        Item item4=new Item("allongé",3.1);
        // Order variables -- order1, order2 etc.
        Order order1= new Order();
        Order order2= new Order();
        Order order3= new Order("ahmed");
        Order order4= new Order("abdrahim");
        Order order5= new Order("nawfel");
        order1.addItem(item1);
        order1.addItem(item4);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item4);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item1);
        order5.addItem(item4);
        order5.addItem(item3);
        order2.setReady(true);
        order5.setReady(true);
        System.out.printf(order3.getName()+" : "+order3.getStatusMessage()+"\n");
        System.out.printf(order2.getName()+" : "+order2.getStatusMessage()+"\n");
        System.out.printf(order4.getName()+" : "+order4.getStatusMessage()+"\n");
        System.out.printf(order5.getName()+" : "+order5.getStatusMessage()+"\n");
        System.out.println(order3.getName()+" the total is : "+order3.getOrderTotal() +" \n");
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}