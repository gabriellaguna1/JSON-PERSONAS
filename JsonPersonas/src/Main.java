import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        GestionDePersonas g= new GestionDePersonas();
        g.deJsonAArreglo();
        g.mostrarPersonas();
    }
}