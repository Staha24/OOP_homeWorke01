package Seminar01_homeWorke;

public class Parents extends Human{

    public Parents(String gender, Integer age, String name, String surname, String connection) {
        super(gender, age, name, surname, connection);
    }
    public void say(){
        System.out.println("Привет");
    }
    public void swear(){
        System.out.println("Ух накажу!");
    }
    public void asks(){
        System.out.println("Кушать будешь?");
    }
    public void says(){
        System.out.println("Давай делать домашнее задание");
    }
    public void scanner(){
        System.out.printf("Пол: %s  Возраст: %d Имя: %s Фамилия: %s Связь: %s \n", gender, age, name, surname, connection);

    }

}
