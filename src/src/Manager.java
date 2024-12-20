package src;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {
    private String department;
    private List<String> teamMembers; // Список членов команды
    private int yearsAsManager; // Количество лет опыта в качестве менеджера

    // Конструктор
    public Manager(String name, int id, int yearsOfExperience) {
        super(name, id, yearsOfExperience);
        this.teamMembers = new ArrayList<>();
    }

    // Конструктор менеджера
    public Manager(String name, int id, int yearsOfExperience, String department, int yearsAsManager) {
        super(name, id, yearsOfExperience);
        if (department.isEmpty()) {
            throw new IllegalArgumentException("Отдел не может быть пустым.");
        }
        this.department = department;
        this.yearsAsManager = yearsAsManager;
        this.teamMembers = new ArrayList<>();
    }

    // Конструктор копирования (глубокое клонирование)
    public Manager(Manager other) {
        super(other); // Клонируем поля из родительского класса
        this.department = other.department;
        this.yearsAsManager = other.yearsAsManager;
        this.teamMembers = new ArrayList<>(other.teamMembers); // Глубокое клонирование списка
    }

    // Метод для клонирования менеджера
    public Manager clone() {
        return new Manager(this); // Используем конструктор копирования
    }

    // Функция для получения количества лет опыта в качестве менеджера
    public int getCash() {
        int years = yearsOfExperience - yearsAsManager;
        return yearsAsManager * 5000 + years * 1000;
    }

    public void displayInfo() {
        System.out.println("Менеджер: " + nameWorker + ", ID: " + idWorker + ", Опыт: " + yearsAsManager + " лет в качестве менеджера");
        System.out.print("Члены команды: ");
        for (String member : teamMembers) {
            System.out.print(member + ", ");
        }
        System.out.println();
    }

    // Метод для добавления члена команды
    public void addTeamMember(String member) {
        teamMembers.add(member);
    }

    public void setYears(int year) {
        yearsAsManager = year;
    }

    // Метод для получения информации о департаменте
    public String getDepartment() {
        return department;
    }

    public int getTeamSize() {
        return teamMembers.size();
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
