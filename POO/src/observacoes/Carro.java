/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observacoes;

/**
 *
 * @author joaochoma
 */
public class Carro {
    private int velocidade;
    private String marca;
    
    private Motor motor;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String acelerar(){
        return "Acelerando.";
    }
    
    public String desligar(){
        return "Desligando";
    }
    
    
    
    
    
    
    
    
    
}
