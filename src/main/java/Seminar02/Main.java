package Seminar02;

public class Main {
    public static void main(String[] args) {
        //NumberTest num = new NumberTest();
        /*for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение" + num.GetNext());
        }
        System.out.println("Сброс");
        num.reset();
        System.out.println("Начальное значение 100");
        num.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение" + num.GetNext());
        }*/
        NumberTest2 num = new NumberTest2();
        NumberTest count = new NumberTest();
        Test ob;
        for (int i = 0; i < 5; i++) {
            ob = num;
            System.out.println("Следующее значение" + ob.GetNext());
            ob = count;
            System.out.println("Следующее значение" + ob.GetNext());

        }
    }
}
