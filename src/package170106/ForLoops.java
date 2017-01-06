package package170106;

public class ForLoops {

    public static void main(String[] args) {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);//x is declared before loop!
        //System.out.println(z, y); z and y have another scope!

        int x1 = 0;
//        for(long y = 0, x1 = 4; x1 < 5 && y < 10; x1++, y++) { // DOES NOT COMPILE - x1 is declared twice
//            System.out.print(x1 + " ");
//        }

//        for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE because variables declaration should be the same data type
//            System.out.print(x + " ");
//        }

        // infinite loop
        for( ; ; ) {//it is valid, no compilation error!
            //System.out.println("Hello World");
        }
    }
}
