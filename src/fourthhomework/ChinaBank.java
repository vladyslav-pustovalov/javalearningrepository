package fourthhomework;

public class ChinaBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public ChinaBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    static ChinaBank chinaBank = new ChinaBank(123654, Currency.USD, "China", 2500, 5000, 28, 95000000);

    @Override
    public int getLimitOfWithdrawal() {
        if(currency == Currency.USD) {
            limitOfWithdrawal = 100;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if(currency == Currency.EUR) {
            limitOfFunding = 5000;
        } else if (currency == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if(currency == Currency.USD) {
            monthlyRate = 1;
        } else if (currency == Currency.EUR) {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int sum) {
        if (currency == Currency.USD) {
            if (sum <= 1000) {
                commission = 3;
            } else {
                commission = 5;
            }
        }
        if (currency == Currency.EUR) {
            if (sum <= 1000) {
                commission = 10;
            } else {
                commission = 11;
            }
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }
}
