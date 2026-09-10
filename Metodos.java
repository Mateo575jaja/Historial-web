import java.util.Stack;

public class Metodos {

    // VISITAR UNA NUEVA PÁGINA
    public void visitarPagina(Stack<PaginaWeb> pila, String url, String titulo, String fechaAcceso) {

        PaginaWeb pagina = new PaginaWeb();

        pagina.setUrl(url);
        pagina.setTitulo(titulo);
        pagina.setFechaAcceso(fechaAcceso);

        pila.push(pagina);
    }

    // RETROCEDER
    public void retroceder(Stack<PaginaWeb> pila) {

        if (pila.isEmpty()) {
            System.out.println("No hay páginas para retroceder.");
        } else {

            pila.pop();

            if (pila.isEmpty()) {
                System.out.println("No hay una página anterior.");
            } else {
                PaginaWeb pagina = pila.peek();

                System.out.println("Página anterior:");
                System.out.println("Título: " + pagina.getTitulo());
                System.out.println("URL: " + pagina.getUrl());
                System.out.println("Fecha: " + pagina.getFechaAcceso());
            }
        }
    }

    // VER HISTORIAL
    public void mostrarHistorial(Stack<PaginaWeb> pila) {

        if (pila.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {

            System.out.println("\n===== HISTORIAL =====");

            for (PaginaWeb pagina : pila) {

                System.out.println("----------------------");
                System.out.println("Título: " + pagina.getTitulo());
                System.out.println("URL: " + pagina.getUrl());
                System.out.println("Fecha: " + pagina.getFechaAcceso());
            }
        }
    }
}