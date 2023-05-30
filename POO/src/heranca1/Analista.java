/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author joaochoma
 */
public class Analista extends Pessoa{
    private String funcao;
    
    public Analista(String nome, String idade, String altura, String peso, String f, Endereco end) {
        super(nome, idade, altura, peso, end);
        this.funcao = f;
    }
    
}
