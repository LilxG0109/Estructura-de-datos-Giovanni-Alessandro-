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

public class Ejercicio_3_Giovanni {

public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Se declara un longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//Se crea una variable  donde alojara los datos ingresados
int numeros[]=new int[longitud];

int num;

//Se inicia un ciclo para crear una lista 
for(int i=0;i<numeros.length;i++){

System.out.println("Inserte un número en la posicion "+i);

do{
//Se pide el numero en una pocicion especifica
num=sn.nextInt();

if(!(num>=0 && num<=10)){
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
}

}while(!(num>=0 && num<=10));

//Se asigna un valor ya que se demostro que el resultado es correcto
numeros[i]=num;

}

System.out.println("Estos son los números elegidos por el usuario");
for(int i=0;i<numeros.length;i++){
System.out.println(numeros[i]);
}

}

}