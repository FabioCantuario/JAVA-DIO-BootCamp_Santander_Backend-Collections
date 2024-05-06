
public class Usuario {

	public static void main(String[] args) {
		
		SmartTV smart = new SmartTV();
		
		System.out.println("A TV ligada? " + smart.ligada);
		System.out.println("Canal atual: " + smart.canal);
		System.out.println("Volume atual: " + smart.volume);
		
		smart.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smart.ligada);
		
		smart.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smart.ligada);
		
		smart.diminuirVolume();
		smart.diminuirVolume();
		smart.diminuirVolume();
		System.out.println("Volume atual: " + smart.volume);
		
		smart.aumentarVolume();
		System.out.println("Volume atual: " + smart.volume);
		
		smart.aumentarCanal();
		smart.aumentarCanal();
		smart.aumentarCanal();
		smart.aumentarCanal();
		System.out.println("Canal atual: " + smart.canal);
		smart.diminuirCanal();
		smart.diminuirCanal();
		System.out.println("Canal atual: " + smart.canal);
		smart.mudarCanal(31);
		System.out.println("Canal atual: " + smart.canal);
	}

}
