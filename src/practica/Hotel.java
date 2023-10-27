
package practica;

public class Hotel implements Comparable<Hotel> {
    int IDHotel;
    String Nombre;
    String Zona;
    int Precio;

    public Hotel(int IDHotel, String Nombre, String Zona, int Precio) {
        this.IDHotel = IDHotel;
        this.Nombre = Nombre;
        this.Zona = Zona;
        this.Precio = Precio;
    }
    
    public Hotel() {
        this.IDHotel = 0;
        this.Nombre = "";
        this.Zona = "";
        this.Precio = 0;
    }

    public int getIDHotel() {
        return IDHotel;
    }

    public void setIDHotel(int IDHotel) {
        this.IDHotel = IDHotel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public int compareTo(Hotel o) {
        return this.Precio - o.Precio;
    }
    
}
