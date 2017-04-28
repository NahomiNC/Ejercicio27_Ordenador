package paquete;

/**
 *
 * @author dam117
 */
public class Ordenador {
    /**
     * Declaración de variables
     */
    private String marca;
    private String procesador;
    private String pantalla;
    private boolean estado; //Encendido/Apagado (True/False)
    private static short garantia = 3; //Poníendo static crea un atributo global para todos los objetos que se creen
    
    /**
     * Constructor dónde le pasamos argumentos
     */
    Ordenador(String m, String p){
        this.marca = m;
        this.procesador = p;
        this.estado = false;
    }    
    
    /**
     * Método para asignar pantalla
     * @param pant
     */
    public void setPantalla(String pant) {
        this.pantalla = pant;
    }
    
    /**
     * Método que enciende el Ordenador
     */
    public void encenderOrdenador(){
        if(estado == false){
            System.out.println("Encendiendo ordenador...");
            estado = true;
        }else{
            System.out.println("El ordenador ya está encendido.");
        }            
    }
    
    /**
     * Método que apaga el Ordenador
     */
    public void apagarOrdenador(){
        if(estado == true){
            System.out.println("Apagando ordenador...");
            estado = false;
        }else{
            System.out.println("El ordenador ya está apagado.");
        }    
    }
    
    /**
     * Método que muestra el Estado (Encendido/Apagado)
     */
    public void mostrarEstado(){
        if(estado == true){
            System.out.println("Encendido.");
        } else{
            System.out.println("Apagado.");
        }
    }
    
    /**
     * Método que muestra los datos del Ordenador
     */
    public void mostrarDatos(){
        System.out.println("\nDatos ordenador:");
        System.out.println("Marca: "+marca);
        System.out.println("Procesador: "+procesador);
        System.out.println("Pantalla: "+pantalla);
        mostrarEstado();
    }
    
    /**
     * Método static para mostrar la garántia que tendran todos los ordenadores
     */
    public static void mostrarGarantia(){
        System.out.println("Todos los ordenadores tienen de garantía: "+garantia);
    }
}
