/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampada;

/**
 *
 * @author joaochoma
 */
public class Lampada {
    private boolean ligada = false;
    
    public void ligar(){
        if(this.ligada == true){
            new LampadaJaLigadaException();
        }else{
            this.ligada = true;
        }
    }
    
    public void desligar(){
        if(this.ligada == false){
            new LampadaJaDesligadaException();
        }else{
            this.ligada = false;
        }
    }
    
    
    
}
