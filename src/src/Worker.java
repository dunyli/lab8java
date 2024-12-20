package src;

public class Worker {
    protected String nameWorker;
    protected int idWorker;
    protected int yearsOfExperience; // Общее количество лет опыта

    // Статическая переменная для хранения порога зарплаты высокооплачиваемых работников
    private static int salaryThreshold = 50000;

    // Конструктор с параметрами
    public Worker(String name, int id, int yearsOfExperience) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        if (id < 0) {
            throw new IllegalArgumentException("ID не может быть отрицательным.");
        }
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Опыт не может быть отрицательным.");
        }
        this.nameWorker = name;
        this.idWorker = id;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Конструктор копирования
    public Worker(Worker other) {
        this.nameWorker = other.nameWorker;
        this.idWorker = other.idWorker;
        this.yearsOfExperience = other.yearsOfExperience;
    }

    // Метод для клонирования работника поверхностное
    public Worker clone() {
        return new Worker(this); // Используем конструктор копирования
    }

    // Метод для отображения информации о работнике
    public void displayInfo() {
        System.out.println("Работник: " + nameWorker + ", ID: " + idWorker + ", Опыт: " + yearsOfExperience + " лет");
    }

    // Метод для вывода зарплаты после оплаты налогов
    public int getSalary() {
        int cash = getCash();
        if (cash < 20000) cash = cash - (cash % 10);
        else if (cash < salaryThreshold) cash = cash - (cash % 15);
        else cash = cash - (cash % 20);
        return cash;
    }

    // Метод для изменения имени работника
    public void changeName(String newName) {
        if (newName.isEmpty()) {
            throw new IllegalArgumentException("Новое имя не может быть пустым.");
        }
        this.nameWorker = newName;
        System.out.println("Имя работника изменено на: " + nameWorker);
    }

    // Метод для добавления текущего работника в базу данных
    public void addToDatabase(WorkerDatabase database) {
        database.addWorkerIfNotExists(this); // Передаем текущий объект Worker в базу данных
    }

    // Метод для подсчета зарплаты работника
    public int getCash() {
        return yearsOfExperience * 1000;
    }

    public int getYears() {
        return yearsOfExperience;
    }

    // Метод для получения идентификационного номера
    public int getId() {
        return idWorker;
    }

    // Метод для получения имени работника
    public String getName() {
        return nameWorker;
    }

    // Статический метод для получения порога зарплаты
    public static int getSalaryThreshold() {
        return salaryThreshold;
    }

    // Статический метод для установки порога зарплаты
    public static void setSalaryThreshold(int newThreshold) {
        salaryThreshold = newThreshold;
    }

    // Статический метод для проверки, является ли работник высокооплачиваемым
    public static boolean isHighPaid(Worker worker) {
        return worker.getCash() > salaryThreshold;
    }
}