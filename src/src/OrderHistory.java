package src;
import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<Order> orders;
    private int orderCount;

    //Конструктор класса OrderHistory
    public OrderHistory() {
        orders = new ArrayList<>(); // Инициализация списка заказов
        orderCount = 0;
    }
    //Добавление класса Order в класс OrderHistory
    public void addOrder(Order order) {
        orders.add(order); // Добавляем заказ в список
    }

    public Order listOrders(int index) {
        if (index >= 0 && index < orders.size()) {
            return orders.get(index);
        }
        return null; // Возвращаем null, если индекс вне диапазона
    }

    public int getOrderCount() {
        return orderCount;
    }

    // Получение списка всех заказов
    public List<Order> getOrders() {
        return new ArrayList<>(orders); // Возвращаем копию списка заказов
    }
}
