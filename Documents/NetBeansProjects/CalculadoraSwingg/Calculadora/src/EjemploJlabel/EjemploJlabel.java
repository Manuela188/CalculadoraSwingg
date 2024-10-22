/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.EjemploJlabel to edit this template
 */
package EjemploJlabel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author Usuario
 */
public class EjemploJlabel {
    
    
     public static void main(String[] args) {
       
        JFrame ventana = new JFrame("CALCULADORA UAM");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);
        
        JLabel etiqueta = new JLabel("CALCULADORA UAM");
        etiqueta.setBounds(350, 10, 150, 50);
        ventana.add(etiqueta);
        
        /*String informacionJLabel = etiqueta.getText();
        System.out.println(informacionJLabel);*/
        JLabel etiqueta2 = new JLabel("Numero 1");
        etiqueta2.setBounds(150, 100, 150, 30);
        ventana.add(etiqueta2);
       
        JTextField campo1 = new JTextField();
        campo1.setBounds(150, 140, 90, 20);
        campo1.setText(" ");
        ventana.add(campo1);
        
        JLabel etiqueta3 = new JLabel("Numero 2");
        etiqueta3.setBounds(600, 100, 150, 30);
        ventana.add(etiqueta3);
       
        JTextField campo2 = new JTextField();
        campo2.setBounds(600, 140, 90, 20);
        campo2.setText(" ");
        ventana.add(campo2);
        
        
        String[] opciones = new String[4];
        opciones[0] = "SUMAR";
        opciones[1] = "RESTAR";
        opciones[2] = "MULTIPLICAR";
        opciones[3] = "DIVIDIR";
        JComboBox combo1 = new JComboBox(opciones);
        combo1.setBounds(300, 180, 150, 30);
        combo1.setSelectedIndex(2);
        ventana.add(combo1);
        
        JButton boton1 = new JButton("1");
        boton1.setBounds(320, 250, 50, 50);
        ventana.add(boton1);

        JButton boton2 = new JButton("2");
        boton2.setBounds(380, 250, 50, 50);
        ventana.add(boton2);

        JButton boton3 = new JButton("3");
        boton3.setBounds(440, 250, 50, 50);
        ventana.add(boton3);

        JButton boton4 = new JButton("4");
        boton4.setBounds(320, 310, 50, 50);
        ventana.add(boton4);

        JButton boton5 = new JButton("5");
        boton5.setBounds(380, 310, 50, 50);
        ventana.add(boton5);

        JButton boton6 = new JButton("6");
        boton6.setBounds(440, 310, 50, 50);
        ventana.add(boton6);

        JButton boton7 = new JButton("7");
        boton7.setBounds(320, 370, 50, 50);
        ventana.add(boton7);

        JButton boton8 = new JButton("8");
        boton8.setBounds(380, 370, 50, 50);
        ventana.add(boton8);

        JButton boton9 = new JButton("9");
        boton9.setBounds(440, 370, 50, 50);
        ventana.add(boton9);

        JButton boton0 = new JButton("0");
        boton0.setBounds(380, 430, 50, 50);
        ventana.add(boton0);
        ventana.setVisible(true);
        
        JButton botonCalcular = new JButton("CALCULAR");
        botonCalcular.setBounds(300, 485, 200, 40);
        ventana.add(botonCalcular);
       

}
}