/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaContatos;

/**
 *
 * @author joaochoma
 */
public class Evento {
    private String titulo;
    private String data;

    public Evento(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }
}
