
public class Moto extends Veiculo {
	
		private boolean partida_eletrica;

		public Moto(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
				int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel,
				boolean partida_eletrica) {
			super(motor, volante, quantidade_de_passageiros, quantidade_de_portas, quantidade_de_rodas, e_de_carga,
					capacidade_de_carga, combustivel);
			this.partida_eletrica = partida_eletrica;
		}

		public boolean isPartida_eletrica() {
			return partida_eletrica;
		}

		public void setPartida_eletrica(boolean partida_eletrica) {
			this.partida_eletrica = partida_eletrica;
		}

		@Override
		public String toString() {
			return "***Caracteristicas da Moto***:\nTem partida eletrica? " + partida_eletrica + " \n" + super.toString();
		}
		
		
}

