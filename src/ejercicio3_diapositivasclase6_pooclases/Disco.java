/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_diapositivasclase6_pooclases;

/**
 *
 * @author Valentina
 */
public class Disco {
    private String nombre;
    private String artista;
    private String genero;
    private String foto;
    private Canción[] canciones;
    


    public Disco(String nombre, String artista, String genero, String foto) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.foto = foto;
        this.canciones = new Canción[50];
    }
    
    public String getNombreDisco(){
        return nombre;
    }

    public Canción[] getCanciones() {
        return canciones;
    }
    
    
    
    public boolean añadirCancion(Canción cancion){
        boolean proceso=false;
        for (int i = 0; i < 50; i++) {
           if(this.canciones[i]==null){
               canciones[i]=cancion;
               proceso=true;
               break;
           }
        }
        return proceso;
    }
   
    
    
}
