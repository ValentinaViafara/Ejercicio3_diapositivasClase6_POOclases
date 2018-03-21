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
public class Main {
    public static void main(String []args){
        TiendaVirtual miDiscoTienda= new TiendaVirtual();
        Disco disco= new Disco("Musica por dentro","Tercer cielo", "Pop"," Cantantes");
        Canción cancion= new Canción("Por fe", 2000, "3:40","2 Gb", 300 );
      Canción cancion2= new Canción("Yo te extrañare", 2500, "2:40","1.75 Gb", 300); 
      Canción cancion3=new Canción("Un día te veré", 3000, "3:00", "2 Gb", 300);
      
      disco.añadirCancion(cancion);
      disco.añadirCancion(cancion2);
      disco.añadirCancion(cancion3);
      
      miDiscoTienda.añadirDisco(disco);
      miDiscoTienda.mostrarCancion("Por fe", "Musica por dentro");
      miDiscoTienda.mostrarCancion("Yo te extrañare", "Musica por dentro");
      miDiscoTienda.mostrarCancion("n", "d");
    }
}
