package fourthhomework;

public class EUBank extends Bank {

     /*
    EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
    limit of funding - 20000 if EUR and 10000 if USD
    monthly rate - 0% with USD and 1% with EUR
    commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    2% if EUR and up to 1000 and 4% if EUR and more than 1000
        */

    public EUBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
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
