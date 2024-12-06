import java.util.ArrayList;
import java.util.List;

class Storehouse {
    List<Order> pizzas = new ArrayList<>();

    void addPizza(Order pizza) {
        pizzas.add(pizza);
        System.out.println("Заказ " + pizza.id + " Добавлена на склад");
    }

    Order getPizza() {
        if (pizzas.isEmpty()) {
            System.out.println("Склад пуст. Курьер ожидает");
            return null;
        }
        return pizzas.remove(0);
    }

    boolean isEmpty() {
        return pizzas.isEmpty();
    }
}
