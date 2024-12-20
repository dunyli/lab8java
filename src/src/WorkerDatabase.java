package src;

import java.util.ArrayList;
import java.util.List;

public class WorkerDatabase {
    private List<Worker> workers; // Список работников
    private int totalWorkersCount = 0; // Переменная для общего количества работников

    public WorkerDatabase() {
        workers = new ArrayList<>();
    }

    // Метод для добавления работника
    public void addWorker(Worker worker) {
        workers.add(worker); // Добавляем работника в базу
        totalWorkersCount++; // Увеличиваем общее количество работников
    }

    // Метод для добавления работника, если его еще нет в базе данных
    public void addWorkerIfNotExists(Worker worker) {
        if (this.findWorkerById(worker.getId()) == null) {
            this.addWorker(worker); // Используем this для добавления работника
            System.out.println("Работник с ID " + worker.getId() + " добавлен в базу данных.");
        } else {
            System.out.println("Работник с ID " + worker.getId() + " уже существует в базе данных.");
        }
    }

    // Метод для отображения всех работников
    public void displayAllWorkers() {
        for (Worker worker : workers) {
            worker.displayInfo(); // Вызываем виртуальную функцию displayInfo
        }
    }

    // Метод для проверки ID
    public int checkID(int id) {
        for (Worker worker : workers) {
            if (id == worker.getId()) return 1;
        }
        return 0;
    }

    // Метод для поиска работника по ID
    public Worker findWorkerById(int id) {
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                return worker; // Возвращаем работника, если найден
            }
        }
        return null; // Если не найден, возвращаем null
    }

    public void showWorkerInfo(Worker worker) {
        System.out.println("Информация о работнике:");
        worker.displayInfo(); // Вызов виртуальной функции
    }

    public int getNumWorkers() {
        return workers.size();
    }
}
