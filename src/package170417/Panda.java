package package170417;

import java.util.function.Predicate;

/**
 * Created by Dmitrii
 * 24.02.2017.
 */
public class Panda {
    int age;
    public static void main(String[] args) {
        Panda p = new Panda();
        p.age = 1;
        check(p, panda -> panda.age < 2);
    }
    public static void check(Panda p, Predicate<Panda> checker){
        if(checker.test(p)) {
            System.out.println(p.age);
        }
    }
}
