/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_recursividad_giovanni_gf;

/**
 *
 * @author 52243
 */
public class Ejercicio_9_Giovanni {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int base = 10;
int exponente = -2;
//Se declara la primer variable con un exponente
System.out.println(potencia(base, exponente));
}
public static double potencia(int base, int exponente) {
if (exponente == 0) { //caso base
return 1; //Se elava a la decima potencia
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}
}
}
