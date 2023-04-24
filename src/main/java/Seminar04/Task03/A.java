package Seminar04.Task03;

import Seminar04.Task01.Gen;

//ограниченные шаблоны
public class A {
    //
}
class B extends A {

}
class C extends B {

}
class D extends C{

}
class Gen2<T>{ //здесь параметр типа, который определяет тип объекта
    T ob;

    public Gen2(T ob) {
        this.ob = ob;
    }

    //нужно создать метод, принимающий аргумент любого типа соответствующего объекта класса
    //т.е. нужно создать метод, который будет использовать объекты типа Gen,где тип это класс А и его подклассы
    //Для этой цели можно воспользоваться шаблоном ограниченных аргументов

    //static void test(Gen2<?extends A> ob){}
    //static void test(Gen2<?super B> ob){}
}
class Gen3{
    //static void test(Gen2<?extends A> ob){}
    static void test(Gen2<?super D> ob){

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen2<A> w = new Gen2<>(a);
        Gen2<B> w2 = new Gen2<>(b);
        Gen2<C> w3 = new Gen2<>(c);
        Gen2<D> w4 = new Gen2<>(d);

        test(w);
        test(w2);
        test(w3);
        test(w4);
    }

}
