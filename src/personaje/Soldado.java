package personaje;

import Punto.Punto;

public class Soldado extends Personaje{

	private final float SALUD = 200;
	private final int CANTFLECHAS = 0;
	private final float DAÑO = 20;
	private final int DISTANCIAMINIMA = 0;
	private final int DISTANCIAMAXIMA = 0;
	private final float ENERGIA = 100;
	private final int DEFENSA = 10;
	private final Punto UBICACION = new Punto(0, 0);
	
	public Soldado() {
		this.salud = SALUD;
		this.canFlechas = CANTFLECHAS;
		this.daño = DAÑO;
		this.distanciaMinima = DISTANCIAMINIMA;
		this.distanciaMaxima = DISTANCIAMAXIMA;
		this.energia = ENERGIA;
		this.ubicacion = UBICACION;
		this.defensa = DEFENSA;

	}
	
	public Soldado(int salud, int daño, int canFlechas, int distanciaMinima, int distanciaMaxima, int energia,
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
	public void beberPosion(){
		this.energia = ENERGIA;
	}
	@Override
	public void atacar(Personaje atacado) {
		if(this.energia <10)
			return; ///NO TIENE SUFICIENTE ENERGIA PARA REALIZAR EL ATAQUE
		if(this.ubicacion.DistanciaEntre(atacado.ubicacion) < this.distanciaMinima)
			return;///EL PERSONAJE NO PUEDE ATACAR A ESTA DISTANCIA
		this.energia -= 10;
		atacado.serAtacado(this);
	}

/*	@Override
	public void serAtacado(Personaje atacante) {
		float ataque = (this.defensa - atacante.getDaño());
		if (ataque > 0){
			this.salud -= ataque;
		if(this.getSalud() <= 0)
			System.out.println("GAME OVER");
		}
	}*/
	

	
	
}
