/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventoMouse {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("CALCULADORA UAM");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);

        JLabel etiqueta = new JLabel("CALCULADORA UAM");
        etiqueta.setBounds(350, 10, 150, 50);
        ventana.add(etiqueta);

        JLabel etiqueta2 = new JLabel("Numero 1");
        etiqueta2.setBounds(150, 100, 150, 30);
        ventana.add(etiqueta2);

        JTextField campo1 = new JTextField();
        campo1.setBounds(150, 140, 90, 20);
        ventana.add(campo1);

        JLabel etiqueta3 = new JLabel("Numero 2");
        etiqueta3.setBounds(600, 100, 150, 30);
        ventana.add(etiqueta3);

        JTextField campo2 = new JTextField();
        campo2.setBounds(600, 140, 90, 20);
        ventana.add(campo2);

        String[] opciones = {"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR"};
        JComboBox<String> combo1 = new JComboBox<>(opciones);
        combo1.setBounds(300, 180, 150, 30);
        ventana.add(combo1);

        // Crear botones numéricos individualmente y agregar eventos
        JButton boton1 = new JButton("1");
        boton1.setBounds(320, 250, 50, 50);
        ventana.add(boton1);
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("1");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("1");
                }
            }
        });

        JButton boton2 = new JButton("2");
        boton2.setBounds(380, 250, 50, 50);
        ventana.add(boton2);
        boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("2");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("2");
                }
            }
        });

        JButton boton3 = new JButton("3");
        boton3.setBounds(440, 250, 50, 50);
        ventana.add(boton3);
        boton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("3");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("3");
                }
            }
        });

        JButton boton4 = new JButton("4");
        boton4.setBounds(320, 310, 50, 50);
        ventana.add(boton4);
        boton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("4");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("4");
                }
            }
        });

        JButton boton5 = new JButton("5");
        boton5.setBounds(380, 310, 50, 50);
        ventana.add(boton5);
        boton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("5");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("5");
                }
            }
        });

        JButton boton6 = new JButton("6");
        boton6.setBounds(440, 310, 50, 50);
        ventana.add(boton6);
        boton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("6");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("6");
                }
            }
        });

        JButton boton7 = new JButton("7");
        boton7.setBounds(320, 370, 50, 50);
        ventana.add(boton7);
        boton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("7");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("7");
                }
            }
        });

        JButton boton8 = new JButton("8");
        boton8.setBounds(380, 370, 50, 50);
        ventana.add(boton8);
        boton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("8");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("8");
                }
            }
        });

        JButton boton9 = new JButton("9");
        boton9.setBounds(440, 370, 50, 50);
        ventana.add(boton9);
        boton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("9");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("9");
                }
            }
        });

        JButton boton0 = new JButton("0");
        boton0.setBounds(380, 430, 50, 50);
        ventana.add(boton0);
        boton0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (campo1.getText().trim().equals("")) {
                    campo1.setText("0");
                } else if (campo2.getText().trim().equals("")) {
                    campo2.setText("0");
                }
            }
        });

        JButton botonCalcular = new JButton("CALCULAR");
        botonCalcular.setBounds(300, 485, 200, 40);
        ventana.add(botonCalcular);

        botonCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    double numero1 = Double.parseDouble(campo1.getText().trim());
                    double numero2 = Double.parseDouble(campo2.getText().trim());
                    String operacion = (String) combo1.getSelectedItem();
                    double resultado = 0;

                    switch (operacion) {
                        case "SUMAR":
                            resultado = numero1 + numero2;
                            break;
                        case "RESTAR":
                            resultado = numero1 - numero2;
                            break;
                        case "MULTIPLICAR":
                            resultado = numero1 * numero2;
                            break;
                        case "DIVIDIR":
                            if (numero2 != 0) {
                                resultado = numero1 / numero2;
                            } else {
                                JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ventana.setVisible(true);
    }
}
