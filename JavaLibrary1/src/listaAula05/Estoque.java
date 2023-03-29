/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAula05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaochoma
 */
public class Estoque {
    //lista Produtos
    
    
    private List<Produto> listaProdutos = new ArrayList<>();
    
    public void adicionar(Produto novoProduto){
        this.listaProdutos.add(novoProduto);
    }
    
    
    
   
    public Produto consultar(String nome){
        for(Produto p : this.listaProdutos){
            if(p.getNome()==nome){ //p.getNome().equals(nome)
                return p;
            }
        }
        return null;   
    }
    
    
    public void remover(Produto removerProduto){
        this.listaProdutos.remove(removerProduto);
    }
}
