package src;

public interface PetStoreService {
    void doService(); // Метод для выполнения услуги
    String getServiceName(); // Метод для получения названия услуги
    int getServicePrice(); // Метод для получения цены услуги
    void displayServiceInfo(); // Метод для отображения информации об услуге
}