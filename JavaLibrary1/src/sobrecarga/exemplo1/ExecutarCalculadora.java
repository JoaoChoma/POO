/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga.exemplo1;

/**
 *
 * @author joaochoma
 */
public class ExecutarCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();
        int res = calc.somar(10, 10);
        double res2 = calc.somar(10.5, 10.5);
        double resultado = calc.somar(10, 14.6);
        System.out.println(resultado);
    }
    
}
