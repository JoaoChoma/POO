/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observacoes;

/**
 *
 * @author joaochoma
 */
public class TesteDeCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor mercedes = new Motor();
        
        Carro mustang = new Carro();
        
        mercedes.setCilindrada(130);
        mercedes.setPotencia(130);
        
        mustang.setMarca("Ford");
        mustang.setVelocidade(200);
        mustang.setMotor(mercedes);
        
        System.out.println(mustang.getMotor().getCilindrada());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
