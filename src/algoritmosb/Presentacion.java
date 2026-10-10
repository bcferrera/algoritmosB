
package algoritmosb;


public class Presentacion {
    
    public static void datosPersonales(){
        System.out.println("----------------------------------------");
        System.out.println("Nombre: Byron Calderon");
        System.out.println("Edad: 29 años");
        System.out.println("Genero(M=Masculino, F=Femenino): M");
        System.out.println("Direccion: Guastatoya, El Progreso.");
        System.out.println("----------------------------------------");
    }
    
    public static void datosPersonalesVariables(){
        
        //Creacion de variables
        String nombre;
        int edad;
        char genero;
        String direccion;
        
        //Asignacion de datos a variables
        nombre = "Byron Calderon";
        edad = 29;
        genero = 'M';
        direccion = "Guastatoya, El Progreso.";
        
        //Impresion de datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero(M=Masculino, F=Femenino): " + genero);
        System.out.println("Direccion: " + direccion);
    }
    
}
