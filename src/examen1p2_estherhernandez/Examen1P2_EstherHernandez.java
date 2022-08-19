
package examen1p2_estherhernandez;

import java.util.ArrayList;

/**
 * @author ELIZABETH HERNANDEZ
 */
public class Examen1P2_EstherHernandez {

    public static void main(String[] args) {
         ArrayList<armas> arma = new ArrayList();
        ArrayList <jugadores> jug = new ArrayList();
        ArrayList<personajes> pr = new ArrayList();
        pr.add(0,new medico("LifeLine",100,50,arma.get(0)));
        pr.add(0,new rastreador("Vantaje",100,50,arma.get(1)));
         pr.add(0,new fortaleza("Gibby",125,50,arma.get(2)));
        //-----------------------------------------------------------
       
        arma.add(0,new armas("FlatLine",10,80));
        arma.add(1,new armas("Carabina",15,90));
        arma.add(2,new armas("PeaceFinder",30,40));
        //--------------------------------------------------------------
        jug.add(new jugadores("Lechuga",543,"conraseña",pr.get(0)));
        
    }
    
}
