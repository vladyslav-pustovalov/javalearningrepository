package fourthhomework;

public class Main {

    public static void main(String[] args) {

        BankSystemImpl bankSystem = new BankSystemImpl();

        User ivan = new User(111111, "Ivan", 100500, 12, "Apple", 15000, User.usBank);
        User artem = new User(222222, "Artem", 25000, 3, "Google", 8000, User.usBank);
        User denys = new User(333333, "Denys", 76000, 7, "Amazon", 16000, User.euBank);
        User taras = new User(444444, "Taras", 870000, 38, "Microsoft", 40000, User.euBank);
        User petro = new User(555555, "Petro", 7000, 40, "Facebook", 20000, User.chiBan);
        User vasyl = new User(666666, "Vasyl", 5400000, 66, "Walmart", 40000, User.chiBan);

        bankSystem.withdrawOfUser(ivan, 1001);
        bankSystem.fundUser(ivan, 5000);
        bankSystem.transferMoney(ivan, artem, 5000);
        bankSystem.paySalary(ivan);
        bankSystem.withdrawOfUser(denys, 1001);
        bankSystem.fundUser(denys, 5000);
        bankSystem.transferMoney(denys, taras, 5000);
        bankSystem.paySalary(taras);
        bankSystem.withdrawOfUser(petro, 1001);
        bankSystem.fundUser(petro, 5000);
        bankSystem.transferMoney(petro, vasyl, 5000);
        bankSystem.paySalary(vasyl);
    }
}
