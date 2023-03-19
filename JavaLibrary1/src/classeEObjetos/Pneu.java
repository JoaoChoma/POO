/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeEObjetos;

/**
 *
 * @author joaochoma
 */
public class Pneu {
    private String largura;
    private String altura;

    public Pneu(String largura, String altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Pneu() {
    }

    public String getLargura() {
        return largura;
    }

    public String getAltura() {
        return altura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pneu{" + "largura=" + largura + ", altura=" + altura + '}';
    }
    
    
}
