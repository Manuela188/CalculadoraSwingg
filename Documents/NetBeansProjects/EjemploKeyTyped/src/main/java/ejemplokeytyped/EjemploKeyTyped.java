/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejemplokeytyped;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class EjemploKeyTyped {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("EJEMPLO KEYTYPED");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(100, 100, 300, 15);
        ventana.add(etiqueta);
        
        ventana.addKeyListener(new KeyAdapter(){
            public void KeyTyped(KeyEvent e){
              char letra = e.getKeyChar();
              etiqueta.setText("EL USUARIO PRESIONO LA TECLA: "+ letra);
                  
    }
    });
}
}