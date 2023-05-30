/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author joaochoma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //AlunoUnipar joao = new AlunoUnipar("joao", "joao", 30); 
        //System.out.println("Nota: " + joao.getNota());
        //joao.estudar();
        //joao.fazerAtividade(5);
        //System.out.println("Nota: " + joao.getNota());
        
        Produto p = new Produto("leite",10.00,100);
        Estoque e = new Estoque();
        e.adicionarProduto(p);
        
        //Produto[] vetorProdutos = new Produto[5];
        
        //vetorProdutos[1].setNome("joao");
        //System.out.println(vetorProdutos[1].getNome());
        
    }
    
}
