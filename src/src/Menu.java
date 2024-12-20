package src;

import java.util.Scanner;

public class Menu {
    private WorkerDatabase database; // База данных работников

    public Menu(WorkerDatabase database) {
        this.database = database;
    }

    // Функция для вывода основного меню
    public void outMenu() {
        System.out.println("1. Добавление данных");
        System.out.println("2. Вывод данных");
        System.out.println("3. Создание заказа");
        System.out.println("4. Выбор услуги");
        System.out.println("5. Поиск и сортировка информации.");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }

    // Функция для добавления данных
    public void addInfo() {
        System.out.println("1. Добавить клиента");
        System.out.println("2. Добавить категорию");
        System.out.println("3. Добавить поставщика");
        System.out.println("4. Добавить товар");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }

    public void displayOrderHistory(Order order, int orderIndex) {
        int clientId = order.getClient_id();
        int numProducts = order.getNum_products();
        int totalPrice = order.getTotal_price();
        System.out.printf("Заказ №%d. ", orderIndex + 1);
        System.out.printf("ID клиента: %d  ", clientId);
        for (int a = 0; a < numProducts; a++) {
            System.out.print("Товары: ");
            System.out.printf("%d. ", a + 1);
            Product product = order.listProducts(a);
            System.out.println("Название продукта: " + product.getName());
            System.out.printf("Цена: %d, Количество: %d\n", product.getPrice(), product.getCount());
        }
        System.out.printf("Общая стоимость: %d\n", totalPrice);
        System.out.println();
    }

    // Функция для вывода данных
    public void listInfo() {
        System.out.println("1. Вывести список клиентов");
        System.out.println("2. Вывести список категорий");
        System.out.println("3. Вывести список поставщиков");
        System.out.println("4. Вывести список товаров");
        System.out.println("5. Вывести список заказов");
        System.out.println("6. Вывести информацию о магазине");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }

    // Функция для входа в систему
    public void login() {
        Scanner scanner = new Scanner(System.in);
        String username;
        int id;
        String department;
        boolean success;
        int checkId;
        int year;

        System.out.println("Войдите в систему.");

        do {
            do {
                checkId = 0;
                success = true;

                System.out.print("Введите свое имя: ");
                username = scanner.nextLine();

                System.out.print("Введите свой ID: ");
                id = scanner.nextInt();

                System.out.print("Введите общее количество лет работы: ");
                year = scanner.nextInt();

                checkId = database.checkID(id);
                scanner.nextLine(); // Очистка буфера
            } while (checkId != 0);

            try {
                Worker worker = new Worker(username, id, year);
                // Предположим, что если ID меньше 100, это работник, иначе - менеджер
                if (id < 100) {
                    worker.displayInfo();
                    // Используем статический метод для получения порога зарплаты
                    System.out.println("Текущий порог зарплаты: " + Worker.getSalaryThreshold());
                     Worker.setSalaryThreshold(60000);
                    database.addWorker(worker);
                    database.showWorkerInfo(worker); // Вызовет Worker::displayInfo
                } else {
                    Manager manager = new Manager(username, id, year);
                    System.out.print("Введите свой отдел: ");
                    department = scanner.nextLine();
                    manager.setDepartment(department);
                    System.out.print("Введите количество лет работы менеджером: ");
                    year = scanner.nextInt();
                    manager.setYears(year);
                    manager.displayInfo();
                    database.addWorker(manager);
                    database.showWorkerInfo(manager); // Вызовет Manager::displayInfo
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
                success = false;
            }
        } while (!success);
    }
}
