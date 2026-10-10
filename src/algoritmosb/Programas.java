/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosb;

import java.util.Scanner;

/**
 *
 * @author bcalderon
 */
public class Programas {

    public static void cuadradoCubo() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //Creacion de Variables
        int num;
        int cuadrado;
        int cubo;

        //Ingreso de datos
        System.out.println("Ingrese un Numero entero positivo.");
        num = sc.nextInt();

        //Operacion. Calcula cuadrado y cubo del numero ingresado.
        cuadrado = num * num;
        cubo = num * num * num;

        //Mostrar resultado.
        System.out.println("El cuadrado del numero ingresado es: " + cuadrado);
        System.out.println("El cubo del numero ingresado es: " + cubo);
    }

    public static void vuelto() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //Creacion variables
        double gasto;
        double pago;
        double vuelto;

        //Ingreso de valores 
        System.out.println("Ingrese el total gastado en la tienda.");
        gasto = sc.nextDouble();

        System.out.println("Ingrese el monto dado por el cliente.");
        pago = sc.nextDouble();

        //Operacion. Calcula el vuelto a entregar.
        vuelto = pago - gasto;

        //Muestra resultado.
        System.out.println("El vuelto a entregar al cliente es: " + vuelto);
    }

    public static void superficieTriangulo() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        double base;
        double altura;
        double superficie;

        //Ingresa datos
        System.out.println("Ingrese la Base del Triangulo.");
        base = teclado.nextDouble();

        System.out.println("Ingrese la Altura del Triangulo.");
        altura = teclado.nextDouble();

        //Operacion. Calcula superficie.
        superficie = (base * altura) / 2;

        //Muestra resultado
        System.out.println("La superficie del Triangulo es: " + superficie);
    }

    public static void dinosaurio() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        String nombreDino;
        double pesoLibras;
        double longitudPies;

        double pesoKilo;
        double longitudMetro;

        //Ingresamos datos
        System.out.println("Ingrese el nombre de su Dinosaurio.");
        nombreDino = teclado.next();

        System.out.println("Ingrese el peso en Libras de su Dinosaurio.");
        pesoLibras = teclado.nextDouble();

        System.out.println("Ingrese la Longitud en pies de su Dinosaurio.");
        longitudPies = teclado.nextDouble();

        //Operaciones. 
        pesoKilo = pesoLibras * 1000;
        longitudMetro = longitudPies * 0.3047;

        //Mostrar resultado.
        System.out.println("-----------------------------------------------------");
        System.out.println("El peso de su Dinosaurio en Kilogramos es: " + pesoKilo);
        System.out.println("La longitud de su Dinosaurio en Metros es: " + longitudMetro);
        System.out.println("-----------------------------------------------------");
    }

    public static void gasolinera() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //variables creacion
        double precioLitros;
        double consumoGalones;
        double consumoLitros;
        double totalPagar;

        //ingreso datos
        System.out.println("Ingrese el Precio del Combustible en Litros.");
        precioLitros = teclado.nextDouble();

        System.out.println("Ingrese lo Consumido por el Vehiculo en Galones.");
        consumoGalones = teclado.nextDouble();

        //Operacion.
        consumoLitros = consumoGalones * 3.785;
        totalPagar = consumoLitros * precioLitros;

        //Mostrar resultado
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Lo que debe de pagar por lo consumido en la Gasolinera es: Q" + totalPagar);
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void distanciaPuntos() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de Variables
        double xUno;
        double xDos;
        double yUno;
        double yDos;

        double distancia;

        //Ingreso de informacion
        System.out.println("Ingrese la coordenada en X del primer punto");
        xUno = teclado.nextDouble();

        System.out.println("Ingrese la coordenada en Y del primer punto");
        yUno = teclado.nextDouble();

        System.out.println("Ingrese la coordenada en X del segundo punto");
        xDos = teclado.nextDouble();

        System.out.println("Ingrese la coordenada en Y del segundo punto");
        yDos = teclado.nextDouble();

        //operacion
        distancia = ((xUno - xDos) * (xUno - xDos)) + ((yUno - yDos) * (yUno - yDos));
        distancia = Math.sqrt(distancia);

        //Mostrar resultado
        System.out.println("La distancia entre cada punto es: " + distancia);
    }

    public static void calificacion() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //creacion de variables
        double calificacion;

        //Ingreso de datos
        System.out.println("Ingrese la calificacion del alumno");
        calificacion = teclado.nextDouble();

        //Condicion
        if (calificacion > 8) {
            System.out.println("APROBADO");
        }
    }

    public static void aumentoSueldo() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables 
        double sueldo;

        //Ingreso de datos
        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = teclado.nextDouble();

        //Condicion, operacion y muestra de informacion
        if (sueldo < 1000) {
            sueldo = sueldo + (sueldo * 0.15);

            System.out.println("El Nuevo sueldo del trabajador es: Q" + sueldo);
        }
    }

    public static void calificacionMejorado() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        double calificacion;

        //Ingreso de informacion
        System.out.println("Ingrese la calificacion del alumno");
        calificacion = teclado.nextDouble();

        //Condicion, muestra de informacion
        if (calificacion >= 8) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }

    public static void aumentoSueldoMejorado() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        double sueldo;

        //Ingreso de datos
        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = teclado.nextDouble();

        //Condicion
        if (sueldo < 1000) {
            //Aumenta el 15% de sueldo
            sueldo = sueldo + (sueldo * 0.15);
        } else {
            //Aumenta el 12% de sueldo
            sueldo = sueldo + (sueldo * 0.12);
        }

        //Muestra informacion
        System.out.println("El nuevo sueldo del trabajador es: Q" + sueldo);
    }
    
    public static void operaciones(){
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de variables
        int op;
        int numero;
        
        double resultado =  0;
        
        //Ingreso de datos
        System.out.println("Ingrese el numero a operar");
        numero = teclado.nextInt();
        
        System.out.println("Ingrese la opcion deseada: \n"
                + "1 = Multiplicacion\n"
                + "2 = Potencia\n"
                + "3 = Division\n");
        op = teclado.nextInt();
        
        //Condicion
        switch(op){
            case 1:
                resultado = 100 * numero;
                break;
            case 2:
                resultado = Math.pow(100, numero);
                break;
            case 3:
                resultado = 100 / numero;
                break;
            default: 
                System.out.println("La opcion ingresada no es valida.");
        }
        
        //Muestra informacion
        System.out.println("El resultado de la operacion elegida es: " + resultado);
    }
    
    public static void numerosDescendente(){
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de variables
        int a;
        int b; 
        int c;
        
        //ingreso de datos
        System.out.println("Ingrese el primer numero.");
        a = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero.");
        b = teclado.nextInt();
        
        System.out.println("Ingrese el tercer numero.");
        c = teclado.nextInt();
        
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("El orden de los numeros es: " + a + " " + b + " " + c);
                } else {
                    System.out.println("El orden de los numeros es: " + a + " " + c + " " + b);
                }
            } else {
                System.out.println("El orden de los numero es: " + c + " " + a + " " + b);
            }
        } else if(b > c){
            if (a > c) {
                System.out.println("El orden de los numero es: " + b + " " + a + " " + c);
            } else {
                System.out.println("El orden de los numero es: " + b + " " + c + " " + a);
            }
        } else {
            System.out.println("El orden de los numero es: " + c + " " + b + " " + a);
        }
    }
    
    public static void nomina(){
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);
        
        //variables creacion
        double nomina = 0;
        double sueldo; 
        int cont = 1;
        
        // ciclo
