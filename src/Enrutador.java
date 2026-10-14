public class Enrutador {
    private String direccionEquipo;
    private String direccionIP;
    private boolean estadoConexion;

    public Enrutador(String idEquipo, String direccionIPInicial, boolean estadoConexion) {
        this.direccionEquipo = idEquipo;
        this.estadoConexion = estadoConexion;
        setDireccionIP(direccionIPInicial);
    }

    void setDireccionIP(String nuevaIp) {
        if (validarSintaxisIP(nuevaIp)) {
            this.direccionIP = nuevaIp;
            System.out.println("Éxito: La dirección IP '" + nuevaIp + "' fue actualizada correctamente.");
        } else {
            System.out.println("La nueva IP tiene un formato inválido");
        }

    }

        private boolean validarSintaxisIP (String ip){
            if (ip == null) {
                return false;
            }

            String patronIP = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
            if (!ip.matches(patronIP)) {
                return false;
            }

            String[] octetos = ip.split("\\.");
            for (String octeto : octetos) {
                int valor = Integer.parseInt(octeto);
                if (valor < 0 || valor > 255) {
                    return false;
                }
            }
            return true;
        }
    }

