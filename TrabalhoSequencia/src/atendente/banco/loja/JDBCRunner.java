package banco.loja;

public class JDBCRunner {

	public static void main(String[] args) {
		
		atendenteDAO areaDAO = new atendenteDAO();
		atendenteTO to = new atendenteTO("Diego", "diego.ever@hotmail.com",  1083111167, "Teste", "Fevereiro", 01);
		try {
			areaDAO.insertNewAreaPesquisa(to);
		} catch (atendenteException e) {
			System.out.println("Erro salvando área de pesquisa.");
			e.printStackTrace();
		}
		System.out.println("Sucesso salvando área de pesquisa.");
	}
}
