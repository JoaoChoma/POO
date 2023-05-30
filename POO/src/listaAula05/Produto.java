/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAula05;

/**
 *
 * @author joaochoma
 */
public class Produto {
    private String nome;
    private String preco;
    private String quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

        
}
