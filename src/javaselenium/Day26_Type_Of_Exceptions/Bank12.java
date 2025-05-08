package javaselenium.Day26_Type_Of_Exceptions;

public class Bank12 {
    private String currency;
    private Integer amount;

    public Bank12(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank12 bankname)
    {
        if(bankname.currency.equals("INR"))
        {
            return bankname.amount+this.amount;    // bankname.amount = jp_chase and this.amount = sbi
        }
        else
        {
            try
            {
             throw new CurrencyMismatchException("Currency Mismatch!");
            }
            catch (CurrencyMismatchException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println(this.amount);
            }

        }

        return 0;
    }
}

class CurrencyMismatchException extends Exception
{
    CurrencyMismatchException(String msg)
    {
        super(msg);
    }

}

class NotValidAgeException extends Exception{

    NotValidAgeException(String e)
    {
        super(e);
    }
}

