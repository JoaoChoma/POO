/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca1;

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
        
        Aluno joao = new Aluno("","","","");
        joao.setMatricula("230");
        joao.setIdade("10");
        joao.setNome("joao");
        System.out.println(joao.getMatricula());
        System.out.println(joao.getIdade());
        System.out.println(joao.getNome());
        joao.envelhecer();
        System.out.println(joao.getIdade());
        
    }
    
}
