/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author joaochoma
 */
@Named
@SessionScoped
public class Calculadora implements Serializable {
    private double num1;
    private double num2;
    private double resultado;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void somar() {
        resultado = num1 + num2;
    }

    public void subtrair() {
        resultado = num1 - num2;
    }

    public void multiplicar() {
        resultado = num1 * num2;
    }

    public void dividir() {
        resultado = num1 / num2;
    }
}
