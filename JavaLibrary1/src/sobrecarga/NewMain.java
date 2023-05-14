/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

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
        Calculadorav2 calc = new Calculadorav2(10.00, 2.00);
      System.out.println("Soma: " + calc.somar());
      System.out.println("Subtração: " + calc.subtrair());
      System.out.println("Multiplicação: " + calc.multiplicar());
      System.out.println("Divisão: " + calc.dividir());
      
      Calculadora calc2 = new Calculadora();
        System.out.println(calc2.soma(10, 10));
        System.out.println(calc2.soma(10.5, 10.5));
  
    }
    
}
