package main;

import model.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  // Calcular raiz
  public static double calcularRaiz(int num){
    double raiz = (double) Math.sqrt(num);
    return raiz;
  }  

  // Ver PI
  public static double verPi(){
    return (double) Math.PI;
  }

  // Calcular potencia
  public static double calcularPotencia(int base, int exponente){
    double potencia = Math.pow(base, exponente);
    return (double) potencia;
  }

  // Menu math

  public static void menuMath(Persona persona){
    System.out.println("Bienvenid@: " + persona.getUsuario());
    while (menu) {
      System.out.println();
      System.out.println("Que desea realizar?");
      System.out.println("1- Calcular la raíz Cuadrada de un número");
      System.out.println("2- Ver el valor de PI");
      System.out.println("3- Calcular la potencia de un número");
      System.out.println("4- SALIR");
      System.out.println();

      input_option = myscan.nextInt();

      switch (input_option) {
        case 1:
          System.out.println("Ingrese el numero del que desea calcular raíz cuadrada.");
          int sqrt_input = myscan.nextInt();
          System.out.println("La raiz cuadrada de " + sqrt_input + " es: " + calcularRaiz(sqrt_input));
          menu = false;
          break;
        case 2:
          System.out.printf("El valor de PI es: %f\n", verPi());
          menu = false;
          break;
        case 3:
          System.out.println("Escoja el numero que servira como BASE");
          int base_input = myscan.nextInt();
          System.out.println("Escoja el numero que servira como EXPONENTE");
          int exponente_input = myscan.nextInt();
          System.out.println(base_input + " elevado a " + exponente_input + " da como resultado: " + calcularPotencia(base_input, exponente_input));
          break;
        case 4:
          menu = false;
          break;
        default:
          System.out.println("Intente de nuevo con una opcion valida...");
          break;
      }
    }
  }

  static Scanner myscan = new Scanner(System.in);
  static boolean menu = true;
  static boolean session = false;
  static int input_option;

  public static void main(String[] args) {

    List<Persona> personas = new ArrayList<>();

    // Implementar a futuro el numero de intentos.
    final int INTENTOS_DISPONIBLES = 3;
    int intentos_usuario = INTENTOS_DISPONIBLES;    

    // Aqui va el programa
    Persona persona1 = new Persona("ana.banana", "b123");
    Persona persona2 = new Persona("maria.sandia", "a321");
    Persona persona3 = new Persona("el.pepe", "12345678");

    personas.add(persona1);
    personas.add(persona2);
    personas.add(persona3);


    String input_user, input_pass;

    while (!session && (intentos_usuario >= 0)) {
      System.out.println("----------------------------------------------\n");

      System.out.println("Introduzca su usuario");
      input_user = myscan.nextLine();
      System.out.println("Ahora introduzca su contrasenia");
      input_pass = myscan.nextLine();
  
      for (Persona persona : personas) {
  
        if (persona.getUsuario().equals(input_user) && persona.getContrasenia().equals(input_pass)){

          menuMath(persona);
          myscan.close();
          session = true;
          myscan.close();
          break;
        
        }
      }
      intentos_usuario--;
      System.out.println(session ? "GRACIAS POR USAR EL PROGRAMA" : "INTENTOS DISPONIBLES: " + (intentos_usuario + 1));
    }

    

  }

}
