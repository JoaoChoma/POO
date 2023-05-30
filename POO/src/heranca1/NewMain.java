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
        Endereco end = new Endereco(1);
        
        Aluno joao = new Aluno("joao","","","", end);
        Professor p = new Professor("","","","", 12, joao, end);
        Analista leo = new Analista("","","","", "impressora", end);
        
        
        joao.getNome();
        joao.setNome("carlos");
        joao.getEnd();
        joao.getEnd().getId();
        joao.getEnd().setId(2);
        joao.getAltura();
        
        p.getA().getMatricula();
      
//        joao.setMatricula("230");
//        joao.setIdade("10");
//        joao.setNome("joao");
//        System.out.println(joao.getMatricula());
//        System.out.println(joao.getIdade());
//        System.out.println(joao.getNome());
//        joao.envelhecer();
//        System.out.println(joao.getIdade());
        
    }
    
}
