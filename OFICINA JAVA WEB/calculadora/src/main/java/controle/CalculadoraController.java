/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import modelo.Calculadora;

/**
 *
 * @author joaochoma
 */
@Named
@RequestScoped
public class CalculadoraController {
    @Inject
    private Calculadora calculadora;

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}