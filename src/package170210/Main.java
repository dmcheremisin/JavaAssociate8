package package170210;

import package170210.pond.goose.Goosling;
import package170210.pond.shore.BirdWatcher;

/**
 * Created by Администратор on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Goosling gosGoosling = new Goosling();
        gosGoosling.swim();
        System.out.println("=================================");
        BirdWatcher bw = new BirdWatcher();
        bw.watchB();
    }
}
