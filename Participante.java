package examenParcial;

class Participante implements IParticipante {
	
	private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
