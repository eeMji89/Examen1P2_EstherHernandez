
package examen1p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class fortaleza extends personajes {

    public fortaleza() {
    }

    public fortaleza(String nombre, int vida, int escudo, armas a) {
        super(nombre, vida, escudo, a);
    }

    @Override
    public String toString() {
        return super.toString()+"fortaleza{" + '}';
    }

    @Override
    public void ataque() {
       
    }
    
}
