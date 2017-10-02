package personaje;

import Punto.Punto;

public class Arquero extends Personaje {

	private final float SALUD = 50;
	private final int CANTFLECHAS = 20;
	private final float DAÑO = 5;
	private final int DISTANCIAMINIMA = 2;
	private final int DISTANCIAMAXIMA = 5;
	private final float ENERGIA = 0;
	private final int DEFENSA = 3;
	private final Punto UBICACION = new Punto(0, 0);

	public Arquero() {
		this.salud = SALUD;
		this.canFlechas = CANTFLECHAS;
		this.daño = DAÑO;
		this.distanciaMinima = DISTANCIAMINIMA;
		this.distanciaMaxima = DISTANCIAMAXIMA;
		this.energia = ENERGIA;
		this.ubicacion = UBICACION;
		this.defensa = DEFENSA;
	}

	public Arquero(int salud, int daño, int canFlechas, int distanciaMinima, int distanciaMaxima, int energia,
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

	public void recargarCarcaj() {
		this.canFlechas += 6;
	}
	/*Los arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen
	suficientes flechas.*/
	public void atacar(Personaje atacado) {
		if(this.canFlechas == 0)
			return;///NO TIENE FLECHAS SUFICIENTES
		if (this.ubicacion.DistanciaEntre(atacado.ubicacion) < this.distanciaMinima
				|| this.ubicacion.DistanciaEntre(atacado.ubicacion) > this.DISTANCIAMAXIMA)
			return;/// EL PERSONAJE NO PUEDE ATACAR A ESTA DISTANCIA
		this.canFlechas--;
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
