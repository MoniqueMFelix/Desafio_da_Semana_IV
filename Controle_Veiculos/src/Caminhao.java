
public class Caminhao extends Veiculo{
	
	private int quantidade_de_eixos;

	public Caminhao(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
			int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel,
			int quantidade_de_eixos) {
		super(motor, volante, quantidade_de_passageiros, quantidade_de_portas, quantidade_de_rodas, e_de_carga,
				capacidade_de_carga, combustivel);
		this.quantidade_de_eixos = quantidade_de_eixos;
	}

	public int getQuantidade_de_eixos() {
		return quantidade_de_eixos;
	}

	public void setQuantidade_de_eixos(int quantidade_de_eixos) {
		this.quantidade_de_eixos = quantidade_de_eixos;
	}

	@Override
	public String toString() {
		return "\n***Caracteristicas do Caminhao***:\nQual a quantidade de eixos? " + quantidade_de_eixos + "\n" + super.toString();
	}
	
}
