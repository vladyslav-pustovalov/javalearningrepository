package secondhomework;

import java.util.Objects;

public class Bank {
    //static double balance, withdrawal;
    //static String ownerName;
    //static int[] balances = {1200, 250, 2000, 500, 3200};
    //static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        System.out.println(withdrawingMoneyFromAccount(100, 90));
        System.out.println(checkingWithdrawingMoney(balances,ownerNames,"Jane", 250 ));
        System.out.println(balanceFunding(balances,ownerNames,"Ann", 98));
    }

    static String withdrawingMoneyFromAccount(double balance, double withdrawal) {
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
    static String checkingWithdrawingMoney(int[] balances,String[] ownerNames,String ownerName, double withdrawal) {
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
   static String balanceFunding(int[] balances,String[] ownerNames,String ownerName, double withdrawal) {
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