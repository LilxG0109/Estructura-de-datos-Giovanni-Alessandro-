package ejercicos_arreglos_giovanni_gf;

import javax.swing.JOptionPane;
public class Ejercicio_1_Giovanni {
 
    public static void main(String[] args) {
 
        final int TAMAÑO=15;
        //Se selecciona el tamaño de la variable
 
        int num[]=new int[TAMAÑO];
 
        rellenarArray(num);
 
        mostrarArray(num);
        //Se interpretan las funciones
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            //Se crea la lista
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}