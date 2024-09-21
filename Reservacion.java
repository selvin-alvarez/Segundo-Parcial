package examenParcial;

class Reservacion {
	
	private ISalon salon;
    private IEvento evento;
    private ICliente cliente;

    public Reservacion(ISalon salon, IEvento evento, ICliente cliente) {
        this.salon = salon;
        this.evento = evento;
        this.cliente = cliente;
    }

    @Override
    public ISalon getSalon() {
        return salon;
    }

    @Override
    public IEvento getEvento() {
        return evento;
    }

    @Override
    public ICliente getCliente() {
        return cliente;
    }
}


