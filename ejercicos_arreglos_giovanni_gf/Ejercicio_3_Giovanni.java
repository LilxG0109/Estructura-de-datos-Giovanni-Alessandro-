public class Ejercicio_3_Giovanni {
 
    public static void main(String[] args) {
         
        //Se crea un arreglo
        int[] numeros=new int[100];
         
        //Se exponen las variables necesarias
        int suma=0;
        double media;
         
        //Determino el array y asigno valores y sumo
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        //Se cuenta la media y muetra la suma y la media
        System.out.println("La suma es "+suma);
         
        media=(double)suma/numeros.length;
         
        System.out.println("La media es "+media);
         
    }
     
}