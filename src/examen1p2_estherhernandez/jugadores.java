
package examen1p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class jugadores {
    private String usuario;
    private int ID;
    private String contra;
    private personajes p;

    public jugadores() {
        
    }

    public jugadores(String usuario, int ID, String contra, personajes p) {
        this.usuario = usuario;
        this.ID = ID;
        this.contra = contra;
        this.p = p;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public personajes getP() {
        return p;
    }

    public void setP(personajes p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "jugadores{" + "usuario=" + usuario + ", ID=" + ID + ", contra=" + contra + ", p=" + p + '}';
    }
    
    
}
