
public class Bicicleta extends Veiculo {
	
		private boolean eh_eletrica;
		private boolean tem_bagageiro;
		public Bicicleta(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
				int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel,
				boolean eh_eletrica, boolean tem_bagageiro) {
			super(motor, volante, quantidade_de_passageiros, quantidade_de_portas, quantidade_de_rodas, e_de_carga,
					capacidade_de_carga, combustivel);
			this.eh_eletrica = eh_eletrica;
			this.tem_bagageiro = tem_bagageiro;
		}
		public boolean isEh_eletrica() {
			return eh_eletrica;
		}
		public void setEh_eletrica(boolean eh_eletrica) {
			this.eh_eletrica = eh_eletrica;
		}
		public boolean isTem_bagageiro() {
			return tem_bagageiro;
		}
		public void setTem_bagageiro(boolean tem_bagageiro) {
			this.tem_bagageiro = tem_bagageiro;
		}
		@Override
		/*public String toString() {
			return "Bicicleta [eh_eletrica=" + eh_eletrica + ". tem_bagageiro=" + tem_bagageiro + "]";
		}*/
		public String toString() {
			return "\n***Caracteristicas da Bicicleta***:\nÉ eletrica? " + eh_eletrica + "\nTem bagageiro? " + tem_bagageiro + " \n" + super.toString();
		}
		
}
