/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author joaochoma
 */
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String idade, String altura, String peso, Endereco end) {
        super(nome, idade, altura, peso, end);
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
   
    
}
