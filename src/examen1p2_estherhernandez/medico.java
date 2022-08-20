/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_estherhernandez;
import java.util.Random;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class medico extends personajes {
Random rd = new Random();
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
    }

    @Override
    public double dan(int dan) {
        
    }

    @Override
    public double vida(int vida) {
        vida = vida +(vida*(1+rd.nextInt(10)));
        return vida;
    }

    @Override
    public double precision(int pr) {
    }

   
}
