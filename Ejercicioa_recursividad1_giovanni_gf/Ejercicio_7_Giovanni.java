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
public class Ejercicio_7_Giovanni {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int a = 254;
// Se declaran las variables
System.out.println(invertirNum(a, 2));
}
public static int invertirNum(int num, int pos){
//Si el resultado es menor que 10 se devuelve el numero final
if(num < 10){
return num;
}else{
//Se multiplica por la potencia (4 * 100) por ejemplo
return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
}
}
}
