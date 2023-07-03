
public class Charrete extends Veiculo {

	public Charrete(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
			int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel) {
		super(motor, volante, quantidade_de_passageiros, quantidade_de_portas, quantidade_de_rodas, e_de_carga,
				capacidade_de_carga, combustivel);
	}
	
	@Override
	public String toString() {
		return "\n***Caracteristicas da Charrete***\n" + super.toString();
}
}