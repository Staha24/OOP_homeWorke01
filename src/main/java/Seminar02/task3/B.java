package Seminar02.task3;

public interface B extends A{
    void neth3();
}
class MyClass implements B{

    @Override
    public void neth1() {
        System.out.printf("Первый метод\n");
    }

    @Override
    public void neth2() {
        System.out.printf("Второй метод\n");

    }

    @Override
    public void neth3() {
        System.out.printf("Третий метод\n");

    }
}
