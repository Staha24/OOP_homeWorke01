package Seminar01;

public class Cat extends Animal {
    public Cat(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim) {
        super(type, name, age, weight, isFly, isWalke, isSwim);
    }

    public Cat(String type, String name, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim) {
        super(type, name, weight, isFly, isWalke, isSwim);
    }

    public void say(){
        System.out.println("Мяу, мяу");
    }
}
