/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoExcecao;

/**
 *
 * @author joaochoma
 */
public class Divisao {
    int a;
    int b;
    int resultado;

    public Divisao(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void dividir(){
        try{
            this.resultado = this.a / this.b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
    public int imprimirResulta(){
        return resultado;
    }
}
