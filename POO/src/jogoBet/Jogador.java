/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoBet;

import java.util.Date;


/**
 *
 * @author joaochoma
 */
public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataDeNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelo;
    private int cartoesVermelho;
    private boolean suspenso;
    
    public Jogador(){
        
    }

    public Jogador(int id, String nome, String apelido, Date dataDeNascimento, int numero, String posicao, int qualidade, int cartoesAmarelo, int cartoesVermelho, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelo = cartoesAmarelo;
        this.cartoesVermelho = cartoesVermelho;
        this.suspenso = suspenso;
    }

    
    
    public boolean verificarCondicaoDeJogo(){
        if(this.cartoesAmarelo > 3 || this.cartoesVermelho >= 1){
            this.suspenso = false;
            return false;
        }
        this.suspenso = true;
        return true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoesAmarelo() {
        return cartoesAmarelo;
    }

    public int getCartoesVermelho() {
        return cartoesVermelho;
    }

   
    public boolean isSuspenso() {
        return suspenso;
    }
    
   
    
}
