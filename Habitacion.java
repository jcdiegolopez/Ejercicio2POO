/**
 * La clase Habitacion representa una habitación en un establecimiento.
 * Contiene información sobre el tipo de habitación, disponibilidad,
 * precio por noche, capacidad y tipo de cliente permitido.
 */
public class Habitacion {
    private String tipo;            // El tipo de habitación
    private int disponibilidad;     // La cantidad de habitaciones disponibles
    private float ppn;              // Precio por noche
    private int capacidad;          // Capacidad máxima de huéspedes
    private String tcliente;        // Tipo de cliente permitido (por ejemplo, "Normal", "VIP", etc.)

    /**
     * Constructor de la clase Habitacion.
     *
     * @param tipo        El tipo de habitación.
     * @param disponibilidad La cantidad de habitaciones disponibles.
     * @param ppn         Precio por noche de la habitación.
     * @param capacidad   Capacidad máxima de huéspedes en la habitación.
     * @param tcliente    Tipo de cliente permitido para la habitación.
     */
    public Habitacion(String tipo, int disponibilidad, float ppn, int capacidad, String tcliente) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ppn = ppn;
        this.disponibilidad = disponibilidad;
        this.tcliente = tcliente;
    }

    /**
     * Obtiene la cantidad de habitaciones disponibles.
     *
     * @return La cantidad de habitaciones disponibles.
     */
    public int getDisponibilidad() {
        return this.disponibilidad;
    }

    /**
     * Obtiene el tipo de cliente permitido para la habitación.
     *
     * @return El tipo de cliente permitido.
     */
    public String getTcliente() {
        return this.tcliente;
    }

    /**
     * Obtiene la capacidad máxima de huéspedes en la habitación.
     *
     * @return La capacidad máxima de huéspedes.
     */
    public int getCapacidad() {
        return this.capacidad;
    }

    /**
     * Obtiene el precio por noche de la habitación.
     *
     * @return El precio por noche.
     */
    public float getPPN() {
        return this.ppn;
    }

    /**
     * Establece la cantidad de habitaciones disponibles.
     *
     * @param d La nueva cantidad de habitaciones disponibles.
     */
    public void setDisponibilidad(int d) {
        this.disponibilidad = d;
    }
}
