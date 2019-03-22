package classes;

public class Application {

	public static void main(String[] args) {
		//Criando o objeto enderecoAluno e definindo seus atributos
		Endereco enderecoAluno = new Endereco();
		enderecoAluno.setRua("Subida do Açafrão");
		enderecoAluno.setNumero(21);
		enderecoAluno.setCidade("Recife");
		enderecoAluno.setComplemento("Perto do mercadinho");
		
		//Criando o objeto enderecoProf e definindo seus atributos
		Endereco enderecoProf = new Endereco();
		enderecoProf.setRua("Rua das Casinhas");
		enderecoProf.setNumero(30);
		enderecoProf.setCidade("Recife");
		enderecoProf.setComplemento("Não tem");
		
		//Criando o objeto aluno e definindo seus atributos
		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		aluno.setCpf("70871436469");
		aluno.setAnoEntrada(2019);
		aluno.setPeriodoEntrada(20191);
		aluno.setEndereco(enderecoAluno);
		
		//Criando o objeto professor e definindo seus atributos
		Professor professor = new Professor();
		professor.setNome("Gabriel");
		professor.setCpf("12345678910");
		professor.setAdmissao(new java.util.Date());
		professor.setEndereco(enderecoProf);
		
		//Imprimindo os atributos de aluno e professor
		System.out.println("ALUNO:");
		System.out.println(aluno);
		System.out.println();
		System.out.println("PROFESSOR: ");
		System.out.println(professor);
		
		//Criando um  novo professor a partir do aluno já existente
		Professor professor2 = new Professor();
		professor2.setNome(aluno.getNome());
		professor2.setCpf(aluno.getCpf());
		professor2.setAdmissao(new java.util.Date());
		professor2.setEndereco(aluno.getEndereco());
		
		//Criando um novo aluno a partir do professor já existente
		Aluno aluno2 = new Aluno();
		aluno2.setNome(professor.getNome());
		aluno2.setCpf(professor.getCpf());
		aluno2.setAnoEntrada(2017);
		aluno2.setPeriodoEntrada(20171);
		aluno2.setEndereco(professor.getEndereco());
		
		//Imprimindo os atributos de aluno2 e professor2
		System.out.println("\n---------------------------------\n");
		System.out.println("ALUNO:");
		System.out.println(aluno2);
		System.out.println();
		System.out.println("PROFESSOR: ");
		System.out.println(professor2);
	}

}
