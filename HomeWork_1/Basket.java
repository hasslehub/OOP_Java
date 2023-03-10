package HomeWork_1;

import java.util.HashMap;
import java.util.Map;

// Создать класс Basket, содержащий массив купленных товаров.

public class Basket {
    private Map<Product, Integer> order = new HashMap<Product, Integer>();

    /**
     * Добавление товаров в корину
     * 
     * @param product товар
     * @param value   количество
     * 
     */
    public void addBasket(Product product, Integer value) {
        // После покупки у пользователя добавляется товар, а из магазина - удаляется
        product.purchase(value);
        order.put(product, value);
    }

    public int viewBasket() {
        return order.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Корзина: ").append("\n");
        for (Product p : order.keySet()) {
            sb.append("\t")
                    .append(p.getName()).append(" ")
                    .append(order.get(p))
                    .append(" шт.  ")
                    .append("   осталось ")
                    .append(p.getQuantity())
                    .append(" шт.\n");
        }
        return sb.toString();
    }

}
