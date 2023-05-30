/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author joaochoma
 */
public class Endereco {
    private int id;

    public Endereco(int id) {
        if (id != 0){
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }    
    
    public void setId(int id){
        this.id = id;
    }
}
