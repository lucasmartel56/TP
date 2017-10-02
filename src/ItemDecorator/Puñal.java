package ItemDecorator;

import Punto.Punto;
import personaje.PersonajeEquipado;

public class Pu�al extends ItemDecorator{
	
	public Pu�al() {
		this.codigoDeItem=222;
	}
	
	public Pu�al(PersonajeEquipado personaje) {
		this.codigoDeItem=222;
		this.agregarDa�o=3;
		this.agregarDefensa=-3;
	}
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Pu�al pu�al=new Pu�al(personaje);
		return pu�al;
	}
	
	@Override
	public float getDa�o() {
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
