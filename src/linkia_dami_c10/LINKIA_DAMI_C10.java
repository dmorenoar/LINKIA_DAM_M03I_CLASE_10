/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c10;

import java.util.Arrays;
import java.util.Scanner;
import linkia_dami_c9.preguntas.Pregunta;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        //Creación de la matriz indicando filas y columas
        String[][] puntuaciones = new String[2][3]; 
        
        int filas = 2;
        int columnas = 3;
        
        String[][] matriz = new String[filas][columnas]; 
        
        
        puntuaciones[0][0] = "Puntuación 1";
        puntuaciones[0][1] = "Puntuación 2";
        puntuaciones[0][2] = "Puntuación 3";
        
        puntuaciones[1][0] = "8";
        puntuaciones[1][1] = "5";
        puntuaciones[1][2] = "3";
        
        //Guardamos en una variable el valor de cierta posición
        String puntuacionFilaUnoColumnaCero = puntuaciones[1][0];
        
        System.out.println("En la pos[1][0] tienes " + puntuacionFilaUnoColumnaCero);
        
        System.out.println("En la pos[1][1] tengo " + puntuaciones[1][1]);
        
        //Consulto el tamaño de las filas
        System.out.println("Tamaño de filas:" + puntuaciones.length);
        
        //Consulto el tamaño de la fila 0 y la fila 1
        System.out.println("Tamaño de columnas de la fila 0:" + puntuaciones[0].length);
        System.out.println("Tamaño de columnas de la fila 1:" + puntuaciones[1].length);
    
        //Si utilizo un indice que no existe en la matriz, nos dara un error
        //System.out.println("Tamaño de columnas:" + puntuaciones[3].length);
    
        
        //Recorro una única fila de la matriz incrementando su columna
        for(int i = 0 ; i <= puntuaciones.length; i++){
            System.out.print(puntuaciones[0][i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("RECORRO LA MATRIZ");
        System.out.println(" ");
        
        //Primero recorro las filas y luego las columnas
        for(int i = 0; i < puntuaciones.length; i++){
            for(int j = 0; j < puntuaciones[i].length; j++){
                //Compruebo una puntuación y si la encuentra incremento 
                //la fila para obtener las puntuaciones
                if(puntuaciones[i][j].equals("Puntuación 1")){
                    System.out.println(puntuaciones[i][j]);
                    System.out.println(puntuaciones[i+1][j] + " ");
                }
            }
            System.out.println(" ");
        }     
        
        
        /*PEDIMOS AL USUARIO LA PUNTUACIÓN A MODIFICAR Y SEGÚN LA QUE NOS PONGA
        MODIFICAMOS LA PUNTUACIÓN PIDIENDOLE UN NUEVO VALOR*/
        
        System.out.println("Introduce la puntuación a modificar");
        //El .next solo coge hasta el espacio y el resto se olvida
        //El .nextLine nos coge toda la línea
        String puntuacion = sc.nextLine();
        int puntos = Pregunta.pideEntero("Introduce el nuevo valor");
        
        switch(puntuacion){
            case "Puntuacion 1":
                puntuaciones[1][0] = String.valueOf(puntos);
            break;
            case "Puntuacion 2":
                puntuaciones[1][1] = String.valueOf(puntos);
            break;
            case "Puntuacion 3":
                puntuaciones[1][2] = String.valueOf(puntos);
            break;
        }
        
        //Primero recorro las filas y luego las columnas para ver las modificaciones
        for(int i = 0; i < puntuaciones.length; i++){
            for(int j = 0; j < puntuaciones[i].length; j++){
                System.out.println(puntuaciones[i][j]);
            }
            System.out.println(" ");
        } 
        
        //Ampliación de la clase Arrays
        
        /*COMPARAMOS POSICION A POSICION LOS VALORES DE DOS ARRAYS PARA VER SI 
        SON IGUALES O NO.*/
        int[] numeros = new int[3]; // 3 0 0
        
        int[] numeros2 = new int[3]; // 3 0 0
        
        numeros[0] = 3;
        numeros2[0] = 3; 
        
        System.out.println(Arrays.equals(numeros, numeros2));
        
        numeros[0] = 3;
        numeros[1] = 8;
        numeros[2] = 5;
        
        int[] copiaNumeros = Arrays.copyOf(numeros, 3);
        
        for(int i = 0; i< copiaNumeros.length; i++){
            System.out.println(copiaNumeros[i]);
        }
        
    }
}
