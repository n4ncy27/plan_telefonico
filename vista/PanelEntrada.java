package vista;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel { 
        private JLabel lbTitulo; 
        private JLabel lbNumero; 
        private JLabel lbOperador;
        private JLabel lbMinutos;
        private JLabel lbCosto;
        private JLabel lbLogo;
        private ImageIcon iLogo;
        private static JTextField tfNumero;
        private static JComboBox<String> cbOperador;
        private static JTextField tfMinutos;
        private static JTextField tfCosto;

        public PanelEntrada() {
                // se agrega el titulo
                lbTitulo = new JLabel("Plan de telefonia WOM ", SwingConstants.CENTER);
                lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTitulo.setForeground(Color.BLACK);
                lbTitulo.setBounds(0, 10, 558, 30);
                // se agrega el numero
                lbNumero = new JLabel("Número =");
                lbNumero.setFont(new Font("Serif", Font.PLAIN, 18));
                lbNumero.setForeground(Color.BLACK);
                lbNumero.setBounds(230, 55, 480, 30);

                tfNumero = new JTextField();
                tfNumero.setFont(new Font("Arial", Font.PLAIN, 18));
                tfNumero.setForeground(Color.BLACK);
                tfNumero.setBounds(330, 55, 190, 30);

                lbOperador = new JLabel("Operador =");
                lbOperador.setFont(new Font("Serif", Font.PLAIN, 18));
                lbOperador.setForeground(Color.BLACK);
                lbOperador.setBounds(230, 95, 480, 30);

                // se crea el combo box 
                String[] empresasOperadores = { "Avantel", "Claro", "Movilujo", "Tigo", "WOM" }; // se crea el arreglo
                cbOperador = new JComboBox<>(empresasOperadores); //
                cbOperador.setSelectedIndex(0);
                cbOperador.setFont(new Font("Arial", Font.PLAIN, 18));
                cbOperador.setForeground(Color.BLACK);
                cbOperador.setBounds(330, 95, 190, 30);

                // se agregan los minutos
                lbMinutos = new JLabel("Minutos =");
                lbMinutos.setFont(new Font("Serif", Font.PLAIN, 18));
                lbMinutos.setForeground(Color.BLACK);
                lbMinutos.setBounds(230, 135, 480, 30);

                tfMinutos = new JTextField();
                tfMinutos.setFont(new Font("Arial", Font.PLAIN, 18));
                tfMinutos.setForeground(Color.BLACK);
                tfMinutos.setBounds(330, 135, 190, 30);

                lbCosto = new JLabel("Costo =");
                lbCosto.setFont(new Font("Serif", Font.PLAIN, 18));
                lbCosto.setForeground(Color.BLACK);
                lbCosto.setBounds(230, 175, 480, 30);

                tfCosto = new JTextField();
                tfCosto.setFont(new Font("Arial", Font.PLAIN, 18));
                tfCosto.setForeground(Color.BLACK);
                tfCosto.setBounds(330, 175, 190, 30);

                // se agrega el logo
                iLogo = new ImageIcon("imgs/celular.png");
                lbLogo = new JLabel(iLogo);
                lbLogo.setOpaque(true);
                lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
                lbLogo.setBounds(55, 42, 165, 172); 

                 //Borde y titulo del panel
                 TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
                borde.setTitleColor(Color.pink);
                 this.setBorder(borde);
    
                // se agrega el panel
                this.setLayout(null);
                this.setBackground(Color.decode("#734b96"));
                this.setVisible(true);
                this.add(lbTitulo);
                this.add(lbNumero);
                this.add(tfNumero);
                this.add(lbOperador);
                this.add(cbOperador);
                this.add(lbMinutos);
                this.add(tfMinutos);
                this.add(lbCosto);
                this.add(tfCosto);
                this.add(lbLogo);

        }
        // métodos para obtener los datos de entrada
        public static String getTfNumero() {
                return tfNumero.getText();
        }

        public static String getTfOperador() {
                return cbOperador.getSelectedItem().toString();
        }

        public static String getTfMinutos() {
                return tfMinutos.getText();
        }

        public static String getTfCosto() {
                return tfCosto.getText();
        }

        public static void borrarTf() { // método para borrar los datos de entrada
                JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Advertencia", 
                                JOptionPane.WARNING_MESSAGE); // se muestra un mensaje de advertencia
                tfNumero.setText(""); // se borran los datos
                cbOperador.setSelectedIndex(0); 
                tfMinutos.setText("");
                tfCosto.setText("");
                PanelSalida.taResultados.setText("");
        }
}
