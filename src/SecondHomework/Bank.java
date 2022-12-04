package SecondHomework;

import java.util.Objects;

public class Bank {
    static double balance, withdrawal;
    static String ownerName;
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    public static void main(String[] args) {
        balance = 100;
        withdrawal = 90;
        System.out.println(withdrawingMoneyFromAccount());
        ownerName = "Ann";
        withdrawal = 50;
        System.out.println(checkingWithdrawingMoney());
        ownerName = "Ann";
        withdrawal = 550;
        System.out.println(balanceFunding());
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
        String result;
        int i;
        i = 0;
        double commission, newBalance;
        commission = withdrawal * 0.05;
        while (!Objects.equals(ownerName, ownerNames[i])) {
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
    static String balanceFunding() {
        String result;
        int i;
        i = 0;
        while (!Objects.equals(ownerName, ownerNames[i])) {
            i++;
        }
        balances[i] = (int) (balances[i] + withdrawal);
        result = ownerNames[i] + " " + balances[i];
        return result;
    }
}
