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
    
    
    String [] listtaPalabras = {"MURCIELAGO", "CASA", "RUEDA", "CARETO", "PERDIDO"};
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
        String auxiliar = "";
            for(int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
            auxiliar = auxiliar + cadena.charAt(i);
            }
            } 
         //ahora en auxiliar tengo el string pero sin espacios en blanco
         //declaro dos indices para que digan en que posiciones estoy comparando
            
         int indiceIzq = 0;     
         int indiceDer = auxiliar.length()-1;
            
         //mientras sean iguales los caracteres en esas posiciones la palabra sera un palindromo
         //en elmomento que en el que una de esas comparaciones falle, es que no es un palindromo
         // ademas, si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
         while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
         indiceIzq++;
         indiceDer--;
         }
         // return indiceIzq > indiceDer (esta es otra solucion
         boolean resultado = true;
         if (indiceIzq < indiceDer){
         return false; //TODO: hay que cambiar esto luego para que funcione bien   
         }
         return resultado;
    }
        
    
    private void palindromoV2(String cadena){
            String auxiliar = "";
            for(int i=0; i< cadena.length(); i++){
                if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
                }
            }
            
             int indiceIzq = 0;     
         int indiceDer = auxiliar.length()-1;
         
         while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
         indiceIzq++;
         indiceDer--;
         }
         if (indiceIzq< indiceDer){
         System.out.print("la cadena" + cadena + "NO es un Palindromo");
         }else{
             System.out.print("la cadena" + cadena + "NO es un Palindromo");
         }
         
        }
    
    
    private boolean isograma(String letras){
       
        for(int i=0; i< letras.length()-1; i++){
            for(int j=i+1; j< letras.length(); j++){
                if (letras.charAt(j) == letras.charAt(i) ){
                return false;
                }
               
    }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploConsola ejercicio = new EjemploConsola();
        
     /*  System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros)));
         System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros2)));
          System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros3)));
           System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros4)));
            System.out.println (Arrays.toString( ejercicio.maximos(ejercicio.listaNumeros5)));
            
            System.out.println ( ejercicio.palindromo("ACASO HUBO BUHOS ACA"));
             System.out.println ( ejercicio.palindromo("TAC CAT"));
             System.out.println ( ejercicio.palindromo("RRRRRACASO HUBO BUHOS ACA"));
            
              ejercicio.palindromoV2("ACASO HUBO BUHOS ACA");
              ejercicio.palindromoV2("TAC CAT");
              ejercicio.palindromoV2("RRRRRACASO HUBO BUHOS ACA");
              
     */
     
            System.out.println ( ejercicio.isograma("MURCIELAGO"));  
            System.out.println ( ejercicio.isograma("CASA"));
    }
    
}
