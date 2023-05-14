/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrata;

/**
 *
 * @author joaochoma
 */
public abstract class Entidade {
    int x, y, velocidade;

    public Entidade(int x, int y, int velocidade) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
    }
    
    public abstract void mover();
    
    public void renderizar(){
        System.out.println("Renderizei");
    }
    
}
