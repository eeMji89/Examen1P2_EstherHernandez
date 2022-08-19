
package examen1p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class rastreador extends personajes {

    public rastreador() {
    }

    public rastreador(String nombre, int vida, int escudo, armas a) {
        super(nombre, vida, escudo, a);
    }

    @Override
    public String toString() {
        return super.toString()+"rastreador{" + '}';
    }

    @Override
    public void ataque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
