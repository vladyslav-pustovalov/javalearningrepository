package fourthhomework;

public class ChinaBank extends Bank {

     /*
    ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
    limit of funding - 5000 if EUR and 10000 if USD
    monthly rate - 1% with USD and 0% with EUR
    commission - 3% if USD and up to 1000, 5% if USD and more than 1000
    10% if EUR and up to 1000 and 11% if EUR and more than 1000
        */

    public ChinaBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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
