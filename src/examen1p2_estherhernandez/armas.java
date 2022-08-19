
package examen1p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class armas {
    private String nombre;
    private int dano;
    private int precision;

    public armas() {
    }

    public armas(String nombre, int dano, int precision) {
        this.nombre = nombre;
        this.dano = dano;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "armas{" + "nombre=" + nombre + ", dano=" + dano + ", precision=" + precision + '}';
    }
    
    
}
