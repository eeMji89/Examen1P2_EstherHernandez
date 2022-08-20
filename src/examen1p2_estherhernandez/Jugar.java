
package examen1p2_estherhernandez;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Jugar {
    ArrayList<armas> arma = new ArrayList();
    ArrayList <jugadores> jug = new ArrayList();
    ArrayList<personajes> pr = new ArrayList();
     Random r = new Random();
     Date d = new Date();
    private String usuario;
    private int ID;
    private String contra;
    private personajes p;

    public Jugar() {
    }

    public ArrayList<armas> getArma() {
        return arma;
    }

    public void setArma(ArrayList<armas> arma) {
        this.arma = arma;
    }

    public ArrayList<jugadores> getJug() {
        return jug;
    }

    
    public String JugtoString() {
        return "Jugdores{" + "j" + jug + '}';
    }
    
    public void setJug(ArrayList<jugadores> jug) {
        this.jug = jug;
    }

    public ArrayList<personajes> getPr() {
        return pr;
    }

    public void setPr(ArrayList<personajes> pr) {
        this.pr = pr;
    }
    
 

public String contrasena(){
    String contra = "";
   
    int temp = 0;
    for (int i = 0; i < 10; i++) {
        temp = 97+r.nextInt(122);
        contra += (char) temp;
    }
    
    return contra;
}
public String usuario(){
    String user = "";
   
    int temp = 0;
    for (int i = 0; i < 10; i++) {
        temp = 97+r.nextInt(122);
        user += (char) temp;
    }
    
    return user;
}
public int Id(){
    int temp;
    boolean v= true;
    for (int j = 0; j < 10; j++) {
    temp = 1+ r.nextInt(500);
        for (int i = 0; i < jug.size(); i++) {
            if (temp == jug.get(i).getID()) {
                v = false;
            }
            else{
                v = true;
            }
        }
        if (v==true) {
            ID = temp;
        }
    }
    return ID;
}

public ArrayList jugador(){
        
for (int i = 3; i < 60; i++) {
    int cont = 0;

    jug.add(i,new jugadores(usuario,Id(),contra,pr.get(1+r.nextInt(2))));
    
}

return jug;
}


int b = jug.size();
public int busqueda(ArrayList a,int p){
    
    
    return busqueda(a,p);
}

public void inicio(){
    jugador();
    int contj = jug.size();
    String entrada = "";
    for (jugadores object : jug) {
        entrada+= "El jugador ["+ jug.get(ID).getID()+"]"+jug.get(ID).getUsuario()+" ha ingresado a la partida\n";
    }
    System.out.println(entrada);
    
   // while(){
        
   // }

    
}
}