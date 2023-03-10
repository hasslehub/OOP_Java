package HomeWork_1;

import java.util.ArrayList;
import java.util.List;

// Создать класс User, содержащий логин, пароль и объект класса Basket.

public class User {
    static List<String> names = new ArrayList<String>();
    private String login;
    private String password;
    private Basket backet = new Basket();

    public User(String login, String password) {
        if (login == null || login.isBlank()) {
            System.out.println("Логин пользователя не может быть пустым.");
        }
        if (password == null || password.isBlank()) {
            System.out.println("Пароль пользователя не может быть пустым.");
        }
        if (names.indexOf(login) != -1) {
            System.out.println("Пользователь с таким именем уже существует.");
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean addProduct(Product product, Integer quanty) {
        if (product.getQuantity() < quanty) {
            System.out.println(login + ": Вы выбрали " + quanty + ", больше чем в наличии " + product.getQuantity());
            return false;
        }
        else {
            backet.addBasket(product, quanty);
            System.out.println(String.format("%s: В корзину добавлен %s - %d", login, product.getName(), quanty));
            return true;
        }
    }

    @Override
    public String toString() {
        if (backet.viewBasket() > 0) {
            return "\n" + login + " " + backet;
        } 
        else {
            return "Корзина " + login + " пуста.\n";
        }
    }
}