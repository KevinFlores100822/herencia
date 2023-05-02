package Arreglos;

public class ArrayType {
    public static void main(String[] args) {
        String [] bugs = { "cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));     //true
        System.out.println(bugs.toString());        //[Ljava.lang.String;
        System.out.println(bugs[0]);
        System.out.println(bugs[1]);
        System.out.println(bugs[2]);
        for(int i=0; i<bugs.length; i++){    //con for nos ahorramos tener que escribir una linea por elemento
            System.out.println(bugs[i]);
        }
    }
}
