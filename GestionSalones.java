package examenParcial;

import java.util.ArrayList;
import java.util.List;

class GestionSalones {

	private List<IReservacion> reservaciones;

    public GestionSalones() {
        this.reservaciones = new ArrayList<>();
    }

    public void agregarReservacion(IReservacion reservacion) {
        reservaciones.add(reservacion);
    }

    public List<IReservacion> getReservaciones() {
        return reservaciones;
    }
}
