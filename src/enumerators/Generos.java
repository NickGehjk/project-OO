package enumerators;

public enum Generos {
	
	Rock(0),
	Pop(1),
	Trap(2),
	Rap(3),
	Funk(4),
	Jazz(5),
	MPB(6),
	Forró(7),
	Gospel(8);
	
	private final int valor;
	
	Generos(int opcao){
		valor = opcao;
	}
	
	public int getValor() {
		return valor;
	}
}