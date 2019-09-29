package Data;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Libro extends Texto{
    private ArrayList Index;
    private String Editorial;
    private int Edicion;

    public Libro(ArrayList Index, String Editorial, int Edicion, String Id, String Titulo, int ISBN, String Autor, int Año, boolean Disponible, ArrayList Reservacion, Arrays PalabrasClaves) {
        super(Id, Titulo, ISBN, Autor, Año, Disponible, Reservacion, PalabrasClaves);
        this.Index = Index;
        this.Editorial = Editorial;
        this.Edicion = Edicion;
    }

    

    public ArrayList getIndex() {
        return Index;
    }

    public void setIndex(ArrayList Index) {
        this.Index = Index;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }
    
}
