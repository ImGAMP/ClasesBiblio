/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Revista extends Texto {
    private ArrayList Index;
    private String Editorial;
    private int Serial;

    public Revista(ArrayList Index, String Editorial, int Serial, String Id, String Titulo, int ISBN, String Autor, int Año, boolean Disponible, ArrayList Reservacion, Arrays PalabrasClaves) {
        super(Id, Titulo, ISBN, Autor, Año, Disponible, Reservacion, PalabrasClaves);
        this.Index = Index;
        this.Editorial = Editorial;
        this.Serial = Serial;
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

    public int getSerial() {
        return Serial;
    }

    public void setSerial(int Serial) {
        this.Serial = Serial;
    }
    
}
