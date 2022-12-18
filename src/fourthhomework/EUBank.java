package fourthhomework;

public class EUBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public EUBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    static EUBank euBank = new EUBank(654321, Currency.EUR, "Germany", 500, 20000, 151, 350000000);

    @Override
    public int getLimitOfWithdrawal() {
        if(currency == Currency.USD) {
            limitOfWithdrawal = 2000;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if(currency == Currency.EUR) {
            limitOfFunding = 20000;
        } else if (currency == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if(currency == Currency.USD) {
            monthlyRate = 0;
        } else if (currency == Currency.EUR) {
            monthlyRate = 1;
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
                commission = 2;
            } else {
                commission = 4;
            }
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }
}
