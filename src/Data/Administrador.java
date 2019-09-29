package Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Administrador extends Usuario {
    private int Pin;

    public Administrador(int Pin, String Nickname, String Nombre, String Email, String Contraseña) {
        super(Nickname, Nombre, Email, Contraseña);
        this.Pin = Pin;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    
    
    
}
