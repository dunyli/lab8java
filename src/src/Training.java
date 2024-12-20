package src;

public class Training implements PetStoreService {
    private String trainingType; // Тип обучения (например, базовое, продвинутое)
    private int price;           // Цена обучения

    //Конструктор
    public Training(String trainingType, int price) {
        this.trainingType = trainingType;
        this.price = price;
    }

    public void doService() {
        System.out.println("Обучение животного.");
    }

    public String getServiceName() {
        return trainingType + " обучение";
    }

    public int getServicePrice() {
        return price;
    }

    public void displayServiceInfo() {
        System.out.println(getServiceName() + ", Цена: " + price);
    }
}
