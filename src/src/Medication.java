package src;

class Medication implements PetStoreService {
    private String medicationType; // Тип лечения
    private int price; // Цена лечения

    //Конструктор
    public Medication(String medicationType, int price) {
        this.medicationType = medicationType;
        this.price = price;
    }

    public void doService() {
        System.out.println("Лечение животного.");
    }

    public String getServiceName() {
        return "Болезнь: " + medicationType;
    }

    public int getServicePrice() {
        return price;
    }

    public void displayServiceInfo() {
        System.out.println(getServiceName() + ", Цена: " + price);
    }
}
