/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Juan Carlos Camacho
 */
public class Actividad7F {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
        int numero;
        System.out.println("Ingresa un número entero");
        numero =  Integer.parseInt(entrada.readLine());
        int[] primo = primos(numero);
        int[] fibo = fibonacci(numero);
        imprimirResultados(primo,fibo,numero);
    }catch (Exception e){
            System.out.println("Ha sucedido un error, vuelva intentar");   
        } }
    
    //Método para calculo de números primos
    public static int[] primos(int numero) throws IOException{
        int[]primo = new int[numero];
        int posicion = 0;
        int cantidadND ;
        int cantidadNDP ;     
        for(int i = 1; posicion<numero; i++){
            cantidadND = 0;
            cantidadNDP =2;
            int numeros;
            numeros = i;
            
           for(int j = 1; j<=numeros; j++){       
          
          if(numeros% j ==0){
              cantidadND++;}      
        }
        if(cantidadND == cantidadNDP){
            
            primo[posicion] = numeros;
            posicion =posicion+1;
  
             }        
      }
        
      return primo;
   
}
    //Método para calculo de serie fibonacci
    public static int[] fibonacci(int numero) throws IOException{
        int[]fibo = new int[numero];
        int n1 = 0;
        int n2 = 1;
        int x ;
        for(int i = 0; i<numero; i++){
            fibo[i] = n1;
            x = n1+n2;
            n1 = n2;
            n2 = x;

        }
         return fibo;
}
//Método para imprimir resultados
    private static void imprimirResultados(int primo[], int fibo[], int numero) {
        String c = ", ";
        System.out.println("Números primos:");
        for(int i = 0; i<numero; i++){
            if(primo[i]!=2){
            System.out.print(c);  
           }
            System.out.print(primo[i]);

        }
        System.out.println(" ");
        System.out.println("Sucesión de Fibonacci:");
        for(int i = 0; i<numero; i++){
            if(fibo[i]!=0){
            System.out.print(c);  
           }
            System.out.print(fibo[i]);
        }
        System.out.println(" ");
}




}