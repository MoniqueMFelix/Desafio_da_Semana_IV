
public class Main {

	public static void main(String[] args) {
				
		//moto
		Combustivel CombustivelMoto = new Combustivel(true, false, false, false, false, false); 
		Moto moto = new Moto(true, false, 2, 0, 2, false, 150, CombustivelMoto, true);
				
			System.out.println(moto);
				
		//bicicleta
		/*Segundo o site https://olhardigital.com.br/2023/01/10/carros-e-tecnologia/bicicleta-eletrica-de-carga-com-tres-baterias-saiba-mais-sobre-a-novidade/
		A capacidade de carga do veículo é de 80 kg (sem contar com o peso do ciclista), então vou estimar uns 180kg*/
		Combustivel combustivelBicicleta = new Combustivel(false, false, false, true, true, false);
		Bicicleta bicicleta = new Bicicleta(true, false, 2, 0, 2, false, 180, combustivelBicicleta, true, true);

		     System.out.println(bicicleta);
		        
		//charrete
		//digamos que é uma charrete mais moderna com 4 rodas
		 Combustivel CombustivelCharrete = new Combustivel(false, false, false, false, false, true); 
		 Charrete charrete = new Charrete(false, false, 4, 0, 4, false, 250, CombustivelCharrete);
		      		
		     System.out.println(charrete);
		        
		//caminhao
		//Escolhido o caminhão Truck
		 Combustivel CombustivelCaminhao = new Combustivel(false, false, true, false, false, false); 
		 Caminhao caminhao = new Caminhao(true, true, 2, 2, 8, true, 14000, CombustivelCaminhao, 2);
				
		 	System.out.println(caminhao);
		      	
		//carro
		Combustivel combustivelCarro = new Combustivel(true, false, false, false, false, false);
		Carro carro = new Carro(true, true, 5, 4, 4, false, 400, combustivelCarro, true, true);
		        
		    System.out.println(carro);
				
	}

}
