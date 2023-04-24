package Seminar03.Task05;

import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {

        //Pred<Integer> predicate = (x)->(x>0);//создали свой
        //System.out.println(predicate.test(5));
        //System.out.println(predicate.test(-7));

        Predicate<Integer> predicate = (x)->(x>0);
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(-7));
    }
}
