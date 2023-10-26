
package practica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {
    
    public static ArrayList<Hotel>  Ingresar(ArrayList<Hotel> Array){
        String Zona = "", Nom = "";
        int ID = 0, Precio = 0;
        Hotel H = new  Hotel();
        String Vector[] = {"Playa","Rural","Montaya","Playa,Rural","Montaya,Rural","Montaya,Playa","Playa,Montaña,Rural"};
        Object St = "";
        String S = ListarConjunto(Array);
        
        St = JOptionPane.showInputDialog(null, S + "\nEn que zona desea registrar el hotel", "ELEGIR", JOptionPane.QUESTION_MESSAGE,null,Vector, Vector[0]);
        Zona = St.toString();
        H.setZona(Zona);
        
        Nom = JOptionPane.showInputDialog(null, "Ingrese el nombre del hotel:");
        H.setNombre(Nom);
        
        ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el identificador del hotel:"));
        H.setIDHotel(ID);
        
        do{
            Precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del hotel(Entre 40 y 150):"));  
            if (Precio < 40 || Precio > 150){
                JOptionPane.showMessageDialog(null, "El precio ingresado no está dentro del rango permitido.");
            }
        } while(Precio < 40 || Precio > 150);
        H.setPrecio(Precio);
        
        Array.add(H);
        return Array;
    }
    
    public static String ListarConjunto(ArrayList<Hotel> Array){
        String S = "Hoteles\n";
        
        for (int i = 0; i < Array.size(); i++) {
            S = "ID: " + Array.get(i).getIDHotel() + " Nombre: " + Array.get(i).getNombre() 
                + " Zona: " + Array.get(i).getZona() + " Precio: " + Array.get(i).getPrecio() + "\n";
        }
     
        return S;
    }
    
    public static void ListarOrdenadoPrecio(){
        
    }
}
