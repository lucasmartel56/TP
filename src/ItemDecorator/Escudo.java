package ItemDecorator;

import Punto.Punto;
import personaje.PersonajeEquipado;

public class Escudo extends ItemDecorator{
	
	public Escudo(){
		this.codigoDeItem = 333;
	}
	public Escudo(PersonajeEquipado personaje){
		this.codigoDeItem = 333;
	}
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
			Escudo escudo = new Escudo(personaje);
			return escudo;
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
