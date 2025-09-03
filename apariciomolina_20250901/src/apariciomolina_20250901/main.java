/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250901;

import java.util.Scanner;


public class main {
    
    
    
    public static void main(String[] args) {
        
      matriz();  
        
    }
    
    public static void matriz(){
        //se instancia el scanner para lectura de teclado
        Scanner scanner = new Scanner(System.in);
        //se instancia la matriz de tipo int
        int[][] matriz = new int[3][3];
        //valores locales
        int suma = 0;
        int total_elementos = 0;
        double promedio = 0;
        //salida al usuario para indicar que debe ingresar datos
        System.out.println("Ingrese los valores para una matriz 3x3");
        //se recorre primero las filas con un estructura de control iterativa un tipo for
        
        for(int i=0 ; i<matriz.length ; i++){
            //en cada iteracion se debera obtener la cantidad de elementos
            //que existe en el arreglo(cantidad de columnas)
            total_elementos += matriz[i].length;
            //se recorre las columnas de la matiz con una estrutura de control
            //iterativa de tipo for
            //debido a que tenemos que obtener el valor de cada columnas(fila y columna)
            for(int j=0 ; j<matriz[i].length ; j++){
                //se vuelve un array----
                //se imprime la peticion del usuario para el ingreso de datos
                System.out.println("Elementos ["+i+"]["+j+"]");
                //se hace lectura del teclado
                matriz[i][j] = scanner.nextInt();
                
            }//se cierra el for para columnas
        }//se cierra el for para filas
        
        //salida de valores para el ususario
        System.out.println("Matriz ingresada: ");
        //se recorre las filas de la matriz
        for(int x=0 ; x<matriz.length ; x++){
            //se recorre las columnas de la matriz
            for(int y=0 ; y<matriz[x].length ; y++){
                //se vuelve un array----
                //se imprime el valor de cada celda de la matriz (filas y columnas)
                //fila: x columna: y
                System.out.print(matriz[x][y]+" ");
                //se suman los valores digitados de cada celda
                suma += matriz[x][y];
            }
            
            //se imprime un salto de fila
            System.out.println();
        }
        
        //calculo de valores
        promedio = (double) suma/total_elementos;
        System.out.println(suma+" es la sumatoria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
        System.out.println("el promedio de edad es: "+promedio);
    }
}
