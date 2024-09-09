/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraswingg;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    
    public Operaciones() {
    }

    public double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }
}
    

