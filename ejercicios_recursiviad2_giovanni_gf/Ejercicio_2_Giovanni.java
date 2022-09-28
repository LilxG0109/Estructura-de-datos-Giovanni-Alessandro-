/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_recursiviad2_giovanni_gf;

/**
 *
 * @author Giovanni Gf
 */
public class Ejercicio_2_Giovanni {
public static void main(String[] args) {
//Se crea un array 
int[] numeros=new int[100];
//Se declaran las variables 
int suma=0;
double media;
//Se recorren y asignan numeros y se suman
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Se clacula la media y la suma se muestra 
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
}
