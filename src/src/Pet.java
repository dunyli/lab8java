package src;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private int years;
    private List<PetStoreService> items;

    public Pet(String name, int years) {
        this.name = name;
        this.years = years;
        this.items = new ArrayList<>();
    }

    public void performAllServices() {
        for (PetStoreService service : items) {
            service.doService();
        }
    }

    public void performAllServiceInfo() {
        for (PetStoreService service : items) {
            service.displayServiceInfo();
        }
    }

    public void addService(PetStoreService newService) {
        items.add(newService);
    }

    public void editName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void editYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }
}
