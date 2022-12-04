package SecondHomework;

public class Bank {
    static double balance, withdrawal, commission, newBalance;
    public static void main(String[] args) {
        balance = 100;
        withdrawal = 96;
        System.out.println(withdrawingMoneyFromAccount());
    }
    static String withdrawingMoneyFromAccount(){
        String result;
        commission = withdrawal * 0.05;
        newBalance = balance - (withdrawal + commission);
        if (withdrawal + commission <= balance) {
            result = "Ok, commission: " + commission + ", balance after withdrawal: " + newBalance;
        } else {
            result = "No";
        }
        return result;
    }
}
