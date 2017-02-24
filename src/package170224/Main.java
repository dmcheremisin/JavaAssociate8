package package170224;

import java.util.ArrayList;

/**
 * Created by Администратор on 24.02.2017.
 */
public class Main {
    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args) {
        values.add("changed");
        System.out.println(values);
        // values = new ArrayList<>();
        values.add("also changed");
        System.out.println(values);
    }
}
