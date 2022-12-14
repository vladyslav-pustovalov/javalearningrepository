package thirdhomework.task4;

public class Main {

    public static void main(String[] args) {
        User denys = new User("Denys", "His own Company", "Euro", 100500, 12, 15000);

        User.paySalary();
        User.withdraw(350000);
        User.companyNameLength();
        User.increaseEmploymentMonth(12);
    }
}
