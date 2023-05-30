/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga.exemplo;

import java.util.Scanner;

/**
 *
 * @author joaochoma
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, resultado;
        int operacao;
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                resultado = calc.soma(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calc.subtracao(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicacao(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = calc.divisao(valor1, valor2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}
