package src;

class TeamLead extends WorkInterface implements ProjectManagement {
    private int yearsOfExperience;
    private String name;
    private int id;
    private int yearsAsTeamLead;
    private int teamSize; // Размер команды

    // Конструктор
    public TeamLead(String name, int id, int yearsOfExperience, int yearsAsTeamLead, int teamSize) {
        name =name;
        id = id;
        yearsOfExperience = yearsOfExperience;
        this.yearsAsTeamLead = yearsAsTeamLead;
        this.teamSize = teamSize;
        this.management = new AssistentManager();
        this.testing = new MainTester();
    }

    // Реализация метода управления проектом
    public void manageProject() {
        System.out.println("Тимлид " + name + " управляет проектом с размером команды: " + teamSize);
    }

    // Переопределение метода displayInfo
    public void displayInfo() {
        System.out.println("Тимлид: " + name + ", ID: " + id + ", Опыт: " + yearsOfExperience + " лет, Размер команды: " + teamSize);
    }
}
