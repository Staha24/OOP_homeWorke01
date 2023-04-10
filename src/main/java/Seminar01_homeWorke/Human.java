package Seminar01_homeWorke;
//класс человек
public abstract class Human {
    public String gender;//поле пол
    public Integer age;//поле возраст
    public String name;//поле имя
    public String surname;//поле фамилия
    public String connection;//поле связь




    public String Human() { //конструктор заполнения полей
        return "Human{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", connection='" + connection + '\'' +
                '}';
    }

    public Human(String gender, Integer age, String name, String surname, String connection) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.connection = connection;
    }

    public abstract void say(); //абстрактный метод говорить
}
