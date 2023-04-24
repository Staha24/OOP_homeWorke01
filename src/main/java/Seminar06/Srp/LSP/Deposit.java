package Seminar06.Srp.LSP;
//депозитный счет

import java.math.BigDecimal;

public class Deposit extends Account {
    @Override
    public void balanse(String numberAccount) {
        return;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

    //@Override
    //public void payment(String numberAccount, BigDecimal sum) {
        //будет выбрасывать
        //throw new UnsupportedOperationException("Оперыция не поддерживается");
    //}
}
