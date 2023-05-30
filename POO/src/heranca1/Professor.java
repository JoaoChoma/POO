/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author joaochoma
 */
public class Professor extends Pessoa{
    private int id;
    Aluno a;
    
    public Professor(String nome, String idade, String altura, String peso, int id, Aluno a, Endereco end) {
        super(nome, idade, altura, peso, end);
        this.id = id;
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public Aluno getA() {
        return a;
    }
    
    
}
