package Seminar06.Srp.LSP;

import java.math.BigDecimal;
// есть счет в банке, у счета аккаунт и три метода: остаток по счету, пополнение счета и оплата по счету
//создаем еще два класса: зарплатный счет и депозитный. Зарплатный будет поддерживать все операции, а депозитный
//не будет поддерживать проведение оплат.
public abstract class Account {
    public void balanse(String numberAccount) {
    }

    //public BigDecimal balanse(String numberAccount){
        // BigDecimal - это преобразование большого числа? встроенный класс джавы
        //BigDecimal bigDecimal = new BigDecimal();
        //return bigDecimal;
    //}
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    //public void payment(String numberAccount, BigDecimal sum){
        //logic
    //}этот метод удаляем, в депозите его тоже удаляем, а в селари

}
