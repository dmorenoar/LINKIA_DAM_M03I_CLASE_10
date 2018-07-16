/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c9.preguntas;

import java.io.*;

/**
 *
 * @author dmorenoar
 */
public class Pregunta {
    
    public static int pideEntero(String pregunta) {
        int valor = 0;
        String texto;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println(pregunta);
            try {
                texto = br.readLine();
                valor = Integer.parseInt(texto);
            } catch (IOException e) {
                System.out.println("Valor introducido no es bueno");
                continue;
            }

        } while (false);

        return valor;
    }
}
