
package practica;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class PracticaConjuntos1 {

    public static void main(String[] args) {
        Set<Hotel> Array = new HashSet(Operaciones.Recuperar());
        
        int Opc = 0;
        
        do{
            Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar nuevo hotel.\n"
                                                                                    + "2. Menú listar.\n"
                                                                                    + "0. Salir.", "MENU PRINCIPAL", 0));
            
            switch (Opc) {
                case 1:
                    Array = Operaciones.Ingresar(Array);
                    Operaciones.ListarConjunto(Array);
                    break;
                
                case 2:
                    
                    break;

                case 0:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta.");
            }        
        }while(Opc != 0);
        
    }
    
}
