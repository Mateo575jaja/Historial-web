import java.util.Stack;

public class Metodos {

    public void LLenarPila(Stack<Web> pila, String url, String titulo, String fechaAcceso) {

        Web w = new web();

        w.setUrl(url);
        w.setTitulo(titulo);
        w.setFechaAcceso(fechaAcceso);

        pila.push(w);
    }
}