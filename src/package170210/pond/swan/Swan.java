package package170210.pond.swan;

import package170210.pond.shore.Bird;

/**
 * Created by Администратор on 10.02.2017.
 */
public class Swan extends Bird {
    public void swim(){
        floatB();
    }
    public void helpOther(){
        Swan swan = new Swan();
    }
    public void helpOtherBird(){
        Bird other = new Bird();
        // other.floatB(); Bird is not a subclass of Bird
    }
    public void helpOtherSwan(){
        Bird other = new Swan();
        //other.floatB(); Bird reference restricts access
    }
}
