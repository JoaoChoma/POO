/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;

/**
 *
 * @author joaochoma
 */
public class Executor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autor autor = new Autor("joao", "123123", "brasileiro", 60);
        Editora editora = new Editora("Atica", "1123123123");
        

        Livro livro1 = new Livro("Pequeno principe", autor, editora);
        Livro livro2 = new Livro("JavaScript", autor, editora);
        Livro livro3 = new Livro("Java", autor, editora);

        Biblioteca lib = new Biblioteca();
        
        lib.inserir(livro1);
        lib.inserir(livro2);
        lib.inserir(livro3);
        
        System.out.println(lib.buscar("JavaScript").getTitulo());
        System.out.println(lib.buscar("JavaScript").getAutor().getNome());
        

    }
    
}
