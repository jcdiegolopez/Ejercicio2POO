/**
 * La clase Reserva representa una reserva realizada por un cliente para una habitación en un establecimiento.
 * Contiene información sobre el nombre del cliente, dirección de correo electrónico, duración de la estancia,
 * tipo de cliente (basado en el número de visitas anteriores) y cantidad de personas en la reserva.
 */
public class Reserva {
    private String nombre;       // Nombre del cliente
    private String email;        // Dirección de correo electrónico del cliente
    private int noches;           // Duración de la estancia en noches
    private String tipo;         // Tipo de cliente (Regular, Frecuente, VIP)
    private int personas;        // Cantidad de personas en la reserva

    /**
     * Constructor de la clase Reserva.
     *
     * @param nombre   Nombre del cliente que realiza la reserva.
     * @param email    Dirección de correo electrónico del cliente.
     * @param noches   Duración de la estancia en noches.
     * @param visitas  Número de visitas anteriores del cliente al establecimiento.
     * @param personas Cantidad de personas en la reserva.
     */
    public Reserva(String nombre, String email, int noches, int visitas, int personas) {
        this.nombre = nombre;
        this.email = email;
        this.noches = noches;
        this.personas = personas;
        
        if (visitas >= 10) {
            this.tipo = "VIP";
        } else if (visitas >= 5) {
            this.tipo = "Frecuente";
        } else {
            this.tipo = "Regular";
        }
    }

    /**
     * Obtiene el nombre del cliente que realizó la reserva.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la dirección de correo electrónico del cliente que realizó la reserva.
     *
     * @return La dirección de correo electrónico.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Obtiene la duración de la estancia en noches.
     *
     * @return La duración de la estancia.
     */
    public int getNoches() {
        return this.noches;
    }

    /**
     * Obtiene el tipo de cliente basado en el número de visitas anteriores.
     *
     * @return El tipo de cliente (Regular, Frecuente, VIP).
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * Obtiene la cantidad de personas en la reserva.
     *
     * @return La cantidad de personas en la reserva.
     */
    public int getPersonas() {
        return this.personas;
    }
}
