
public class Aluno {
	private String nome;
	private int idade;
	private String curso;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	Aluno(){
		this.curso = "";
		this.idade = 0;
		this.nome = "";
	}
	Aluno(String nome, String curso, int idade){
		this.nome = nome;
		this.curso = curso;
		this.idade = idade;
	}
}
