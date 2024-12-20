package src;

public class Grooming implements PetStoreService {
    private String petType; // Тип животного
    private int price;      // Цена стрижки

    //Конструктор
    public Grooming(String petType, int price) {
        this.petType = petType;
        this.price = price;
    }
    public void doService() {
        System.out.println("Стрижка животного.");
    }

    public String getServiceName() {
        return "Стрижка для " + petType;
    }
    public int getServicePrice() {
        return price;
    }
    public void displayServiceInfo() {
        System.out.println(getServiceName() + ", Цена: " + price);
    }
}
