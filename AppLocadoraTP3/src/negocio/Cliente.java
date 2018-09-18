package negocio;

public class Cliente {

	private String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	private int idade;
	private float rendaMensal;

	public Cliente(String cpf, String nome, String telefone, String endereco, int idade, float rendaMensal) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
	}

	public void exibe() {

		System.out.printf("Nome do Cliente: %s \n"
				+"CPF: %s \n"
				+"Telefone: %s \n" 
				+"Endereço: %s \n"
				+"Idade: %d \n"
				+"Renda Mensal: R$ %.2f \n\n", 
				nome,
				cpf,
				telefone,
				endereco,
				idade,
				rendaMensal);

	}

	public String getNumeroRegistro() {
		return cpf;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.cpf = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	
	

}
