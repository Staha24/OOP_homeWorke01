package Seminar01_homeWorke;

public abstract class Kids extends Human{

    public Kids(String gender, Integer age, String name, String surname, String connection) {
        super(gender, age, name, surname, connection);
    }
    public void laughter(){
        System.out.println("Ха-ха-ха");
    }
    public void answer(){
        System.out.println("Привет папа");
    }
    public void answer1(){
        System.out.println("Привет мама");
    }
    public void answer2(){
        System.out.println("Я не голоден");
    }
    public void scanner(){
        System.out.printf("Пол: %s  Возраст: %d Имя: %s Фамилия: %s Связь: %s \n", gender, age, name, surname, connection);

    }


}
