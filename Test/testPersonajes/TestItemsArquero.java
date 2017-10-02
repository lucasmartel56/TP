package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import ItemDecorator.Escudo;
import ItemDecorator.Puñal;
import personaje.Arquero;
import personaje.Personaje;

public class TestItemsArquero {

	@Test
	public void testArqueroConCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
		Assert.assertEquals(ark.getEnergia(),0,0);
				
	}
@Test
	public void testArqueroConDobleCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
				
	}
	@Test
	public void testArqueroDesequiparCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.desEquipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);	
	}
	@Test
	public void testArqueroConPuñal() {
		Personaje ark=new Arquero();
		Puñal puñal= new Puñal();
		Assert.assertEquals(ark.getDaño(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);		
	}
	@Test
	public void testArqueroConDoblePuñal() {
		Personaje ark=new Arquero();
		Puñal puñal= new Puñal();
		Assert.assertEquals(ark.getDaño(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.equipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);;
				
	}
	@Test
	public void testArqueroDesequiparPuñal() {
		Personaje ark=new Arquero();
		Puñal puñal= new Puñal();
		Assert.assertEquals(ark.getDaño(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.desEquipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
	}
	@Test
	public void testArqueroConEscudo() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(escudo);
		System.out.println(ark.getSalud());
		Assert.assertEquals(ark.getDefensa(),3,0);
				
	}
	@Test
	public void testArqueroConDobleEscudo() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(escudo);
		System.out.println(ark.getDefensa());
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(escudo);
		System.out.println(ark.getDefensa());
		Assert.assertEquals(ark.getDefensa(),3,0);
				
	}
	@Test
	public void testArqueroDesequiparEscudo() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(escudo);
		System.out.println(ark.getDefensa());
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.desEquipar(escudo);
		System.out.println(ark.getDefensa());
		Assert.assertEquals(ark.getDefensa(),3,0);	
	}
	@Test
	public void testArqueroConCapaYEscudo() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Capa capa = new Capa();
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(escudo);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(capa);
		Assert.assertEquals(ark.getDefensa(),3,0);	
		Assert.assertEquals(ark.getDaño(),5,0);	
		Assert.assertEquals(ark.getEnergia(),0,0);
	}
	@Test
	public void testArqueroConEscudoYPuñal() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Puñal puñal = new Puñal();
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(escudo);
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(puñal);
		Assert.assertEquals(ark.getDefensa(),0,0);
		Assert.assertEquals(ark.getDaño(),8,0);
	}
	@Test
	public void testArqueroConCapaYPuñal() {
		Personaje ark=new Arquero();
		Puñal puñal = new Puñal();
		Capa capa = new Capa();
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDaño(),5,0);
		
		ark.equipar(puñal);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.equipar(capa);
		Assert.assertEquals(ark.getDefensa(),0,0);	
		Assert.assertEquals(ark.getDaño(),8,0);	
		Assert.assertEquals(ark.getEnergia(),0,0);
	}
}
