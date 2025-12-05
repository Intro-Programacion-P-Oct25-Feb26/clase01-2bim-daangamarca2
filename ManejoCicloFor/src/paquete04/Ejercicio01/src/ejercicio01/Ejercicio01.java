/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author A S U S A16
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = "";

        // Se crean almacenadores que nos serviran para la suma total de cada uno
        int totalContador1 = 0;
        int totalContador2 = 0;
        int totalContador3 = 0;
        int totalContador4 = 0;

        // El valor inicial de i es 30, la condicion termina si i es >= a 10 y
        // va decrementando de 1 en 1
        for (int i = 30; i >= 10; i--) {

            // Declaramos nuevas variables y calculamos los múltiplos de i para
            // cada una de ellas
            int valor1 = i;
            int valor2 = i * 2;
            int valor3 = i * 3;
            int valor4 = i * 4;

            // Usamos los almacenadores para guardar la suma de cada uno de los
            // multiplos de i
            totalContador1 = totalContador1 + valor1;
            totalContador2 = totalContador2 + valor2;
            totalContador3 = totalContador3 + valor3;
            totalContador4 = totalContador4 + valor4;

            // Declaro la variable acumuladora y la uso para concatenar y 
            // agregar las variables respectivas
            String mensaje = String.format("%d-%d-%d-%d\n", valor1, valor2,
                    valor3, valor4);

            cadena = cadena + mensaje;
        }

        cadena = cadena + "----------------------------";

        String mensajeFinal = String.format("\nTotales = %d-%d-%d-%d",
                // Se añade todos los acumuladores para presentar el mensaje
                totalContador1,totalContador2,totalContador3,totalContador4);

        cadena = cadena + mensajeFinal;

        System.out.println(cadena);
    }
}
