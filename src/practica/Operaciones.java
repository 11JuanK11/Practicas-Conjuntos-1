/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    private static File F = new File("./src/practica/Information/Information.txt");
    
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
