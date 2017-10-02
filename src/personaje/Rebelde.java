package personaje;

public class Rebelde extends EstadoCaballero {
	
	public EstadoCaballero beberAgua(){
		return new Normal();
	}
}
