package src;
import java.util.ArrayList;
import java.util.List;

public class Storehouse {
    private List<Product> products;
    private int num_products;

    //Конструктор класса Storehouse
    public Storehouse() {
        products = new ArrayList<>(); // Инициализация списка продуктов
        num_products = 0;
    }

    // Добавление класса Product в класс Storehouse
    public void addProduct(Product product) {
        products.add(product); // Используем метод add для добавления продукта в список
        num_products++;
    }

    // Получение продукта по индексу
    public Product listProducts(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null; // Возвращаем null, если индекс вне диапазона
    }

    // Редактирование продукта по ID
    public void editProduct(int productId, String name, int price, int volume, int categoryId, int supplierId) {
        if (productId >= 0 && productId < products.size()) {
            products.get(productId).set(name, price, volume, categoryId, supplierId);
        } else {
            System.out.println("Продукт с таким ID не найден.");
        }
    }

    //Вывод данных класса
    public int getNum_products() {
        return num_products;
    }

    // Получение списка продуктов
    public List<Product> getProducts() {
        return new ArrayList<>(products); // Возвращаем копию списка продуктов
    }
}
