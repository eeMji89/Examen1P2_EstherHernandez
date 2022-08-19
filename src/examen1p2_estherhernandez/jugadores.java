
package examen1p2_estherhernandez;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class jugadores {
    Random r = new Random();
    private String usuario;
    private int ID;
    private String contra;
    private personajes p;
    ArrayList<armas> arma = new ArrayList();
    ArrayList <jugadores> jug = new ArrayList();
    ArrayList<personajes> pr = new ArrayList();
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
    
    public ArrayList jugador(){
        
        jug.add(0,new jugadores("Lechuga",543,"contraseña",pr.get(0)));
        jug.add(1,new jugadores("Loco Bryan",23,"contraseña",pr.get(1)));
        jug.add(2,new jugadores("Lechuga",2,"contraseña",pr.get(2)));
        for (int i = 3; i < 60; i++) {
            int cont = 0;
            for (int j = 0; j < 10; j++) {
               // usuario += ;
               ID = 1+ r.nextInt(500);
            }
            jug.add(i,new jugadores(usuario,ID,contra,pr.get(cont)));
            if (cont ==0) {
                cont = 2;
            }
            else if(cont ==2){
                cont=1;
            }
            else{
                cont = 0;
                }
        }
        return jug;
    }
}
