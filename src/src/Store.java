package src;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Client> clients;
    private int num_clients;
    private List<Category> categories;
    private int num_categories;
    private List<Supplier> suppliers;
    private int num_suppliers;

    //Конструктор класса Store
    public Store() {
        clients = new ArrayList<>(); // Инициализация списка клиентов
        categories = new ArrayList<>(); // Инициализация списка категорий
        suppliers = new ArrayList<>(); // Инициализация списка поставщиков
        num_clients = 0;
        num_categories = 0;
        num_suppliers = 0;
    }
    //Добавление класса Client в класс Store
    public void addClient(Client client) {
        clients.add(client); // Используем метод add для добавления в список
        num_clients++;
    }
    //Добавление класса Category в класс Store
    public void addCategory(Category category) {
        categories.add(category); // Используем метод add для добавления в список
        num_categories++;
    }
    //Добавление класса Supplier в класс Store
    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier); // Используем метод add для добавления в список
        num_suppliers++;
    }

    //Вывод данных класса
    public int getNum_suppliers() {
        return num_suppliers;
    }
    //Вывод данных класса
    public int getNum_categories() {
        return num_categories;
    }
    //Вывод данных класса
    public int getNum_clients() {
        return num_clients;
    }

    public Client listClients(int index) {
        if (index >= 0 && index < clients.size()) {
            return clients.get(index);
        }
        return null; // Возвращаем null, если индекс вне диапазона
    }

    public Supplier listSuppliers(int index) {
        if (index >= 0 && index < suppliers.size()) {
            return suppliers.get(index);
        }
        return null; // Возвращаем null, если индекс вне диапазона
    }

    public Category listCategories(int index) {
        if (index >= 0 && index < categories.size()) {
            return categories.get(index);
        }
        return null; // Возвращаем null, если индекс вне диапазона
    }
    // Получение списка категорий
    public List<Category> getCategories() {
        return new ArrayList<>(categories); // Возвращаем копию списка продуктов
    }
}
