/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconsola;

import java.util.Arrays;

/**
 *
 * @author fecq8
 */
public class EjemploConsola {
    //declaro un array de ints de instancia
    int[] listaNumeros = {200, 31, 27, 2, 5, 200};
    int[] listaNumeros2 = {-11, 5, -34, 7, 209, 209, 77, 7};
    int[] listaNumeros3 = {0, 2000, -4, 1581, 5, 999, 777, 9};
    int[] listaNumeros4 = {2000, 2000, -4, 1581, 5, 999, 777, 9};
    int[] listaNumeros5 = {200, 200, -4, 0, 5, -45, 777, 777};
    
    //el metodo maximos va a calcular el maximo y segundo maximo de una lista de numeros
    
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el maximo y el segundo maximo
        int [] listaMaximos = {lista[0], lista[1]};
        for (int i=0; i<lista.length; i++){
            if(listaMaximos[0] <= lista[i]){
                listaMaximos[1] = listaMaximos[0];
                listaMaximos[0] = lista[i]; 
              
            }else{
            if((listaMaximos[1] < lista[i]) && (listaMaximos[0] != lista[i])){
                listaMaximos[1] = lista[i];
            }
            }
               
        }
        
        return listaMaximos;
    }
    
    private boolean palindromo(String cadena){
    
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploConsola ejercicio = new EjemploConsola();
        
       System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros)));
         System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros2)));
          System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros3)));
           System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros4)));
            System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros5)));
    }
    
}
