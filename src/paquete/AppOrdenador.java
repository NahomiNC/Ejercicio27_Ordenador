/**
 * Ejercicio 27
 * Crear la clase Ordenador y la aplicación dónde se crean tres 
 * ordenadores y se pruebe toda la implementación.
 */
package paquete;

/**
 *
 * @author dam117
 */
public class AppOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creación de los objetos de la clase Ordenador.
         * Sin argumentos porque no hay constructor definido y
         * podemos acceder a los atributos.
         */
//        Ordenador pc1 = new Ordenador();
//        Ordenador pc2 = new Ordenador();
//        Ordenador pc3 = new Ordenador();
        
        /**
         * Creación de objetos con constructor definido
         */
        Ordenador pc1 = new Ordenador("Dell","Intel core-i3");
        Ordenador pc2 = new Ordenador("HP", "AMD");
        Ordenador pc3 = new Ordenador("Asus", "Intel core-i7");
        
        /**
         * Datos de los objetos
         * Cuando creamos objetos sin constructor
         */
//        pc1.marca = "Dell";
//        pc1.procesador = "Intel core-i3";
//        pc1.pantalla = "TFP";
//        pc1.estado = true;
//        pc1.mostrarDatos();
        
        /**
         * Mostrar datos de los objetos cuando hay constructor
         */
        pc1.setPantalla("LED");
        pc1.mostrarDatos();
        
        pc2.setPantalla("TFT");
        pc2.mostrarDatos();
        pc2.encenderOrdenador();
        
        pc3.encenderOrdenador();
        pc3.setPantalla("LED");
        pc3.mostrarDatos();
    }
    
}
