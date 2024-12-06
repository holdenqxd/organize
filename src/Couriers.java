class Couriers {
    int bagMaxSize;
    String firstname;
    String lastname;

    public Couriers(String firstname, String lastname, int bagMaxSize) {
        this.bagMaxSize = bagMaxSize;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    void deliver(Storehouse storehouse) {
        int delivered = 0;
        while (delivered < this.bagMaxSize && !storehouse.isEmpty()) {
            Order order = storehouse.getPizza();
            if (order != null) {
                System.out.println("заказ " + order.id + ": Доставлен курьером: " + firstname + " " + lastname);
                delivered++;
            }
        }
    }
}
