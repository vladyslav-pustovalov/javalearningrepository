package thirdhomework;

public class User {

    private String name, companyName, currency;
    private int balance, monthsOfEmployment, salary;

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

    public User(String name, String companyName, String currency, int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    public void paySalary () {
        balance = balance + salary;
    }

    public void withdraw (int summ) {
        double commission;
        if (summ < 1000) {
            commission = summ * 0.05;
        } else {
            commission = summ * 0.1;
        }
        if ((summ + commission) < balance) {
            balance -= (summ + commission);
            System.out.println("Summ = "+summ+",Commission = "+commission+", new Banance = "+balance);
        } else {
            System.out.println("You are really poor");
        }
    }

    public void companyNameLenght () {
        int companyNameLenght = companyName.length();
        System.out.println(companyNameLenght);
    }

    public void increaseEmploymentMonth(int addMonth) {
        monthsOfEmployment += addMonth;
        System.out.println("Ok, months of employment = "+monthsOfEmployment);
    }
}
