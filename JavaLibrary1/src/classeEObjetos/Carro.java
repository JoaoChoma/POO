/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeEObjetos;

/**
 *
 * @author joaochoma
 */
    public class Carro {
    // atributos da classe
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    // construtor da classe
    public Carro(String modelo, String marca, int ano, String cor, int velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    

    // métodos da classe
    public void acelerar(int incremento) {
        if (this.velocidadeAtual + incremento <= this.velocidadeMaxima) {
            this.velocidadeAtual += incremento;
        } else {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void frear(int decremento) {
        if (this.velocidadeAtual - decremento >= 0) {
            this.velocidadeAtual -= decremento;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // método toString para exibir informações do carro
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
