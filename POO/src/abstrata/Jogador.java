/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrata;

/**
 *
 * @author joaochoma
 */
public class Jogador extends Entidade{

    public Jogador(int x, int y, int velocidade) {
        super(x, y, velocidade);
    }

    @Override
    public void mover() {
        System.out.println("O jogador morre");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
