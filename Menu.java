import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Web> pila = new Stack<>();

        Metodos m = new Metodos();

        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingrese la URL:");
            String url = sc.nextLine();

            System.out.println("Ingrese el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la fecha:");
            String fecha = sc.nextLine();

            m.LLenarPila(pila, url, nombre, fecha);

            System.out.println("¿Desea continuar?");
            System.out.println("Si / No");

            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }
    }
}