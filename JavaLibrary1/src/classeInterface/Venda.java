/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeInterface;

/**
 *
 * @author joaochoma
 */
public class Venda implements Contrato {
    private String nome;
    private int valor;
    private int adicional = 2;
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getValor() {
        return this.valor * this.adicional;
    }
    
}
