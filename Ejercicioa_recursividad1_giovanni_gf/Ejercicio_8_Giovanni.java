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
public class Ejercicio_8_Giovanni {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
String palabra = "Hola";
//Se empieza declarando una cadena
System.out.println(invertirPalabra(palabra, palabra.length()-1));
//se alamcena y se proporciona un conteo empezando desde la palabra final
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){
return palabra.charAt(longitud)+"";
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}
