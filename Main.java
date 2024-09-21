package examenParcial;

public class Main {

	public static void main(String[] args) {
		
		GestionSalones gestionSalones = new GestionSalones();

        // Crear algunos salones
        ISalon salon1 = new Salon("Gran Salon", 200);
        ISalon salon2 = new Salon("Salon Ejecutivo", 50);

        // Crear un cliente
        ICliente cliente1 = new Cliente("Juan Perez");

        // Crear un evento
        IEvento evento1 = new Evento("Conferencia de Tecnología");

        // Agregar participantes al evento
        evento1.agregarParticipante(new Participante("Alice"));
        evento1.agregarParticipante(new Participante("Bob"));

        // Crear una reservación
        IReservacion reservacion1 = new Reservacion(salon1, evento1, cliente1);

        // Agregar la reservación a la gestión de salones
        gestionSalones.agregarReservacion(reservacion1);

        // Mostrar las reservaciones
        for (IReservacion reservacion : gestionSalones.getReservaciones()) {
            System.out.println("Reservación:");
            System.out.println("Cliente: " + reservacion.getCliente().getNombre());
            System.out.println("Evento: " + reservacion.getEvento().getNombre());
            System.out.println("Salon: " + reservacion.getSalon().getNombre());
            System.out.println("Participantes:");
            for (IParticipante participante : reservacion.getEvento().getParticipantes()) {
                System.out.println("- " + participante.getNombre());
            }
        }
    }
}

