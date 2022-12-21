package fourthhomework;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount > 0) {
            double commissionDouble = user.getBank().getCommission(amount);
            double commissionPercent = commissionDouble / 100;
            double withdrawal = amount + amount * commissionPercent;
            if (user.getBank().getLimitOfWithdrawal() <= amount) {
                if (user.getBalance() >= withdrawal) {
                    user.setBalance(user.getBalance() - withdrawal);
                    System.out.println("Ok, your new balance = " + user.getBalance());
                } else {
                    System.out.println("You are really poor");
                }
            } else {
                System.out.println("You can not withdraw more than " + user.getBank().getLimitOfWithdrawal());
            }
        } else {
            System.out.println("You are stupid");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount > 0) {
            if (user.getBank().getLimitOfFunding() <= amount) {
                user.setBalance(user.getBalance() + amount);
                System.out.println("Ok, your new balance = " + user.getBalance());
            } else {
                System.out.println("Man, you are too rich for this Bank");
            }
        } else {
            System.out.println("You are stupid");
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount > 0) {
            if (fromUser.getBank().equals(toUser.getBank())) {
                if (fromUser.getBalance() >= amount) {
                    toUser.setBalance(toUser.getBalance() + amount);
                    fromUser.setBalance(fromUser.getBalance() - amount);
                    System.out.println("Ok");
                } else {
                    System.out.println(fromUser.getName() + " are too poor");
                }
            } else {
                System.out.println("You can not transfer money between different banks");
            }
        } else {
            System.out.println("You are stupid");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("Ok, your new balance = " + user.getBalance());
    }
}
