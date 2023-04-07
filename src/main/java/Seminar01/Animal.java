package Seminar01;
/*
 Опишите класс Animal. У класса Animal должны быть свойства:

 type- тип животного
 name- имя животного
 age- возраст животного
 weight-вес животного
 isFly-ответ на вопрос, умеет ли животное летать?(boolean)
 isWalk- ответ на вопрос, умет ли животное ходить? (boolean)
 isSwim- ответ на вопрос, умеет ли животное плавать? (boolean)

 У животного должны быть методы:
 display- выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>, Возраст:
    <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>
 Rename (String) Принимает новое имя животного
 holiday(int) принимает на вход число праздничных дней.
    Увеличивает массу животного на 0,1 за каждый праздничный день.

 */

public class Animal {
    public String type;
    public String name;
    public Integer age;
    public Double weight;
    public Boolean isFly;
    public Boolean isWalke;
    public Boolean isSwim;
    private Integer rost;

    public Integer getRost() {
        return rost;
    }

    public void setRost(Integer rost) {
        this.rost = rost;
    }

    public Animal(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalke = isWalke;
        this.isSwim = isSwim;
    }

    public Animal(String type, String name, Double weight, Boolean isFly, Boolean isWalke, Boolean isSwim) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalke = isWalke;
        this.isSwim = isSwim;
    }

    public String display() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalke=" + isWalke +
                ", isSwim=" + isSwim +
                '}';
    }
    public void rename(String name){
        this.name = name;
    }

}
