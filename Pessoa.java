
public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	Pessoa(){
		nome = "";
		idade = 0;
		sexo = ' ';
	}
	Pessoa(String nome){
		this.nome = nome;
		this.idade = 0;
		this.sexo = ' ';
	}
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	Pessoa(String nome, int idade, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	public String getSexoCompleto() {
		if(this.sexo == 'm' || this.sexo == 'M')
			return "MASCULINO";
		return "FEMININO";
	}
		
}
