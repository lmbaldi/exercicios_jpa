package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "Bianca");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Caio", 1000);
		
		alunoDAO.incluirCompleto(aluno1);
		alunoDAO.incluirCompleto(aluno2);
		
		alunoDAO.fechar();
	}
}