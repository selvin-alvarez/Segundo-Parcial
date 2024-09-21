package examenParcial;

interface IReservacion {
	
	String getNombre();
    int getCapacidad();
	ISalon getSalon();
	IEvento getEvento();
	ICliente getCliente();
}

