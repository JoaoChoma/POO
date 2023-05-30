/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud2;

import java.util.List;

/**
 *
 * @author joaochoma
 */
public class Executor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto p1 = new Produto(4, "Camiseta", 29.99);
        
       
        // Adicionando produtos
        produtoDAO.adicionarProduto(new Produto(1, "Camiseta", 29.99));
        produtoDAO.adicionarProduto(new Produto(2, "Calça", 59.99));
        produtoDAO.adicionarProduto(new Produto(3, "Tênis", 99.99));

        
        // Listando produtos
        List<Produto> produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println(produto);
            //System.out.println(produto.getNome());
        }

        // Atualizando produto
        Produto produtoAtualizado = new Produto(2, "Calça Jeans", 69.99);
        produtoDAO.atualizarProduto(produtoAtualizado);

        // Buscando produto
        Produto produtoEncontrado = produtoDAO.buscarProduto(2);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Removendo produto
        produtoDAO.removerProduto(3);

        // Listando produtos atualizados
        produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    
}
