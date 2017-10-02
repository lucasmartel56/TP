package personaje;

import Punto.Punto;

public class Lancero extends Personaje {

	private final float SALUD = 150;
	private final int CANTFLECHAS = 0;
	private final float DAÑO = 25;
	private final int DISTANCIAMINIMA = 1;
	private final int DISTANCIAMAXIMA = 3;
	private final float ENERGIA = 0;
	private final int DEFENSA = 10;
	private final Punto UBICACION = new Punto(0, 0);

	public Lancero() {
		this.salud = SALUD;
		this.canFlechas = CANTFLECHAS;
		this.daño = DAÑO;
		this.distanciaMinima = DISTANCIAMINIMA;
		this.distanciaMaxima = DISTANCIAMAXIMA;
		this.energia = ENERGIA;
		this.ubicacion = UBICACION;
		this.defensa = DEFENSA;
	}

	public Lancero(int salud, int daño, int canFlechas, int distanciaMinima, int distanciaMaxima, int energia,
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
		if (this.ubicacion.DistanciaEntre(atacado.ubicacion) < this.DISTANCIAMINIMA
				|| this.ubicacion.DistanciaEntre(atacado.ubicacion) > this.distanciaMaxima)
			return;/// EL PERSONAJE NO PUEDE ATACAR A ESTA DISTANCIA
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
