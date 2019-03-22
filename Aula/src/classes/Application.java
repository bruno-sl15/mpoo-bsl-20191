package classes;

public class Application {

	public static void main(String[] args) {
		Aluno bruno = new Aluno();
		bruno.setNome("Bruno");
		bruno.setCpf("70871436469");
		bruno.setAnoEntrada(2019);
		bruno.setPeriodoEntrada(1);
		bruno.setEndereco(new Endereco());
		bruno.getEndereco().setRua("Sub do Açafrão");
		bruno.getEndereco().setNumero(21);
		bruno.getEndereco().setCidade("Recife");
		bruno.getEndereco().setComplemento("Não tem");
		
		Professor gabriel = new Professor();
		gabriel.setNome("Gabriel");
		gabriel.setCpf("00000000000");
		gabriel.setAdmissao(new java.util.Date());
		gabriel.setEndereco(new Endereco());
		gabriel.getEndereco().setRua("Rua das casinhas");
		gabriel.getEndereco().setNumero(50);
		gabriel.getEndereco().setCidade("Recife");
		gabriel.getEndereco().setComplemento("Não tem");
		
		System.out.println("ALUNO:");
		System.out.println(bruno);
		System.out.println();
		System.out.println("PROFESSOR: ");
		System.out.println(gabriel);
		
		
	}

}
