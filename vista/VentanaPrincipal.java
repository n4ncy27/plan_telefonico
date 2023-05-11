package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame { 
        public PanelEntrada miPanelEntrada; //se agregan los paneles
        public PanelProceso miPanelProceso;
        public PanelSalida miPanelSalida;

        public VentanaPrincipal() {
                //se agregan los paneles
                miPanelEntrada = new PanelEntrada();
                miPanelEntrada.setBounds(10, 10, 530, 220);

                miPanelProceso = new PanelProceso();
                miPanelProceso.setBounds(10, 240, 530, 80);

                miPanelSalida = new PanelSalida();
                miPanelSalida.setBounds(10, 330, 530, 140);

                this.setTitle("Plan de Telefonía Wom- Nancy Liliana Sáenz Moreno");
                this.setSize(558, 512);
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setLayout(null);
                this.add(miPanelEntrada);
                this.add(miPanelProceso);
                this.add(miPanelSalida);
        }
}
