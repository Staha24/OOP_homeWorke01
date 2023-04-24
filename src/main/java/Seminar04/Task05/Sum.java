package Seminar04.Task05;
//обобщенный конструктор
public class Sum {
    int sum;//переменная

    //создаем обобщенный конструктор


    <T extends Number> Sum(T arg) {
        this.sum = 0;
        for (int i = 0; i <=arg.intValue() ; i++) {//преобразовываем в int
            sum+=i;
        }

    }
    int getSum(){
        return sum;
    }
}
class  SumDemo{
    public static void main(String[] args) {
        Sum ob = new Sum(4.0);
        System.out.println("Суььф от 0 до 4 = " +ob.getSum());
    }
}
