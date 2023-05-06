package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class PanelSalida extends JPanel {
        public static JTextArea taResultados;
        public static JScrollPane spResultados;

        public PanelSalida() {
                taResultados = new JTextArea();
                taResultados.setFont(new Font("Consolas", Font.PLAIN, 16)); //se agregan los resultados
                taResultados.setForeground(Color.BLACK);
                taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
                taResultados.setEditable(false);
                taResultados.setBounds(9, 15, 512, 110);

                spResultados = new JScrollPane(taResultados);
                spResultados.setBounds(9, 15, 512, 110);

                //Borde y titulo del panel
               TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
                borde.setTitleColor(Color.pink);
                this.setBorder(borde);

                this.setLayout(null);
                this.setBackground(Color.decode("#734b96"));
                this.setVisible(true);
                this.add(spResultados);
        }

        public void mostrarResultados(String texto) { //se agregan los resultados
                taResultados.append(texto);
        }

        public void borrarTa() { //se agrega el metodo para borrar los resultados
                taResultados.setText("");
        }
}
