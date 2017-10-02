package ItemDecorator;

import Punto.Punto;
import personaje.PersonajeEquipado;

public class Puñal extends ItemDecorator{
	
	public Puñal() {
		this.codigoDeItem=222;
	}
	
	public Puñal(PersonajeEquipado personaje) {
		this.codigoDeItem=222;
		this.agregarDaño=3;
		this.agregarDefensa=-3;
	}
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Puñal puñal=new Puñal(personaje);
		return puñal;
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
	public float getDefensa() {
		return 0;
	}
	@Override
	public Punto getUbicacion() {
		return null;
	}

}
