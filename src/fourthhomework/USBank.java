package fourthhomework;

public class USBank extends Bank {

    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public USBank(long id, Currency currency, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, currency, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.limitOfWithdrawal = setLimitOfWithdrawal(currency);
        this.limitOfFunding = setLimitOfFunding(currency);
        this.monthlyRate = setMonthlyRate(currency);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return limitOfWithdrawal;
    }

    private int setLimitOfWithdrawal(Currency currency) {
        if(currency == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        return limitOfFunding;
    }

    private int setLimitOfFunding(Currency currency) {
        if(currency == Currency.EUR) {
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
            monthlyRate = 2;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int sum) {
        if (getCurrency() == Currency.USD) {
            if (sum <= 1000) {
                commission = 5;
            } else {
                commission = 7;
            }
        } else if (getCurrency() == Currency.EUR) {
            if (sum <= 1000) {
                commission = 6;
            } else {
                commission = 8;
            }
        }
        return commission;
    }

    private int setCommission(Currency currency, int sum) {
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
    public double moneyPaidMonthlyForSalary() {
        return getAvrSalaryOfEmployee() * getNumberOfEmployees();
    }
}
