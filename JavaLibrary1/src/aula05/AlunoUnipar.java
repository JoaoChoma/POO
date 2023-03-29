/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author joaochoma
 */
public class AlunoUnipar {
    String nome;
    String segundoNome;
    int idade;
    int matricula;
    int nota = 0;
    String curso;
    
    //acao
    public void estudar(){
        if(this.nota <= 10){
            this.nota = nota + 1;
        }
    }
    //acao
    public void fazerAtividade(int pontos){
        if(this.nota <= 10){
            this.nota = nota + pontos;
        }
    }
    
    
    
    public AlunoUnipar(){
        
    }

    public AlunoUnipar(String nome, String segundoNome, int idade) {
        this.nome = nome;
        this.segundoNome = segundoNome;
        this.idade = idade;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
}
