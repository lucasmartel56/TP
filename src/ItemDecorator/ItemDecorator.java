package ItemDecorator;

import personaje.Personaje;
import personaje.PersonajeEquipado;

public abstract class ItemDecorator implements PersonajeEquipado{

	PersonajeEquipado personaje;///DUDA
	
	protected float agregarSalud;
	protected float agregarEnergia;
	protected int agregarDistanciaMaxima;///LA DISTANCIA POR QUE?
	protected int agregarDistanciaMinima;
	protected float agregarDaño;
	protected int agregarCantidadFlechas;
	protected float agregarDefensa;
	protected int codigoDeItem ;
	
	public int getCodigoDeItem() {
		return this.codigoDeItem;
	}
	
	public abstract ItemDecorator evaluarMejora(PersonajeEquipado personaje);///DUDA
	

	public PersonajeEquipado getPersonaje() {
		return personaje;
	}

	public float getAgregarSalud() {
		return agregarSalud;
	}

	public float getAgregarEnergia() {
		return agregarEnergia;
	}

	public int getAgregarDistanciaMaxima() {
		return agregarDistanciaMaxima;
	}

	public int getAgregarDistanciaMinima() {
		return agregarDistanciaMinima;
	}

	public float getAgregarDaño() {
		return agregarDaño;
	}

	public int getAgregarCantidadFlechas() {
		return agregarCantidadFlechas;
	}
	
	public int getAgregarDefensa(){
		return (int) agregarDefensa;
	}
	
	public ItemDecorator(PersonajeEquipado personaje) {
		this.personaje=personaje;
	}
	public ItemDecorator(Personaje personaje) {
	}
	
	public ItemDecorator() {
	}
	
}
