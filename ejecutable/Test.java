package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) {
        PlanTelefonia miPlanTelefonia = new PlanTelefonia();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miPlanTelefonia);
    }
}
