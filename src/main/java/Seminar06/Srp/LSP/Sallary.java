package Seminar06.Srp.LSP;

import java.math.BigDecimal;

//зарплатный счет, который наследуется от аккаунта
public class Sallary extends Account {
    @Override
    public void balanse(String numberAccount) {
        return;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

    //@Override это оверрайд метод уда
//ляем и создаем обычный метод
    //public void payment(String numberAccount, BigDecimal sum) {
        //super.payment(numberAccount, sum);
    //}
    public void payment(String numberAccount, BigDecimal sum) {
        payment(numberAccount, sum);
        }
}
