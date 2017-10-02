package Punto;

public class Punto {
	private int x = 0;
	private int y = 0;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
	}

	public int DistanciaEntre(Punto p2) {
		return (int) Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
	}
}
