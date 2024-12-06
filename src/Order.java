class Order {
    int id;
    String status = "Заказ принят";

    public Order(int id) {
        this.id = id;
    }

    void setStatus(String status) {
        this.status = status;
        System.out.println("Заказ " + id + ":" + status);
    }
}
