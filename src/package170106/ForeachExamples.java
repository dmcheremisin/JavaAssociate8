package package170106;

public class ForeachExamples {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for(String value : names) {
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println(" =================== ");

        for(java.util.Iterator<String> i = names.iterator(); i.hasNext(); ) {
            String value = i.next();
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println(" =================== ");

        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        System.out.println();
        System.out.println(" =================== ");

        String[] names1 = new String[3];
        for(String name : names1) {
            System.out.print(name + ", ");
        }
        System.out.println();
        System.out.println(" =================== ");

        String[] names2 = new String[3];
        names2[0] = "Lisa";
        names2[1] = "Kevin";
        names2[2] = "Roger";
        for(String name : names2) {
            System.out.print(name + ", ");
        }

    }
}
