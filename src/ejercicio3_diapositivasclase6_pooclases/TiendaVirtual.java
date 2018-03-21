
package ejercicio3_diapositivasclase6_pooclases;

public class TiendaVirtual {
    
    
    private Disco[] discos;
    
    public TiendaVirtual(){
        this.discos=new Disco[50];
    }
    
    public void mostrarCancion(String nombreCancion, String nombreDisco){
        int auxi=-1;
        int auxj=-1;
        boolean proceso=false;
        for (int i = 0; i < 50; i++) {
            if(discos[i]!=null){
            if(discos[i].getNombreDisco().equals(nombreDisco)){
            for (int j = 0; j < 50; j++) {
                if(discos[i].getCanciones()[j].getNombre().equals(nombreCancion)){
                    proceso= true;
                    auxi=i;
                    auxj=j;
                    break;
                } else {
                }
            }
            }
            }
        }
            if(proceso){
            System.out.println("La canción "+discos[auxi].getCanciones()[auxj].getNombre()+" del disco "+ discos[auxi].getNombreDisco()+ ", tiene un precio de "+ discos[auxi].getCanciones()[auxj].getPrecio()+" pesos, con una duración de "+ discos[auxi].getCanciones()[auxj].getDuracion()+" minutos, de tamaño " +discos[auxi].getCanciones()[auxj].getTamaño()+ ", y de calodad "+ discos[auxi].getCanciones()[auxj].getCalidad());
        }else{
                System.out.println("Verifique nombres del disco y la canción");
            }
    }
    
    
    public boolean añadirDisco(Disco disco){
      boolean proceso=false;
      
        for (int i = 0; i < 50; i++) {
            if(discos[i]==null){
                proceso= true;
                discos[i]=disco;
                break;
            }
        }
        return proceso;
    }
    }

