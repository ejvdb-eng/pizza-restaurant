import java.util.List;
import java.util.ArrayList;

public class Order{

    protected List<Food> ordered;
    
    public Order(){
        ordered = new ArrayList<>();
    }

    public void addFood(Food food){
        ordered.add(food);
    }

    public int total(){
        int total = 0;
        for(Food food : ordered){
            total = total + food.getPrice();
        }
        return total;
    }

    public boolean payWith(CreditCard card){
        boolean paymentSuccesful = card.withdraw(this.total());

        if(!paymentSuccesful){
            System.out.println("ERROR: Payment failed");
        }
        return paymentSuccesful;
    }

    public void display(){
        for(Food food : ordered){
            food.display();
        }
        
        System.out.print(total() + " kr TOTAL");
    } 
}
