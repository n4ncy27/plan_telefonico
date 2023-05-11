package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

// controlador pueda acceder a los paneles
public class Controlador implements ActionListener { 
        
        private VentanaPrincipal miVentanaPrincipal; 
        private PlanTelefonia modelo;


        public Controlador(VentanaPrincipal miVentanaPrincipal, PlanTelefonia modelo) { // constructor
                this.miVentanaPrincipal = miVentanaPrincipal; // se agregan los paneles
                this.modelo = modelo; 
                // se agregan los botones
                this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this); 
                this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
        }
        // se agregan los metodos
        public void actionPerformed(ActionEvent ae) {  
                String comando = ae.getActionCommand();

                if (comando.equals("calcularMayor")) { 
                        try {
                                // se agregan los datos
                                this.modelo.setNumeroCelular(vista.PanelEntrada.getTfNumero()); 
                                this.modelo.setOperadorCelular(vista.PanelEntrada.getTfOperador()); 
                                this.modelo.setCantidadMinutos(Integer.parseInt(vista.PanelEntrada.getTfMinutos()));
                                this.modelo.setCostoMinuto(Double.parseDouble(vista.PanelEntrada.getTfCosto()));
                                this.modelo.calcularCostoTotal();
                                // Operadores de celular
                                if (this.modelo.getOperadorCelular().equals("WOM")) { // si es WOM
                                        this.miVentanaPrincipal.miPanelSalida 
                                                        .mostrarResultados(this.modelo.toString() + "\nCantidad de descuento: 50%");
                                // si no es WOM
                                } else {
                                        this.miVentanaPrincipal.miPanelSalida 
                                                        .mostrarResultados(this.modelo.toString() + "\nCantidad de descuento: 0%");
                                }
                        //se agrega para sabe si los datos son incorrectos 
                        } catch (Exception ex) { // si los datos son incorrectos 
                                JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!",
                                                "Suma 3 Enteros", JOptionPane.ERROR_MESSAGE); // mensaje de error 
                                vista.PanelEntrada.borrarTf(); // se borran los datos
                        }
                // esto es para borrar los datos del panel entrada
                } else if (comando.equals("borrarTexto")) {
                        vista.PanelEntrada.borrarTf();
                        this.miVentanaPrincipal.miPanelSalida.borrarTa();

                // esto sirve para cerrar la ventana
                } else if (comando.equals("cerrarVentana")) {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Advertencia",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
