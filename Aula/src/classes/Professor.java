package classes;

public class Professor extends Pessoa {
	private java.util.Date admissao;

	public java.util.Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(java.util.Date admissao) {
		this.admissao = admissao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome()
			+ "\nCPF: " + super.getCpf()
			+ "\nAdmissão: " + this.admissao
			+ "\nRua: " + super.getEndereco().getRua() + " Nº " + super.getEndereco().getNumero()
			+ "\nCidade: " + super.getEndereco().getCidade()
			+ "\nComplemento: " + super.getEndereco().getComplemento();	
	}
	
}
