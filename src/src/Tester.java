package src;

class Tester extends WorkInterface implements Testing {
    private int yearsAsTester;
    private String name;
    private int id;
    private int yearsOfExperience;

    // Конструктор
    public Tester(String name, int id, int yearsOfExperience, int yearsAsTester) {
        this.name = name;
        this.id = id;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAsTester = yearsAsTester;
        this.testing = new AssistentTester();
        this.management = new NoManager();
    }

    // Реализация метода тестирования
    public void spendTesting() {
        System.out.println("Тестировщик " + name + " проводит тестирование для проекта.");
    }

    public void displayInfotester() {
        System.out.println("Тестировщик: " + name + ", ID: " + id + ", Опыт: " + yearsOfExperience + " лет");
    }
}