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
public class Biblioteca {
    ArrayList<Livro> lista = new ArrayList();
    
    
    public void inserir(Livro l){
        this.lista.add(l);
    } // create
    
    public void remover(Livro l){
        this.lista.remove(l);
    } // remove
    
    public Livro buscar(String nome){
        for(Livro l : this.lista){
            if(l.getTitulo().equals(nome)){
                return l;
            }
        }
        return null;
    } // search
    
    public void atualizar(String nomeLivro, String novoTitulo, Autor novoAutor, Editora novaEditora){
        for(Livro l : this.lista){
            if(l.getTitulo().equals(nomeLivro)){
                l.setAutor(novoAutor);
                l.setEditora(novaEditora);
                l.setTitulo(novoTitulo);
            }
        }
    } // update
}
