package Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Articulo extends Texto {
    private ArrayList Tema;

    public Articulo(ArrayList Tema, String Id, String Titulo, int ISBN, String Autor, int Año, boolean Disponible, ArrayList Reservacion, Arrays PalabrasClaves) {
        super(Id, Titulo, ISBN, Autor, Año, Disponible, Reservacion, PalabrasClaves);
        this.Tema = Tema;
    }

    

    

    public ArrayList getTema() {
        return Tema;
    }

    public void setTema(ArrayList Tema) {
        this.Tema = Tema;
    }
    
}
