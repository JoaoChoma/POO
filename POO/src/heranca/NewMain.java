/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

import java.util.ArrayList;

/**
 *
 * @author joaochoma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Animal> ar = new ArrayList<Animal>();
        ArrayList<Cachorro> dogsss = new ArrayList<Cachorro>();
        
        Cachorro dog = new Cachorro();
        
        dog.fazerSom();
        
        
        
        Inseto i = new Inseto();
        i.fazerSom();
        
        Inseto pug = new Inseto();
        
        
        ar.add(dog);
        ar.add(i);
        ar.add(pug);
        
        Animal b = new Cachorro();
        
        b.fazerSom();
        
    }
    
}
