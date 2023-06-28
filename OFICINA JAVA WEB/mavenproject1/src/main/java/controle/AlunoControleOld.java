/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;


/**
 *
 * @author joaochoma
 */


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import modelo.Aluno;

@Named
@ApplicationScoped
public class AlunoControleOld {
    private Aluno aluno = new Aluno();

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void salvar() {
        System.out.println("Nome do Aluno: " + aluno.getNome() + " R.A. : "+ aluno.getRa());
    }
}

