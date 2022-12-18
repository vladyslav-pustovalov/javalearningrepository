package fourthhomework;

public class Main {

    public static void main(String[] args) {
        USBank usBank = new USBank(159753, Currency.USD, "USA", 500, 10000, 159753, 1005000000);
        System.out.println(usBank.getLimitOfWithdrawal());
    }
}
