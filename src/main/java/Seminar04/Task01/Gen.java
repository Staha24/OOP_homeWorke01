package Seminar04.Task01;

public class Gen <T, V>{//класс с обобщенным типом
    T ob; //создали объект с типом Т
    V ob2;

    public Gen(T ob, V ob2) { //передали конструктору ссылку на лбъект с типом Т
        this.ob = ob;
        this.ob2 = ob2;
    }
    void  showType(){ //метод, кот.будет показывать какой тип у объекта
        System.out.println("Тип Т это: "+ ob.getClass().getName());
        System.out.println("Тип V это: "+ ob2.getClass().getName());
    }

    T getOb(){
        return ob;
    }
    V getOb2(){
        return ob2;
    }
}
