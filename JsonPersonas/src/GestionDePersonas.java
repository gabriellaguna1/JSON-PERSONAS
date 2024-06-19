import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionDePersonas implements Serializable {
    private static final File jSonFile= new File("C:\\Users\\lagun\\IdeaProjects\\JsonPersonas\\generated.json");
    private Person[] listaDePersonas= deJsonAArreglo();

    public GestionDePersonas() throws IOException {
    }

    public GestionDePersonas(Person[] listaDePersonas) throws IOException {
        this.listaDePersonas = listaDePersonas;
    }

    public Person[] getListaDePersonas() {
        return listaDePersonas;
    }

    public void setListaDePersonas(Person[] listaDePersonas) {
        this.listaDePersonas = listaDePersonas;
    }

    public Person[] deJsonAArreglo() throws IOException {
       if (!jSonFile.exists()) {
           jSonFile.createNewFile();
       }
       try {
           ObjectMapper mapper = new ObjectMapper();
           return mapper.readValue(jSonFile, Person[].class);
       } catch (IOException e) {
           e.printStackTrace();
       }
       return null;
   }

   public void mostrarPersonas(){
        for(Person p: this.listaDePersonas){
            System.out.println(p);
        }
   }



}


