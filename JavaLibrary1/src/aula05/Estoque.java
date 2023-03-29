/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaochoma
 */
public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Estoque{" + "produtos=" + produtos + '}';
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public Produto consultarProduto(String nome) {
        for (Produto produto : this.produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
}
