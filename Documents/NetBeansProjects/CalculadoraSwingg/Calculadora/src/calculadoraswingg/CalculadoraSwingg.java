/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraswingg;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraSwingg {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        /*JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);
        JLabel etiqueta = new JLabel("MI CALCULADORA", SwingConstants.CENTER);
        etiqueta.setBounds(350, 10, 150, 50);
        ventana.add(etiqueta);
        ventana.setVisible(true);*/
        
        /*JOptionPane.showMessageDialog(null, "BIENVENIO A MI CALCULADORA");
        String nombre = JOptionPane.showInputDialog("ingrese su nombre");
        JOptionPane.showMessageDialog(null, "HOLA: "+ nombre + " ESTAS EN LA CALCULADORA");
        int opcion = JOptionPane.showConfirmDialog(null, "DESEA CONTINUAR?");
        if(opcion == JOptionPane.YES_OPTION){
            System.out.println("EL USUARIO DIJO QUE SI CONTINUA");
        }
        if(opcion == JOptionPane.NO_OPTION);
            System.out.println("EL USUARIO DIJO QUE NO CONTINUA");
        
        if(opcion == JOptionPane.CANCEL_OPTION);
            System.out.println("EL USUARIO DIJO QUE NO CONTINUA");*/
        
        Operaciones operaciones = new Operaciones();
        boolean continuar = true;

        while (continuar) {
            // Menú para seleccionar operación
            String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una operación:",
                    "Calculadora",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcionSeleccionada == null || opcionSeleccionada.equals("Salir")) {
                continuar = false;
                break;
            }

            // Obtener primer número
            String input1 = JOptionPane.showInputDialog("Ingresa el primer número:");
            double num1 = Double.parseDouble(input1);

            // Obtener segundo número
            String input2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
            double num2 = Double.parseDouble(input2);

            double resultado = 0;
            String mensajeResultado = "";

            // Procesar la operación seleccionada
            switch (opcionSeleccionada) {
                case "Sumar":
                    resultado = operaciones.sumar(num1, num2);
                    mensajeResultado = "El resultado de sumar " + num1 + " y " + num2 + " es: " + resultado;
                    break;
                case "Restar":
                    resultado = operaciones.restar(num1, num2);
                    mensajeResultado = "El resultado de restar " + num1 + " y " + num2 + " es: " + resultado;
                    break;
                case "Multiplicar":
                    resultado = operaciones.multiplicar(num1, num2);
                    mensajeResultado = "El resultado de multiplicar " + num1 + " por " + num2 + " es: " + resultado;
                    break;
                case "Dividir":
                    resultado = operaciones.dividir(num1, num2);
                    if (num2 == 0) {
                        mensajeResultado = "Error: No se puede dividir entre cero.";
                    } else {
                        mensajeResultado = "El resultado de dividir " + num1 + " entre " + num2 + " es: " + resultado;
                    }
                    break;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}



        
  
