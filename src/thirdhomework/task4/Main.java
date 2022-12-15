package thirdhomework.task4;

public class Main {

    public static void main(String[] args) {
        User denys = new User("Denys", "His own Company", "Euro", 100500, 12, 15000);

        denys.paySalary();
        denys.withdraw(350000);
        denys.companyNameLength();
        denys.increaseEmploymentMonth(12);
    }
}
