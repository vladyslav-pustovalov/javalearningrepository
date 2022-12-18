package fourthhomework;

public class USBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public USBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    static USBank usBank = new USBank(123456, Currency.USD, "USA", 1000, 25000, 111, 1500000000);

    @Override
    public int getLimitOfWithdrawal() {
        if(currency == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if(currency == Currency.EUR) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if(currency == Currency.USD) {
            monthlyRate = 1;
        } else if (currency == Currency.EUR) {
            monthlyRate = 2;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int sum) {
        if (currency == Currency.USD) {
            if (sum <= 1000) {
                commission = 5;
            } else {
                commission = 7;
            }
        }
        if (currency == Currency.EUR) {
            if (sum <= 1000) {
                commission = 6;
            } else {
                commission = 8;
            }
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }
}
