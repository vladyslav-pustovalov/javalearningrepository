package thirdhomework.task4;

public class User {

    private String name;
    private String companyName;
    private String currency;
    private int balance;
    private int monthsOfEmployment;
    private int salary;

    public User(String name, String companyName, String currency, int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void paySalary() {
        balance += salary;
        System.out.println(balance);
    }

    public void withdraw(int summ) {
        double commission;
        if (summ >= 0) {
            if (summ < 1000) {
                commission = summ * 0.05;
            } else {
                commission = summ * 0.1;
            }
            if ((summ + commission) < balance) {
                balance -= (summ + commission);
                System.out.println("Summ = " + summ + ",Commission = " + commission + ", new Balance = " + balance);
            } else {
                System.out.println("You are really poor");
            }
        } else {
            System.out.println("You can not withdraw minus sum");
        }

    }

    public void companyNameLength() {
        int companyNameLength = companyName.length();
        System.out.println(companyNameLength);
    }

    public void increaseEmploymentMonth(int addMonth) {
        if (addMonth >= 0) {
            monthsOfEmployment += addMonth;
            System.out.println("Ok, months of employment = " + monthsOfEmployment);
        } else {
            System.out.println("You can not work less");
        }
    }
}
