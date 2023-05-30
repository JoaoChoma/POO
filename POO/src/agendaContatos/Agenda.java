/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaochoma
 */
public class Agenda {
    private List<Contato> contatos;
    private List<Evento> eventos;

    public Agenda() {
        contatos = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Contato> buscarContatos(String termo) {
        List<Contato> resultados = new ArrayList<>();
        for (Contato contato : contatos) {
            if (contato.getNome().contains(termo) || contato.getTelefone().contains(termo)) {
                resultados.add(contato);
            }
        }
        return resultados;
    }

    public List<Evento> buscarEventos(String termo) {
        List<Evento> resultados = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.getTitulo().contains(termo) || evento.getData().contains(termo)) {
                resultados.add(evento);
            }
        }
        return resultados;
    }
}
