package HomeWork_1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products = new ArrayList<>();



    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    
    /**
     * Категория товаров
     * @param name  имя категории
     * 
     */
    public Category(String name) {
        this.name = name;
    }



    public void addProduct(Product product){
        if (product == null)
        System.out.println("Добавляемый в категорию продукт не может быть пустым.");
        for (Product p : products)
            if (p.getName().equals(product.getName()))
            System.out.println("Добавляемый в категорию " + name + " продукт уже присутствует.");
        products.add(product);
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nКатегория: ").append(name).append("\n");
        
        for (Product p : products)
            sb.append("\t").append(p).append("\n");
        return sb.toString();
    }

}
