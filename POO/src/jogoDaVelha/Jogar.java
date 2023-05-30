/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoDaVelha;

import java.util.Scanner;

/**
 *
 * @author joaochoma
 */
public class Jogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //atributos
        Tabuleiro tabuleiro = new Tabuleiro();
        
        Jogador jogador1 = new Jogador("Joao", '/');
        Jogador jogador2 = new Jogador("Maria", '*');
        //atributos
        
        tabuleiro.imprimirTabuleiro();
        
        
        
        Scanner scanner = new Scanner(System.in);

        boolean jogoTerminado = false;
        tabuleiro.setJogadorAtual(jogador1);
        
        // aritmeticos + - * / **  xˆ2  % 
        // comparacao > < >= <= == != ------> !(<)
        // logicos && ||  !(&&) 
        

        while (!jogoTerminado) {
            
            tabuleiro.imprimirTabuleiro();
            
            System.out.println("Jogador " + tabuleiro.getJogadorAtual().getNome() + ", faça sua jogada.");
            System.out.print("Informe a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Informe a coluna (0-2): ");
            int coluna = scanner.nextInt();

            boolean movimentoValido = tabuleiro.realizarMovimento(linha, coluna, tabuleiro.getJogadorAtual());

            if (movimentoValido) {
                if (tabuleiro.verificarVitoria()) {
                    System.out.println("Parabéns, " + tabuleiro.getJogadorAtual().getNome() + "! Você venceu o jogo.");
                    jogoTerminado = true;
                } else if (tabuleiro.tabuleiroCompleto()) {
                    System.out.println("O jogo empatou!");
                    jogoTerminado = true;
                } else {
                    // Trocar para o próximo jogador
                    if (tabuleiro.getJogadorAtual() == jogador1) {
                        tabuleiro.setJogadorAtual(jogador2);
                    } else {
                        tabuleiro.setJogadorAtual(jogador1);
                    }
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
            // fim
        }
    
    }
}
