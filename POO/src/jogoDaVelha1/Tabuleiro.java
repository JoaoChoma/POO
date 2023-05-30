/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoDaVelha1;

/**
 *
 * @author joaochoma
 */
public class Tabuleiro {
    private Jogador jogador;
    private char[][] caderno;

    public Tabuleiro() {
        this.jogador = null;
        this.caderno = new char[3][3];        
    }
    
    void inicializarCaderno(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                caderno[i][j] = '-';
            }
        }
    }
    
    void imprimirTabuleiro(){
        
    }
    
}
