/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;

/**
 *
 * @author joaochoma
 */
public class Exemplo {
    ArrayList<Autor> lista = new ArrayList<>();
    
    public void criarAutor(Autor a){
        this.lista.add(a);
    }
    
    public Autor buscarAutor(Autor a){
        for(Autor b : this.lista){
            if(b.getNome() == null ? a.getNome() == null : b.getNome().equals(a.getNome())){ //p.getNome().equals(nome)
                return b;
            }
        }
        return null;  
    }
    
    public void removerAutor(Autor a){
        this.lista.remove(a);
    }
}
