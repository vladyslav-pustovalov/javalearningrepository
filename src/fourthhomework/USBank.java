package fourthhomework;

public class USBank extends Bank{

    /*
    USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
    limit of funding - 10000 if EUR and no limit if USD
    monthly rate - 1% with USD and 2% with EUR
    commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    6% if EUR and up to 1000 and 8% if EUR and more than 1000
        */

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public USBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(Currency) {
        if (Currency.USD) {
            limitOfWithdrawal = 1000;
        } else if (Currency.EUR) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int sum) {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
