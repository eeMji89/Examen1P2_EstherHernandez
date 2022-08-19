/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class medico extends personajes {

    public medico() {
    }

    public medico(String nombre, int vida, int escudo, armas a) {
        super(nombre, vida, escudo, a);
    }

    @Override
    public String toString() {
        return super.toString()+"medico{" + '}';
    }

    @Override
    public void ataque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
