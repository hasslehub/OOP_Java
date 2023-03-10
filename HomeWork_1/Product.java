package HomeWork_1;

public class Product {
    private String name;
    private int price;
    private int rating;
    private int quantity;


    public Product(String name, int price, int rating, int quantity) {
        if (name == null || name.isBlank()) {
            System.out.println("Наименование товара не может быть пустым.");
        }
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = (quantity < 0) ? 0 : quantity; // проверка на отрицательное значение
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    // После покупки кол-во товара уменьшаем
    public void purchase(int quantity){
        if (this.quantity - quantity < 0){
            System.out.println("Товара меньше, чем требуется.");
        }
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s ,  цена: %d ,  кол-во: %d ,  рейтинг: %d  ",
                name, price, quantity, rating);
    }
}
