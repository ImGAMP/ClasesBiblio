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
public abstract class Texto {
    private String Id; //5 letras- 1 numero
    private String Titulo;
    private int ISBN;
    private String Autor;
    private int Año;
    private boolean Disponible;
    private ArrayList Reservacion;
    private Arrays PalabrasClaves;

    public Texto(String Id, String Titulo, int ISBN, String Autor, int Año, boolean Disponible, ArrayList Reservacion, Arrays PalabrasClaves) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Año = Año;
        this.Disponible = Disponible;
        this.Reservacion = Reservacion;
        this.PalabrasClaves = PalabrasClaves;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    

    public Arrays getPalabrasClaves() {
        return PalabrasClaves;
    }

    public void setPalabrasClaves(Arrays PalabrasClaves) {
        this.PalabrasClaves = PalabrasClaves;
    }
    

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public ArrayList getReservacion() {
        return Reservacion;
    }

    public void setReservacion(ArrayList Reservacion) {
        this.Reservacion = Reservacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
}
