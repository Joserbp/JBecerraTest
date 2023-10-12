/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PL;

/**
 *
 * @author ALIEN 61
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ML.Usuario usuario = new ML.Usuario();
        usuario.setNombre("Isaac");
        PL.Usuario.Add(usuario);
    }
}
