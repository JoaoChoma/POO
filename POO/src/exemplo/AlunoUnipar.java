/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author joaochoma
 */
public class AlunoUnipar {
    private String nome;
    private int nota;
    public int media;
    
    ///// set
    public void setNome(String nomeParametro){
        this.nome = nomeParametro;
    }
    
    public void setNota(int notaParametro){
        this.nota = notaParametro;
    }
    
    ///// get
    public String getNome(){
        return nome;
    }
    
    public int getNota(){
        return nota;
    }
    
    
    
    
    
    
    
    
    
    
    public String aprovarAluno(){
        this.nota = 100;
        return "Aprovado";
    }
    
    public void atributoParametro(String nome){
        this.nome = nome;
    }
    
    
}
