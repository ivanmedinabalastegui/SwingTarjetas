import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Verificador {
    public void Interfaz(){
        ArrayList<String> Numeros = new ArrayList();
        ArrayList<String> NumerosM = new ArrayList();

        JFrame marco = new JFrame("Verificador de tarjetas");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 150);
        marco.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));

        JLabel etiqueta = new JLabel("Introduzca el nº de la tarjeta");
        JLabel imagen = new JLabel();

        JTextField texto = new JTextField(25);

        JButton calcular_numero = new JButton("Calcular Dígito");
        JButton borrar_datos = new JButton("Borrar Datos");

        panel1.add(etiqueta);
        panel2.add(texto);
        panel3.add(calcular_numero);
        panel3.add(borrar_datos);

        calcular_numero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    JTextField texto2 = new JTextField(3);
                    panel2.add(texto2);
                    marco.add(texto2);

                    ImageIcon img = new ImageIcon("src/iconvale.png");
                    imagen.setIcon(img);
            }
        });
        borrar_datos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText(null);
                imagen.setVisible(false);

                JFrame marco = new JFrame("Cálculo dígito tarjeta");

                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco.setSize(400, 150);
                marco.setLayout(new BorderLayout());

                Icon img = new ImageIcon("src/reset.jpg");

                JOptionPane.showMessageDialog(null, "Los campos han sido reinicializados", "Cálculo dígito tarjeta", JOptionPane.INFORMATION_MESSAGE, img);
            }
        });

        panel1.setBorder(new EmptyBorder(5,10,5,10));
        panel3.setBorder(new EmptyBorder(5,10,10,10));

        marco.add(etiqueta);
        marco.add(texto);
        marco.add(imagen);
        marco.add(calcular_numero);
        marco.add(borrar_datos);
        marco.setVisible(true);
    }
}
