/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaAula05;

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
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        
        p1.setNome("joao");
        
        Estoque e = new Estoque();
        
        e.adicionar(p1);
        e.adicionar(p2);
        e.adicionar(p3);
        e.adicionar(p4);
        
        // objeto do tipo Produto
        String respostaConsulta = e.consultar("joao").getNome();
        //System.out.println(respostaConsulta.toString());
    }
    
}
