package modelo;

public class PlanTelefonia {
        // Atributos
        private String numeroCelular; 
        private String operadorCelular;
        private Integer cantidadMinutos;
        private Double costoMinuto;
        private Double costoTotal;
        // Metodos
        public PlanTelefonia(String numeroCelular, String operadorCelular, Integer cantidadMinutos,
                        Double costoMinuto) {
                this.numeroCelular = numeroCelular;  // se agregan los datos
                this.operadorCelular = operadorCelular;
                this.cantidadMinutos = cantidadMinutos;
                this.costoMinuto = costoMinuto;
        }

        public PlanTelefonia() { 
                this.numeroCelular = ""; // se agregan los datos para que no quede vacio el panel
                this.operadorCelular = "";
                this.cantidadMinutos = 0;
                this.costoMinuto = 0.0;
        }

        public String getNumeroCelular() {
                return numeroCelular;
        }

        public String getOperadorCelular() {
                return operadorCelular;
        }

        public Integer getCantidadMinutos() {
                return cantidadMinutos;
        }

        public Double getCostoMinuto() {
                return costoMinuto;
        }

        public Double getCostoTotal() {
                return costoTotal;
        }

        public void setNumeroCelular(String numeroCelular) {
                this.numeroCelular = numeroCelular;
        }

        public void setOperadorCelular(String operadorCelular) {
                this.operadorCelular = operadorCelular;
        }

        public void setCantidadMinutos(Integer cantidadMinutos) {
                this.cantidadMinutos = cantidadMinutos;
        }

        public void setCostoMinuto(Double costoMinuto) {
                this.costoMinuto = costoMinuto;
        }

        public void calcularCostoTotal() { // metodo
                if (operadorCelular.equals("WOM")) { //compara si el operador es Wom
                        costoTotal = 0.5 * (cantidadMinutos * costoMinuto); 
                } else {
                        costoTotal = (double) (cantidadMinutos * costoMinuto); 
                }
        }
        // se agregan los datos
        public String toString() { 
                return "Teléfono celular: " + numeroCelular + "\nEmpresa operador: " + operadorCelular 
                                + "\nMinutos gastados: " + cantidadMinutos + "\nCosto minuto: " + costoMinuto
                                + "\nCantidad a pagar: " + costoTotal; // se agregan los datos para que se muestren en el panel salida

        }
}
