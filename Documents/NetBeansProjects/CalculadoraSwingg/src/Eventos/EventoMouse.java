/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class EventoMouse {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("EJEMPLO MOUSECLICKED");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        
        JLabel labelPrimerNumero = new JLabel("PRIMER NUMERO");
        JTextField campoPrimerNumero = new JTextField();
        labelPrimerNumero.setBounds(100, 50, 150, 25);
        campoPrimerNumero.setBounds(250, 50, 150, 25);
        
        JLabel labelSegundoNumero = new JLabel("PRIMER NUMERO");
        JTextField campoSegundoNumero = new JTextField();
        labelSegundoNumero.setBounds(400, 50, 150, 25);
        campoSegundoNumero.setBounds(550, 50, 150, 25);
        
        JButton botonNumero1 = new JButton("1");
        botonNumero1.setBounds(150, 80, 50, 25);
        JButton botonNumero2 = new JButton("2");
        botonNumero2.setBounds(220, 80, 50, 25);
        
        
        
        JButton boton1 = new JButton("HAZ CLICK AQUI");
        ventana.add(boton1);
        
        boton1.addMouseListener (new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "INFO", "SE HA PRESIONADO EL BOTON", JOptionPane.INFORMATION_MESSAGE);
            }
           
        });
        
        ventana.setVisible(true);
    }
}
