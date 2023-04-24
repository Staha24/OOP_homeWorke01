package Seminar06.Srp.ISP;
//класс оплат через терминал, который не поддерживает оплату по номеру телефона
public class TerminalPay implements WebMoneyServis,CreditCardPay{

    @Override
    public void payWebmoney() {

    }

    @Override
    public void payCreditCard() {

    }

    //@Override
    //public void payNumber() {
        //этот метод здесь не нужен - как быть? Разделить интерфес на три интерфейса, а этот метод удалить

    //}
}
