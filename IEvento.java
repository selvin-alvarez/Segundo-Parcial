package examenParcial;

import java.util.List;

interface IEvento {
	
	String getNombre();
    void agregarParticipante(IParticipante participante);
    List<IParticipante> getParticipantes();
}

