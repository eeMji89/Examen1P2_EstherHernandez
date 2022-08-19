
package examen1p2_estherhernandez;

/**
 * @author ELIZABETH HERNANDEZ
 */
public class personajes {
    private String nombre;
    private int vida;
    private int escudo;
    private armas a;

    public personajes() {
    }

    public personajes(String nombre, int vida, int escudo, armas a) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.a = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public armas getA() {
        return a;
    }

    public void setA(armas a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "personajes{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", a=" + a + '}';
    }
    
}
