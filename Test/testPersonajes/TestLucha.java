package testPersonajes;

import org.junit.Test;

import ItemDecorator.Escudo;
import personaje.Arquero;
import personaje.Caballero;
import personaje.Personaje;

public class TestLucha {

	@Test
	public void testArqueroVSCaballeroSinItems() {
		Arquero robin = new Arquero();
		Caballero artur = new Caballero();
		
		robin.atacar(artur);///LA DEFENSA DE ARTUR ES DE 20 Y EL ATAQUE DE ROBIN DE 5, NO DEBERIA OCACIONAR DAÑO.
		System.out.println(artur.getSalud());
		
		artur.atacar(robin);
		System.out.println(robin.getSalud());
		
		artur.atacar(robin); ///ROBIN MUERE LUEGO DE 2 ATAQUES
		System.out.println(robin.getSalud());
	}
	@Test
	public void testArqueroConEscudoVSCaballero() {
		Arquero robin = new Arquero();
		Caballero artur = new Caballero();
		Escudo escudo = new Escudo();
		
		robin.atacar(artur);///LA DEFENSA DE ARTUR ES DE 20 Y EL ATAQUE DE ROBIN DE 5, NO DEBERIA OCACIONAR DAÑO.
		System.out.println(artur.getSalud());
		
		robin.equipar(escudo);
		
		artur.atacar(robin);///ROBIN DEBE QUEDAR CON (VIDA-30)+DEF(3) => VIDA=23
		System.out.println(robin.getSalud());
		
		artur.atacar(robin); ///ROBIN MUERE LUEGO DE 2 ATAQUES
		System.out.println(robin.getSalud());///CASI LO SALVA EL ESCUDO :D
	}
	
	@Test
	public void testCaballoFuriosoTomaAgua() {
		Personaje robin = new Caballero();///ROBIN CAMBIO DE PROFECION
		Caballero arthur = new Caballero();
		robin.moverPersonaje(0, 0);
		robin.atacar(arthur);///LA DEFENSA DE ARTHUR ES DE 20 Y EL ATAQUE DE ROBIN DE 50.
		System.out.println(arthur.getSalud());
		arthur.atacar(robin);
		arthur.atacar(robin); 
		arthur.atacar(robin); 
		System.out.println(robin.getSalud());
		arthur.atacar(robin); ///EL 4° ATAQUE CONSECUTIVO SE ENOJA EL CABALLO
		System.out.println(robin.getSalud());
		arthur.beberAgua();
		arthur.atacar(robin); ///SE VIENE EL COMBO DE ARTHUR
		arthur.atacar(robin); 
		arthur.atacar(robin); 
		arthur.beberAgua();
		arthur.atacar(robin); 
		arthur.atacar(robin); 

	}

}
