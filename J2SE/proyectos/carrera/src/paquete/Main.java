package paquete;

public class Main {
	public static void main(String[] args) {
		Pista pista;
		
		pista = new Pista();
		Corredor pichu = new Perro("Pichu");
		Corredor roque = new Perro("Roque");
		Corredor picho = new PerroPicaron ("Picho");
		Corredor lapradon = new Gato("Michi");
		Corredor zzz=new Perezoso("zzz");
		
		pista.addCorredor(pichu);
		pista.addCorredor(roque);
		pista.addCorredor(picho);
		pista.addCorredor(lapradon);
		pista.addCorredor(zzz);
		
		pista.iniciarCarrera();
	}

}
