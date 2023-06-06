/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaochoma
 */
public class ProdutoDAO {
    // atributo
    private List<Produto> produtos;  // banco dados

    public ProdutoDAO() {
        produtos = new ArrayList<>();
    }
    
    

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
                break;
            }
        }
    }

    public void removerProduto(int id) {
        Produto produtoRemover = null;
        for (Produto p : produtos) {
            if (p.getId() == id) {
                produtoRemover = p;
                break;
            }
        }
        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
