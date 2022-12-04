package SecondHomework;

public class Bank {
    static double balance, withdrawal;
    static String ownerName;
    public static void main(String[] args) {
        balance = 100;
        withdrawal = 90;
        System.out.println(withdrawingMoneyFromAccount());
        ownerName = "Ann";
        withdrawal = 250;
        System.out.println(checkingWithdrawingMoney());
    }
    static String withdrawingMoneyFromAccount(){
        double commission, newBalance;
        String result;
        commission = withdrawal * 0.05;
        newBalance = balance - (withdrawal + commission);
        if (withdrawal + commission <= balance) {
            result = "Ok " + commission + " " + newBalance;
        } else {
            result = "No";
        }
        return result;
    }
    static String checkingWithdrawingMoney() {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String result;
        int i;
        i = 0;
        double commission, newBalance;
        commission = withdrawal * 0.05;
        while (ownerName != ownerNames[i]) {
            i++;
        }
        newBalance = balances[i] - (withdrawal + commission);
        if (withdrawal + commission <= balances[i]) {
            result = ownerNames[i] + " " + withdrawal + " " + newBalance;
        } else {
            result = ownerNames[i] + " No";
        }
        return result;
    }

}
