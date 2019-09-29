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
public abstract class Usuario {
   private String Nickname; //5 letras- 1 numero
   private String Nombre;
   private String Email;
   private String Contraseña;

    public Usuario(String Nickname, String Nombre, String Email, String Contraseña) {
        this.Nickname = Nickname;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Contraseña = Contraseña;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
   
}
