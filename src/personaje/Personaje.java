package personaje;

import java.util.ArrayList;

import ItemDecorator.ItemDecorator;
import Punto.Punto;

public abstract class Personaje implements PersonajeEquipado {

	protected float salud;
	protected int distanciaMinima;
	protected int distanciaMaxima;
	protected float daño;
	protected float defensa;
	protected float energia;
	protected int canFlechas;
	protected Punto ubicacion;
	protected ArrayList<ItemDecorator> items = new ArrayList<ItemDecorator>();

	public void desEquipar(ItemDecorator item) {
		for (ItemDecorator itemDecorator : items) {
			if (itemDecorator.getCodigoDeItem() == item.getCodigoDeItem()) {
				items.remove(itemDecorator);
				this.daño -= itemDecorator.getAgregarDaño();
				this.canFlechas -= itemDecorator.getAgregarCantidadFlechas();
				this.energia -= itemDecorator.getAgregarEnergia();
				this.distanciaMaxima -= itemDecorator.getAgregarDistanciaMaxima();
				this.distanciaMinima -= itemDecorator.getAgregarDistanciaMinima();
				this.defensa -= itemDecorator.getAgregarDefensa();
				this.salud -= itemDecorator.getAgregarSalud();
				return;
			}
		}
	}

	public void equipar(ItemDecorator item) {
		for (ItemDecorator itemDeco : items) {
			if (itemDeco.getCodigoDeItem() == item.getCodigoDeItem()) 
				return;
		}
		item = item.evaluarMejora(this);
		items.add(item);

		this.daño += item.getAgregarDaño();
		this.canFlechas += item.getAgregarCantidadFlechas();
		this.energia += item.getAgregarEnergia();
		this.distanciaMaxima += item.getAgregarDistanciaMaxima();
		this.distanciaMinima += item.getAgregarDistanciaMinima();
		this.defensa += item.getAgregarDefensa();
		this.salud += item.getAgregarSalud();

	}
	
	public void serAtacado(Personaje atacante) {
		if(this.getSalud() <= 0){
			System.out.println("Ya lo has matado, es que no lo quieres dejar descansar en paz?");
			return;
		}
		float ataque = (this.defensa - atacante.getDaño());
		for (ItemDecorator itemDeco : atacante.items) {
			if (itemDeco.getCodigoDeItem() == 111) 
				ataque = (float) (this.defensa -(atacante.getDaño()*0.9));				
		}		
		for (ItemDecorator itemDeco : this.items) {
			if (itemDeco.getCodigoDeItem() == 333) 
				ataque = (float)(this.defensa - (atacante.getDaño()*0.6));				
		}
			if (ataque < 0){
			this.salud += ataque;
			if(this.getSalud() <= 0){
				System.out.println("GAME OVER");
			}
		}
	}
	public void moverPersonaje(int x, int y){
		this.ubicacion = new Punto(x,y);
	}
	public float getSalud() {
		return salud;
	}

	public int getDistanciaMinima() {
		return distanciaMinima;
	}

	public int getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public float getDaño() {
		return daño;
	}

	public float getEnergia() {
		return energia;
	}

	public int getCanFlechas() {
		return canFlechas;
	}
	public float getDefensa(){
		return defensa;
	}
	public Punto getUbicacion() {
		return ubicacion;
	}
	public abstract void atacar(Personaje p);

	

	


}
