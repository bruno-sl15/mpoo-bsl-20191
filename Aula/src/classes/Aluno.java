package classes;

public class Aluno extends Pessoa {
	private int anoEntrada;
	private int periodoEntrada;
	
	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getNome()
			+ "\nCPF: " + super.getCpf()
			+ "\nAno de Entrada: " + this.anoEntrada
			+ "\nPer�odo de Entrada: " + this.periodoEntrada
			+ "\nRua: " + super.getEndereco().getRua() + " N� " + super.getEndereco().getNumero()
			+ "\nCidade: " + super.getEndereco().getCidade()
			+ "\nComplemento: " + super.getEndereco().getComplemento();	
	}
	
}
