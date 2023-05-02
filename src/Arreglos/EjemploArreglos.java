package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        String [] bugs = { "Leon", "Raton", "Tigre", "Aguila", "Puerco", "Araña", "Serpiente", "Elefante", "Mono", "cocodrilo"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println("Mi zoologuco tiene tantos animales");
        System.out.println(" que son: ");
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