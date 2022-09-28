/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos_recursividad_giovanni_gf;;

/**
 *
 * @author 52243
 */
public class Ejercicio_5_Giovanni {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int[][] m = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
//Se hace la llamada inicial
recorrerMatrizRecursivo(m, 0, 0);
}
public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
//Se muestra el numero
System.out.print(m[i][j] + " ");
if (i != m.length - 1 || j != m[i].length - 1) {
//Se indica si llega al final de la fila
if (j == m[i].length - 1) {
//Pasa a la siguiente fila
i++;
//Se reinicia la variable j
j = 0;
//Salta de linea
System.out.println("");
} else {
//Pasa a la siguiente columna
j++;
}
//Se vuelve a llamar a la función recursivamente
recorrerMatrizRecursivo(m, i, j);
}
}
}

