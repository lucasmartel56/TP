package personaje;

import Punto.Punto;

public class Caballero extends Personaje {

	private final float SALUD = 200;
	private final int CANTFLECHAS = 0;
	private final float DAÑO = 50;
	private final int DISTANCIAMINIMA = 1;
	private final int DISTANCIAMAXIMA = 2;
	private final float ENERGIA = 0;
	private final int DEFENSA = 20;
	private EstadoCaballero estado;
	private final Punto UBICACION = new Punto(2, 0);
	private int canAtaques;

	public Caballero() {
		this.salud = SALUD;
		this.canFlechas = CANTFLECHAS;
		this.daño = DAÑO;
		this.distanciaMinima = DISTANCIAMINIMA;
		this.distanciaMaxima = DISTANCIAMAXIMA;
		this.energia = ENERGIA;
		this.ubicacion = UBICACION;
		this.defensa = DEFENSA;
		this.canAtaques = 0;
		this.estado = new Normal();
	}
	public void beberAgua() {
		  		this.estado = estado.beberAgua();
		  		this.canAtaques=0;
		  	}

	public Caballero(int salud, int daño, int canFlechas, int distanciaMinima, int distanciaMaxima, int energia,
			int defensa, Punto punto) {
		this.salud = salud;
		this.canFlechas = canFlechas;
		this.daño = daño;
		this.distanciaMinima = distanciaMinima;
		this.distanciaMaxima = distanciaMaxima;
		this.energia = energia;
		this.defensa = defensa;
		this.ubicacion = punto;
	}

	@Override
	public void atacar(Personaje atacado) {
		if(this.canAtaques == 3)
			return; ///EL CABALLO ESTA REBELDE POR ENDE NO PUEDE ATACAR
		if (this.ubicacion.DistanciaEntre(atacado.ubicacion) < this.distanciaMinima
				|| this.ubicacion.DistanciaEntre(atacado.ubicacion) > this.DISTANCIAMAXIMA)
			return;/// EL PERSONAJE NO PUEDE ATACAR A ESTA DISTANCIA
		this.canAtaques++;
		atacado.serAtacado(this);
	}

	/*@Override
	public void serAtacado(Personaje atacante) {
		float ataque = (this.defensa - atacante.getDaño());
		if (ataque > 0){
			this.salud -= ataque;
		if(this.getSalud() <= 0)
			System.out.println("GAME OVER");
		}
	}*/

}
