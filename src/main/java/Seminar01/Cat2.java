package Seminar01;

public class Cat2 extends Cat{
    public Cat2(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim) {
        super(type, name, age, weight, isFly, isWalke, isSwim);
    }

    public Cat2(String type, String name, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim) {
        super(type, name, weight, isFly, isWalke, isSwim);
    }
    @Override
    public void say() {
        System.out.println("Мяу, мяу, мяу, мяу");
    }


}
