/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author joaochoma
 */
public class Calculadorav2 {
   // Atributos
   private double valor1;
   private double valor2;

   // Método construtor
   public Calculadorav2(double valor1, double valor2) {
      this.valor1 = valor1;
      this.valor2 = valor2;
   }

   // Métodos para realizar operações matemáticas
   public double somar() {
      return valor1 + valor2;
   }

   public double subtrair() {
      return valor1 - valor2;
   }

   public double multiplicar() {
      return valor1 * valor2;
   }

   public double dividir() {
      return valor1 / valor2;
   }
}
