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
public class Ejercicio_6_Giovanni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 5;
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {
//si es cero devuelve un cero
//Puedes poner 0 otravez para incluir negativos
if (n == 0) {
return 0;
//si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Se hace la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
}
