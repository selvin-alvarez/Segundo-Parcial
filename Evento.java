package examenParcial;

import java.util.ArrayList;
import java.util.List;

class Evento implements IEvento {
	
	private String nombre;
    private List<IParticipante> participantes;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.participantes = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void agregarParticipante(IParticipante participante) {
        participantes.add(participante);
    }

    @Override
    public List<IParticipante> getParticipantes() {
        return participantes;
    }
}

