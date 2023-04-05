package Seminar01_homeWorke;

public abstract class Human {
    public String gender;
    public Integer age;
    public String name;
    public String surname;
    public String connection;




    public String Human() {
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

    public abstract void say();
}
