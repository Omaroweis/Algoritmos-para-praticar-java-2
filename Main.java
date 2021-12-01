import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o numero respectivo da atividade que quer testar ou 0 para terminar");
		Scanner ler = new Scanner(System.in);
		int atividade = ler.nextInt();
		while(atividade != 0) {
			if (atividade == 1) {
				ArrayList<Integer> numeros = new ArrayList<>();
				for(int i=0; i<10; ++i) {
					System.out.println("digite o numero "+ (i+1));
					numeros.add(ler.nextInt());
				}
				for(int i=0; i<10; ++i) {
					System.out.print("o numero " + numeros.get(i) + " e: ");
					if(numeros.get(i)%2 == 0) {
						System.out.println("Par");
					}
					else {
						System.out.println("Impar");
					}
				}
			}else if(atividade == 2) {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				 for(int i=0; i<3; ++i) {
					 System.out.println("Digite o nome do aluno " + (i+1));
					 String nome = ler.next();
					 System.out.println("Digite o curso do aluno " + (i+1));
					 String curso = ler.next();
					 System.out.println("Digite a idade do aluno " + (i+1));
					 int idade = ler.nextInt();
					 alunos.add(new Aluno(nome, curso, idade));
				 }
				 for(int i=0; i<3; ++i) {
					 Aluno aluno;
					 aluno = alunos.get(i);
					 System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos e cursa " + aluno.getCurso());
				 }
			}else {
				System.out.println("Digite seu nome");
				String nome;
				nome = ler.next();
				System.out.println("Digite sua idade");
				int idade = ler.nextInt();
				System.out.println("Digite seu sexo");
				char sexo = ' ';
				try {
					sexo = (char)System.in.read();
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				Pessoa pessoa = new Pessoa(nome, idade, sexo);
				try{
					System.out.println("O(a) " + pessoa.getNome() + " do sexo " + pessoa.getSexoCompleto() + " tem a faixa etaria: " + getFaixaEtaria(pessoa.getIdade()));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Idade invalida");
				}
				
			}
			System.out.println();
			System.out.println("Digite o numero respectivo da atividade que quer testar ou 0 para terminar");
			atividade = ler.nextInt();
		}
	}
	public static String getFaixaEtaria(int idade) throws Exception {
		if(idade <= 0) {
			throw new Exception("Idade nao pode ser menor ou igual a zero");
		}
		if(idade <= 8) {
			return("CRIANCA");
		}else if(idade <= 13) {
			return ("PRE-ADOLESCENTE");
		}else if(idade <= 18) {
			return ("ADOLESCENTE");
		}else if(idade <= 60) {
			return ("ADULTO");
		}else {
			return("IDOSO");
		}		
	}
}
