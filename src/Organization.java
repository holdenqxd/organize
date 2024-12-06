import java.util.ArrayList;
import java.util.List;

public class Organization {
    public static void main(String[] args) {
        int ordersCount = 12;
        int bagMaxSize = 6;  
        List<Order> ordersList = new ArrayList<>();
        for (int i = 1; i <= ordersCount; i++) {
            ordersList.add(new Order(i));
        }


        Storehouse storehouse = new Storehouse();

        List<Baker> bakers = new ArrayList<>();
        bakers.add(new Baker("Ахлажон", "Бабиев", new ArrayList<>(ordersList)));
        bakers.add(new Baker("Кристофор", "Колумб", new ArrayList<>(ordersList)));
        bakers.add(new Baker("Игнатий", "Повсекакий", new ArrayList<>(ordersList)));

        List<Couriers> couriers = new ArrayList<>();
        couriers.add(new Couriers("Литр", "Энджера", bagMaxSize));
        couriers.add(new Couriers("Ахмед", "Венгалби", bagMaxSize));

        for (Baker baker : bakers) {
            baker.bake(storehouse);
        }
        for (Couriers courier : couriers) {
            courier.deliver(storehouse);
        }
    }
}