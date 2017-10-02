package ItemDecorator;

import Punto.Punto;
import personaje.PersonajeEquipado;

public class Capa extends ItemDecorator {
	
	public Capa() {
		this.codigoDeItem=111;
	}

	public Capa(PersonajeEquipado personaje) {
		this.codigoDeItem=111;
		//this.agregarDaño=personaje.getDaño()/10*-1;///Agrega al personaje que lo utiliza el -10%
		this.agregarEnergia=personaje.getEnergia();///Duplica la energia del personaje
	}
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Capa capa=new Capa(personaje);
		return capa;
	}

	@Override
	public float getDaño() {
		return 0;
	}
	@Override
	public float getSalud() {
		return 0;
	}
	@Override
	public float getEnergia() {
		return 0;
	}
	@Override
	public int getCanFlechas() {
		return 0;
	}
	@Override
	public int getDistanciaMinima() {
		return 0;
	}
	@Override
	public int getDistanciaMaxima() {
		return 0;
	}
	@Override
	public Punto getUbicacion() {
		return null;
	}
	@Override
	public float getDefensa() {
		return 0;
	}


	

}
