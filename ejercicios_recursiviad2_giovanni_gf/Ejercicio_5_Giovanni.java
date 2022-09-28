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
public class Ejercicio_5_Giovanni {
public static void main(String[] args) {
//Se resta la pocicion mayor agregandole un 1 a la posision menor
char abecedario[]=new char[91-65];
//Se crea un abecedario
for(int i=65, indice=0;i<91;i++, indice++){
abecedario[indice]=(char)i;
}
Scanner sn=new Scanner(System.in);
//Se pide un numero 
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
int num=sn.nextInt();
String cadena="";
while(num!=-1){
//Se comprueba que el numero es correcto
if(num>=0 && num<abecedario.length){
cadena+=abecedario[num];
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
}else{
System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
}
num=sn.nextInt(); //Se pide nuevamente el valor
}
//Se muestra el resultado final
System.out.println("La cadena resultante es "+cadena);
}
}
