/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMagasin;

/**
 *
 * @author Noé
 */
public class Client {
    private int id;
    private String email;
    private String Nom;
    public Client(int id, String email, String Nom) {
        this.id = id;
        this.email = email;
        this.Nom = Nom;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return Nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", email=" + email + ", Nom=" + Nom + '}';
    }
    
   
    
    
}
