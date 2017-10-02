package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import ItemDecorator.Escudo;
import ItemDecorator.Pu�al;
import personaje.Arquero;
import personaje.Personaje;

public class TestItemsArquero {

	@Test
	public void testArqueroConCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
		Assert.assertEquals(ark.getEnergia(),0,0);
				
	}
@Test
	public void testArqueroConDobleCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
				
	}
	@Test
	public void testArqueroDesequiparCapa() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.desEquipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);	
	}
	@Test
	public void testArqueroConPu�al() {
		Personaje ark=new Arquero();
		Pu�al pu�al= new Pu�al();
		Assert.assertEquals(ark.getDa�o(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);		
	}
	@Test
	public void testArqueroConDoblePu�al() {
		Personaje ark=new Arquero();
		Pu�al pu�al= new Pu�al();
		Assert.assertEquals(ark.getDa�o(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.equipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);;
				
	}
	@Test
	public void testArqueroDesequiparPu�al() {
		Personaje ark=new Arquero();
		Pu�al pu�al= new Pu�al();
		Assert.assertEquals(ark.getDa�o(),5,0);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),8,0);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.desEquipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
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
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(escudo);
		Assert.assertEquals(ark.getDefensa(),3,0);
		
		ark.equipar(capa);
		Assert.assertEquals(ark.getDefensa(),3,0);	
		Assert.assertEquals(ark.getDa�o(),5,0);	
		Assert.assertEquals(ark.getEnergia(),0,0);
	}
	@Test
	public void testArqueroConEscudoYPu�al() {
		Personaje ark=new Arquero();
		Escudo escudo = new Escudo();
		Pu�al pu�al = new Pu�al();
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(escudo);
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(pu�al);
		Assert.assertEquals(ark.getDefensa(),0,0);
		Assert.assertEquals(ark.getDa�o(),8,0);
	}
	@Test
	public void testArqueroConCapaYPu�al() {
		Personaje ark=new Arquero();
		Pu�al pu�al = new Pu�al();
		Capa capa = new Capa();
		Assert.assertEquals(ark.getDefensa(),3,0);
		Assert.assertEquals(ark.getDa�o(),5,0);
		
		ark.equipar(pu�al);
		Assert.assertEquals(ark.getDefensa(),0,0);
		
		ark.equipar(capa);
		Assert.assertEquals(ark.getDefensa(),0,0);	
		Assert.assertEquals(ark.getDa�o(),8,0);	
		Assert.assertEquals(ark.getEnergia(),0,0);
	}
}
