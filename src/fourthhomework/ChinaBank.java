package fourthhomework;

public class ChinaBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public ChinaBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.limitOfWithdrawal = setLimitOfWithdrawal(currency);
        this.limitOfFunding = setLimitOfFunding(currency);
        this.monthlyRate = setMonthlyRate(currency);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return limitOfWithdrawal;
    }

    private int setLimitOfWithdrawal (Currency currency) {
        if(currency == Currency.USD) {
            limitOfWithdrawal = 100;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }
    @Override
    public int getLimitOfFunding() {
        return limitOfFunding;
    }

    private int setLimitOfFunding(Currency currency) {
        if(currency == Currency.EUR) {
            limitOfFunding = 5000;
        } else if (currency == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        return monthlyRate;
    }

    private int setMonthlyRate(Currency currency) {
        if(currency == Currency.USD) {
            monthlyRate = 1;
        } else if (currency == Currency.EUR) {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int sum) {
        return commission;
    }

    private int setCommission (Currency currency, int sum) {
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
    public double moneyPaidMonthlyForSalary() {
        return getAvrSalaryOfEmployee() * getNumberOfEmployees();
    }
}
