
package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author acxel
 */
public class Archivo {
    
    private final File archivo;
    private FileWriter escribir;
    
    public Archivo() {
        this.archivo = new File("agenda.txt");
    }
    
    public void crearArchivo() {
        try {
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo satisfactoriamente");
            }
        } catch (IOException ex) {
            System.err.println("Error -> "+ex.getMessage());
        }
    }
    
    public void escribirEntxt(Persona persona) {
        try {
            escribir = new FileWriter(archivo, true);
            escribir.write(persona.getNombre()+" - "+persona.getTelefono()+" - "+persona.getCorreo()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error -> "+ex.getMessage());
        }
    }
}
