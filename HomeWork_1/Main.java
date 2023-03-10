package HomeWork_1;

public class Main {
    public static void main(String[] args) {

        //Создать несколько объектов класса Категория.
        Category veganCategory = new Category("Овощи");
        Product potatoes = new Product("Картошка", 50, 8, 1000);
        Product carrot = new Product("Морковь", 30, 5, 300);
        Product cabbage = new Product("Капуста", 20, 5, 200);

        // заполнить категрии товаром
        veganCategory.addProduct(potatoes);
        veganCategory.addProduct(carrot);
        veganCategory.addProduct(cabbage);
        

        Category groceryCategory = new Category("Бакалея");
        Product tea = new Product("Чай", 350, 9, 300);
        Product coffee = new Product("Кофе", 600, 7, 500);
        Product sugar = new Product("Сахар", 100, 8, 400);

        // заполнить категрии товаром
        groceryCategory.addProduct(tea);
        groceryCategory.addProduct(coffee);
        groceryCategory.addProduct(sugar);


        Category dairyCategory = new Category("Молоко");
        Product milk = new Product("Молоко", 100, 7, 300);
        Product curd = new Product("Творог", 450, 6, 30);
        Product yogurt = new Product("Йогурт", 40, 5, 100);

        // заполнить категрии товаром
        dairyCategory.addProduct(milk);
        dairyCategory.addProduct(curd);
        dairyCategory.addProduct(yogurt);

        // Вывод в консоль каталогов товаров
        System.out.println(veganCategory.toString());
        System.out.println(groceryCategory.toString());
        System.out.println(dairyCategory.toString());


        //Создать несколько объектов класса User.
        User buyer1 = new User("User1","tfdt1");
        User buyer2 = new User("User2","dsfhh");


        // заполнить корзину товарами
        buyer1.addProduct(potatoes, 20);
        buyer1.addProduct(yogurt, 5);
        buyer2.addProduct(milk, 2);

        // отобразить корзины покупателей
        System.out.println(buyer1.toString());
        System.out.println(buyer2.toString());
    }
    
}
