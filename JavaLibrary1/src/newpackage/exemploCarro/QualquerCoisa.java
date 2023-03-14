/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage.exemploCarro;

/**
 *
 * @author joaochoma
 */
public class QualquerCoisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro polo = new Carro("Polo", "vw", 2000, "azul", 120);
        
        Carro gol = new Carro("gol", "vw",1990, "azul", 220);
        System.out.println(gol.toString());
        System.out.println("\n");
        gol.acelerar(100);
        
        System.out.println(polo.toString());
        polo.acelerar(120);
        System.out.println("\n");
        
        System.out.println(gol.getVelocidadeAtual()); 
        System.out.println(polo.getVelocidadeAtual()); 
        
        Carro2 golBola = new Carro2("175/70");
        
        
        System.out.println(golBola.getPneu());
    }
    
}
