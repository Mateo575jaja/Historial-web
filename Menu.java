import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public void iniciar() {

        Scanner sc = new Scanner(System.in);

        Stack<PaginaWeb> pila = new Stack<>();

        Metodos m = new Metodos();

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n===== NAVEGADOR WEB =====");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver historial");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción:");

            String opcion = sc.nextLine();

            switch (opcion) {

                case "1":

                    System.out.println("Ingrese la URL:");
                    String url = sc.nextLine();

                    System.out.println("Ingrese el título:");
                    String titulo = sc.nextLine();

                    System.out.println("Ingrese la fecha de acceso:");
                    String fechaAcceso = sc.nextLine();

                    m.visitarPagina(pila, url, titulo, fechaAcceso);

                    System.out.println("Página agregada correctamente.");

                    break;

                case "2":

                    m.retroceder(pila);

                    break;

                case "3":

                    m.mostrarHistorial(pila);

                    break;

                case "4":

                    continuar = false;
                    System.out.println("Hasta luego.");

                    break;

                default:

                    System.out.println("Opción no válida.");

                    break;
            }
        }
    }
}