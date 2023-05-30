/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoExcecao;

import java.util.Scanner;

/**
 *
 * @author joaochoma
 */
public class Tratamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, resultado;
        
        while(true){
            System.out.println("Valor de a:");
            a = sc.nextInt();
            System.out.println("Valor de b:");
            b = sc.nextInt();
            
            Divisao div = new Divisao(a,b);
            div.dividir();
            System.out.println(div.imprimirResulta());

//            try{
//                resultado = a/b;
//
//                System.out.println("resultado a/b = "+ resultado);
//            }catch(ArithmeticException e){
//                System.out.println(e.toString());
//                System.out.println(e.getMessage());
//                System.out.println("Deu erro mesmo");
//            }
        }
    }
    
}
