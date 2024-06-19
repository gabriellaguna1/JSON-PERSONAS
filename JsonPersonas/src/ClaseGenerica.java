import java.util.ArrayList;
import java.util.List;

public class ClaseGenerica <T>{
    private List<T>personasMayoresDeEdad= new ArrayList<>();

    public ClaseGenerica() {
    }

    public ClaseGenerica(List<T> personasMayoresDeEdad) {
        this.personasMayoresDeEdad = personasMayoresDeEdad;
    }

    public List<T> getPersonasMayoresDeEdad() {
        return personasMayoresDeEdad;
    }

    public void setPersonasMayoresDeEdad(List<T> personasMayoresDeEdad) {
        this.personasMayoresDeEdad = personasMayoresDeEdad;
    }
}
