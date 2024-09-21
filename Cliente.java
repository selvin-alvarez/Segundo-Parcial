package examenParcial;

class Cliente implements ICliente {
	
	private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}


