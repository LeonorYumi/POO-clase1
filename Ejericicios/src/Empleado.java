import java.util.Scanner;
public class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fecha_ingreso;

    public Empleado(String nombre, String cargo, double salario, String fecha_ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }

    public void imprimir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----Actualizacion de Registro----");
        System.out.printf("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.printf("Ingrese el cargo del empleado: ");
        cargo = sc.nextLine();
        System.out.printf("Ingrese el salario del empleado: ");
        salario = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Ingrese la fecha de ingreso del empleado: ");
        fecha_ingreso = sc.nextLine();

        System.out.println("\n-----------------------------");
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Cargo del empleado: "+cargo);
        System.out.println("Salario del empleado: "+salario);
        System.out.println("Fecha de ingreso: "+fecha_ingreso);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("","",0.00 ,"" );
        empleado1.imprimir();
        Empleado empleado2 = new Empleado("","",0.00 ,"" );
        empleado2.imprimir();
        Empleado empleado3 = new Empleado("","",0.00 ,"" );
        empleado1.imprimir();
    }
}