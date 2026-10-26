import java.util.List;
import java.util.ArrayList;


public class Pizza extends Food {

    protected List<String> toppings;

    public Pizza(){
        super("Pizza", 45);
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
        price += 10;
    }

    public void setName(String name){
        super.name = name;
    }

    @Override
    public void display(){
        System.out.print(price + " kr " + name);
        if (toppings.isEmpty()) {
            System.out.print(" { }");
        } else {
            System.out.print(" { ");
            String separator = "";
            for (String topping : toppings) {
                System.out.print(separator);
                System.out.print(topping);
                separator = ", ";
            }
            System.out.print(" }");
        }   
        System.out.println();     
    }


}
