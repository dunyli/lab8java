package src;

abstract class WorkInterface {
    protected ProjectManagement management;
    protected Testing testing;

    // Делегируем выполнение операции классам поведения
    public void performManage() {
        if (management != null) {
            management.manageProject();
        } else {
            System.out.println("Нет менеджера для выполнения управления проектом.");
        }
    }

    public void performTesting() {
        if (testing != null) {
            testing.spendTesting();
        } else {
            System.out.println("Нет тестировщика для выполнения тестирования.");
        }
    }
}
