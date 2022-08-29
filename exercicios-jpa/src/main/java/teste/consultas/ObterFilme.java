package teste.consultas;
import java.util.List;
import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class ObterFilme {

	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesNotasMaiorQue", "nota", 8.0);
		
		System.out.println(filmes.size());
		
		for(Filme filme : filmes) {
			System.out.print(filme.getNome() + " - ");
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}

}
