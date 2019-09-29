package Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Data.Usuario;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Lector extends Usuario{
    private int NumPrestamos;
    private ArrayList Historial;

    public Lector(int NumPrestamos, String Nickname, String Nombre, String Email, String Contraseña) {
        super(Nickname, Nombre, Email, Contraseña);
        this.NumPrestamos = NumPrestamos;
    }
    
    public int getNumPrestamos() {
        return NumPrestamos;
    }

    public void setNumPrestamos(int NumPrestamos) {
        this.NumPrestamos = NumPrestamos;
    }

    public ArrayList getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList Historial) {
        this.Historial = Historial;
    }
    
    
}
