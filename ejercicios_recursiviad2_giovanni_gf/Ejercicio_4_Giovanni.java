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
import java.util.Scanner;

public class Ejercicio_4_Giovanni {

public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Se declara una longuitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//Se crea una array usando la variable "longitud"
int numeros[]=new int[longitud];

//Se recorre y se usa la funcion para crearlo de forma aleatoria
for(int i=0;i<numeros.length;i++){
numeros[i]=generaNumeroAleatorio(0,10);
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
}

}

//Se genera un numero aleatorio entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}

}
