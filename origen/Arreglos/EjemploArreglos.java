package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
          String [] bugs = { "1._ Leon", "2._ Raton", "3._ Tigre", "4._ Aguila", "5._ Puerco", "6._ Araña", "7._ Serpiente", "8._ Elefante", "9._ Mono", "10._ cocodrilo"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println("Mi zoologico tiene 10 animales");
        System.out.println("que son: ");
        for(int i=0; i<bugs.length; i++){
            System.out.println(bugs[i]);
        }
    }
}













//tener un minimo de 10 animales
 //"Mi zoologico tiene N animales"
 //"Que son: "
 //1 monkey
//2 chimp
//3 tomkey
