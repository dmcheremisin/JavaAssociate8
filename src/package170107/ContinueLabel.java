package package170107;

public class ContinueLabel {

    public static void main(String[] args) {
        LOOP: for (int a = 1; a <= 4; a++) {
            System.out.print(a + ":");
            for (int b = 0; b <= 4; b++) {
                System.out.println(b + ";");
                continue LOOP;
            }
        }
    }
}
