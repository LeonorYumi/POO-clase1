import java.util.Scanner;
public class Jugador {
    String nombre, posicion;
    int edad, camiseta;
    public Jugador(String nombre, String posicion, int edad, int camiseta) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.camiseta = camiseta;
    }
    void registrado(){
        System.out.println("=== Nuevo jugador ===");
        System.out.println("Nombre: "+nombre);
        System.out.println("Posicion: "+posicion);
        System.out.println("Edad: "+edad);
        System.out.println("Camiseta: "+camiseta);
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("-----Bienvenido al sistema ------");
        System.out.printf("Ingrese el nombre del jugador: ");
        String nom1 = scaner.nextLine();
        System.out.printf("Ingrese su posicion: ");
        String pos1 = scaner.nextLine();
        Jugador j1 = new Jugador(nom1,pos1, 21,12);
        System.out.printf("Ingrese el nombre del jugador: ");
        String nom2 = scaner.nextLine();
        System.out.printf("Ingrese su posicion: ");
        String pos2 = scaner.nextLine();
        Jugador j2 = new Jugador(nom2, pos2, 19,18);
        System.out.printf("Ingrese el nombre del jugador: ");
        String nom3 = scaner.nextLine();
        System.out.printf("Ingrese su posicion: ");
        String pos3 = scaner.nextLine();
        Jugador j3 = new Jugador(nom3, pos3, 21,1);
        j1.registrado();
        j2.registrado();
        j3.registrado();
    }
}