//        for (int i = 1; i <= 10; i++) {
//            //ingreso de datos
//            System.out.println("Ingrese el sueldo del trabajador " + i);
//            sueldo = teclado.nextDouble();
//            
//            nomina = nomina + sueldo;
//        }

//        while(cont <= 10){
//            //ingreso de datos
//            System.out.println("Ingrese el sueldo del trabajador " + cont);
//            sueldo = teclado.nextDouble();
//            
//            nomina = nomina + sueldo;
//            cont++;
//        }
        
        do {
            //ingreso de datos
            System.out.println("Ingrese el sueldo del trabajador " + cont);
            sueldo = teclado.nextDouble();
            
            nomina = nomina + sueldo;
            cont++;
        } while (cont <= 10);
        
        System.out.println("La nomina de la empresa es: Q" + nomina);
    }
    
    public static void numeroCeros(){
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);
        
        //creacion de variables 
        int cantidadNumeros = 0;
        int sumaCeros = 0;
        int numero;
        
        //Ingreso de numero de veces que entrará al ciclo
        System.out.println("Ingrese la cantidad de numeros que va a ingresar.");
        cantidadNumeros = teclado.nextInt();
        
        //creacion del ciclo
        for (int i = 0; i < cantidadNumeros; i++) {
            //ingreso del numero
            System.out.println("Ingrese un numero.");
            numero = teclado.nextInt();
            
            //Valida que el numero ingresado sea 0 pera sumarlo a la cuenta.
            if (numero == 0) {
                sumaCeros++;
            }
        }
        
        System.out.println("La cantidad de numeros Ceros ingresados fue: " + sumaCeros);
    }
}
