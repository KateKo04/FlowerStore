package client;


import delivery.Delivery;
import flowers.Flower;
import flowers.FlowerPack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import payment.Payment;
import skeletons.Item;

import java.util.LinkedList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Order {
    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;

    public boolean setPaymentStrategy(Payment payment){
        this.payment = payment;

        System.out.println("Payment strategy is set successfully!");
        return true;
    }

    public boolean setDeliveryStrategy(Delivery payment){
        this.delivery = delivery;

        System.out.println("Delivery strategy is set successfully!");
        return true;
    }

    public int calculateTotalPrice(){
        int price = 0;
        for (int i=0; i<items.size(); i++){
            price += items.get(i).getPrice();
        }
        return price;
    }

    public static String processOrder(){
        return "Order in process";
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new FlowerPack(new Flower(), 7));
    }


}
