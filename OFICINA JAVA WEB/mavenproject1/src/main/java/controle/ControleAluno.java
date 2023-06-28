/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

/**
 *
 * @author joaochoma
 */
@Named
@SessionScoped
public class ControleAluno implements Serializable {
    //estrutura de dados
    private List<Aluno> listaAlunos = new ArrayList<Aluno>();
    // regra do jsf
    private Aluno aluno = new Aluno();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        aluno = new Aluno();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void removerAluno(Aluno aluno) {
        listaAlunos.remove(aluno);
    }

    public void atualizarAluno(Aluno aluno) {
        // Implemente a lógica para atualizar o aluno na lista
    }

    public Aluno buscarAluno(String ra) {
        // Implemente a lógica para buscar um aluno na lista pelo RA
        return null;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
