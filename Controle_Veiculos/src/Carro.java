
public class Carro extends Veiculo {
	
	private boolean possui_ar_condicionado;
	private boolean possui_radio;
	public Carro(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
			int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel,
			boolean possui_ar_condicionado, boolean possui_radio) {
		super(motor, volante, quantidade_de_passageiros, quantidade_de_portas, quantidade_de_rodas, e_de_carga,
				capacidade_de_carga, combustivel);
		this.possui_ar_condicionado = possui_ar_condicionado;
		this.possui_radio = possui_radio;
	}
	public boolean isPossui_ar_condicionado() {
		return possui_ar_condicionado;
	}
	public void setPossui_ar_condicionado(boolean possui_ar_condicionado) {
		this.possui_ar_condicionado = possui_ar_condicionado;
	}
	public boolean isPossui_radio() {
		return possui_radio;
	}
	public void setPossui_radio(boolean possui_radio) {
		this.possui_radio = possui_radio;
	}
	@Override
	public String toString() {
		return "\n***Caracteristicas do Carro***:\nPossui ar condicionado? " + possui_ar_condicionado + "\nPossui radio? " + possui_radio + "\n" + super.toString();
	}

}
