/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

import java.util.List;

/**
 *
 * @author joaochoma
 */
public class GerenciadorAgenda {
    private Agenda agenda;

    public GerenciadorAgenda() {
        agenda = new Agenda();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        agenda.adicionarContato(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void adicionarEvento(String titulo, String data) {
        Evento evento = new Evento(titulo, data);
        agenda.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    public void buscarContatos(String termo) {
        List<Contato> resultados = agenda.buscarContatos(termo);
        System.out.println("Resultados da busca por contatos:");
        for (Contato contato : resultados) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }

    public void buscarEventos(String termo) {
        List<Evento> resultados = agenda.buscarEventos(termo);
        System.out.println("Resultados da busca por eventos:");
        for (Evento evento : resultados) {
            System.out.println("Título: " + evento.getTitulo() + ", Data: " + evento.getData());
        }
    }
}
