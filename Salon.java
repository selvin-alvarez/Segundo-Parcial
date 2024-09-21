package examenParcial;

class Salon implements ISalon {
	
	private String nombre;
    private int capacidad;

    public Salon(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCapacidad() {
        return capacidad;
    }
}

