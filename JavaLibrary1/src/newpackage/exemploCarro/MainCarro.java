/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage.exemploCarro;

/**
 *
 * @author joaochoma
 */
public class MainCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro gol = new Carro("gol", "vw",1990, "azul", 120);
        System.out.println(gol.toString());
        System.out.println("\n");
        gol.acelerar(100);
        System.out.println(gol.toString()); 
                
    }
    
}
