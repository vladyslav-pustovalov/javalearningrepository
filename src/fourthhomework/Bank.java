package fourthhomework;

public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.currency = currency;
        this.bankCountry = bankCountry;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int sum);

    abstract double moneyPaidMonthlyForSalary();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
