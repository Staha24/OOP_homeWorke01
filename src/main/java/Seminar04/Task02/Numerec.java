package Seminar04.Task02;

public class Numerec <T extends Number>  {//создали класс с обобщенным типом, наследованным от Number
    T num;

    public Numerec(T num) {
        this.num = num;
    }
    Double getNum(){
        return 1/num.doubleValue();
    }
    Double getNum2(){
        return num.doubleValue() - num.intValue();
    }
}
