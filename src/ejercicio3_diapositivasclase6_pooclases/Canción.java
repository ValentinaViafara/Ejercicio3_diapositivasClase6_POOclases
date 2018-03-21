
package ejercicio3_diapositivasclase6_pooclases;


public class Canción {
    private String nombre;
    private float precio;
    private String duracion;
    private String tamaño;
    private float calidad;

    public Canción(String nombre, float precio, String duracion, String tamaño, float calidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tamaño = tamaño;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public float getCalidad() {
        return calidad;
    }
    
    
    
}
