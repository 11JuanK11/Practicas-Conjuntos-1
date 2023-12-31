
package practica;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Operaciones {
    private static File F = new File("./src/practica/Information/Information.txt");
    
    public static Set<Hotel> Ingresar(Set<Hotel> Array){
        String Zona = "", Nom = "";
        int ID = 0, Precio = 0;
        Hotel H = new  Hotel();
        String Vector[] = {"Playa","Rural","Montaña","Playa,Rural","Montaña,Rural","Montaña,Playa","Playa,Montaña,Rural"};
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
        ListarOrdenadoPrecio(Zona, Array);
        return Array;
    }
    
    public static String ListarConjunto(Set<Hotel> Array){
        String S = "Hoteles\n";
       
        for (Hotel hotel : Array) {
            S += "ID: " + hotel.getIDHotel() + " Nombre: " + hotel.getNombre() 
                + " Zona: " + hotel.getZona() + " Precio: " + hotel.getPrecio() + "\n";
        }
        return S;
    }
    
    public static void ListarOrdenadoPrecio(String zona, Set<Hotel> conj){
        ArrayList<Hotel> array = new ArrayList();
        for (Hotel object : conj) {
            if (object.Zona.equalsIgnoreCase(zona)) {
                array.add(object);
            }
        }
        SortedSet<Hotel> orden = new TreeSet(array);
        String S = "Hoteles\n";
        for (Hotel hotel : orden) {
            S += "ID: " + hotel.getIDHotel() + " Nombre: " + hotel.getNombre() 
                + " Zona: " + hotel.getZona() + " Precio: " + hotel.getPrecio() + "\n";
        }
        JOptionPane.showMessageDialog(null, S);
        
    }
        
    public static Set Recuperar(){
        Set<Hotel> conj = new HashSet();
        try {
            FileReader reader = new FileReader(F);
            BufferedReader buffer = new BufferedReader(reader);
            String S = "", vect[];
            while (S != null) {     
                S = buffer.readLine();
                vect = S.split(";");
                if (S != null) {
                    Hotel obj = new Hotel(Integer.parseInt(vect[0]), vect[1], vect[2],Integer.parseInt(vect[3]) );
                    conj.add(obj);
                }
            }
            buffer.close();
        } catch (Exception e) {}
        return conj;
    }
}
