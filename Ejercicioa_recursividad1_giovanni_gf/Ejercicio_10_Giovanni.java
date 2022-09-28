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
public class Ejercicio_10_Giovanni {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int numero = 123;
//Se declaran las primeras variables
System.out.println(sumaDigitos(numero));
//Se almacenan las variables
}
public static int sumaDigitos(int numero){
if(numero < 10){ 
//Se verifica que el valor inicial sea menor que 10
return numero; 
//Se devuelve el numero
}else{
return (numero % 10) + sumaDigitos(numero/10);
//llamo a la funcion
}
}
}
