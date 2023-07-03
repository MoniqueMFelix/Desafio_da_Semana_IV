
public class Veiculo {

	private boolean motor;
	private boolean volante;
	private int quantidade_de_passageiros;
	private int quantidade_de_portas;
	private int quantidade_de_rodas;
	private boolean e_de_carga;
	private double capacidade_de_carga;
	private Combustivel combustivel;
	
	public Veiculo(boolean motor, boolean volante, int quantidade_de_passageiros, int quantidade_de_portas,
			int quantidade_de_rodas, boolean e_de_carga, double capacidade_de_carga, Combustivel combustivel) {
		super();
		this.motor = motor;
		this.volante = volante;
		this.quantidade_de_passageiros = quantidade_de_passageiros;
		this.quantidade_de_portas = quantidade_de_portas;
		this.quantidade_de_rodas = quantidade_de_rodas;
		this.e_de_carga = e_de_carga;
		this.capacidade_de_carga = capacidade_de_carga;
		this.combustivel = combustivel;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}

	public int getQuantidade_de_passageiros() {
		return quantidade_de_passageiros;
	}

	public void setQuantidade_de_passageiros(int quantidade_de_passageiros) {
		this.quantidade_de_passageiros = quantidade_de_passageiros;
	}

	public int getQuantidade_de_portas() {
		return quantidade_de_portas;
	}

	public void setQuantidade_de_portas(int quantidade_de_portas) {
		this.quantidade_de_portas = quantidade_de_portas;
	}

	public int getQuantidade_de_rodas() {
		return quantidade_de_rodas;
	}

	public void setQuantidade_de_rodas(int quantidade_de_rodas) {
		this.quantidade_de_rodas = quantidade_de_rodas;
	}

	public boolean isE_de_carga() {
		return e_de_carga;
	}

	public void setE_de_carga(boolean e_de_carga) {
		this.e_de_carga = e_de_carga;
	}

	public double getCapacidade_de_carga() {
		return capacidade_de_carga;
	}

	public void setCapacidade_de_carga(double capacidade_de_carga) {
		this.capacidade_de_carga = capacidade_de_carga;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
	return "Esse Veiculo contem:\nMotor? " + motor + "\nVolante? " + volante + "\nQual a quantidade de passageiros? "
	+ quantidade_de_passageiros + "\nQual a quantidade de portas? " + quantidade_de_portas
	+ "\nQual a quantidade de rodas? " + quantidade_de_rodas + "\nÉ de carga? " + e_de_carga
	+ "\nQual a capacidade de carga? " + capacidade_de_carga + " kg\n" + combustivel + "";
}
	
}
