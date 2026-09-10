import java.util.Stack;

public class MetodoRetro {

    private final Stack<PaginaWeb> pila;

    public MetodoRetro() {
        pila = new Stack<>();
    }

    public void retroceder() {
        if (pila.isEmpty()) {
            System.out.println("No hay páginas para retroceder.");
            return;
        }

        pila.pop();

        if (pila.isEmpty()) {
            System.out.println("No hay una página anterior.");
        } else {
            PaginaWeb paginaAnterior = pila.peek();
            System.out.println("Página anterior: " + paginaAnterior.url);
            System.out.println("Título: " + paginaAnterior.titulo);
        }
    }

    public static class PaginaWeb {
        private final String url;
        private final String titulo;

        public PaginaWeb(String url, String titulo) {
            this.url = url;
            this.titulo = titulo;
        }
    }

}
