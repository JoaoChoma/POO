/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaContatos;

/**
 *
 * @author joaochoma
 */
public class AgendaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GerenciadorAgenda gerenciador = new GerenciadorAgenda();

        gerenciador.adicionarContato("João", "123456789");
        gerenciador.adicionarContato("Maria", "987654321");

        gerenciador.adicionarEvento("Reunião", "2021-10-20");
        gerenciador.adicionarEvento("Aniversário", "987654321");
        
        gerenciador.buscarContatos("João");
        gerenciador.buscarEventos("Aniversário");
        
        
    }
    
}
