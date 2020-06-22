package aula7;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Leonardo");
		aluno1.setCurso("Informática");
		aluno1.setNota1(7);
		aluno1.setNota2(10);
		aluno1.setRa("178484");

		System.out.println(aluno1.calcularMedia());
	}

}
