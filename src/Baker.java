import java.util.ArrayList;
import java.util.List;

class Baker {
    List<Order> orders;
    String firstname;
    String lastname;

    public Baker(String firstname, String lastname, List<Order> orders) {
        this.orders = orders;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    void bake(Storehouse storehouse) {
        for (Order order : orders) {
            order.setStatus("Готов пекарем: " + firstname + " " + lastname);
            storehouse.addPizza(order);
        }
    }
}
