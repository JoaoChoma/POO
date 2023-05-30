/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenca;

/**
 *
 * @author joaochoma
 */
// Exemplo de uso
public class ExemploHeranca {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Vira-lata");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Raça: " + cachorro.getRaca());
        cachorro.emitirSom(); // método da superclasse
        cachorro.latir(); // método da subclasse
    }
}
