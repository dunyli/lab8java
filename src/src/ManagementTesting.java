package src;

//Классы делегатов
class MainManager implements ProjectManagement { // класс поведения для работников, которые руководят проектом
    public void manageProject() {
        System.out.println("Я управляю разработчиками!");
    }
}

class AssistentManager implements ProjectManagement { // класс поведения для работников, которые управляют проектом
    public void manageProject() {
        System.out.println("Я управляю проектом!");
    }
}

class NoManager implements ProjectManagement { // класс поведения для работников, которые не управляют проектом
    public void manageProject() {
        System.out.println("Я не управляю проектом!");
    }
}

class MainTester implements Testing { // класс поведения для работников, которые тестируют программу
    public void spendTesting() {
        System.out.println("Я занимаюсь тестировкой готового проекта!");
    }
}

class AssistentTester implements Testing { // класс поведения для работников, которые тестируют программу
    public void spendTesting() {
        System.out.println("Я занимаюсь первичной тестировкой проекта, на этапе реализации!");
    }
}

class NoTester implements Testing { // класс поведения для работников, которые не тестируют программу
    public void spendTesting() {
        System.out.println("Я не занимаюсь тестировкой проекта!");
    }
}
