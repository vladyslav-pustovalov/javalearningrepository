package fourthhomework;

public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.setBalance(user.getBalance() - (amount + user.getBank().getCommission(amount)));

    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
