package atendente.banco.loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class atendenteDAO {

	// faz o insert no banco
	public void insertNewAreaPesquisa(atendenteTO to) throws atendenteException {

		String sentenca = "INSERT INTO ATENDENTE " + " (NOME, EMAIL, CPF, PRODUTOS, MES, NOTAFISCAL)"
				+ " VALUES (?, ?, ?, ?, ?,?)";
		// iniciar as substrings com um espa�o

		Connection conn = null;
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);

			// configurar os par�metros da senten�a
			// setar os valores para cada sinal de interroga��o

			prepStat.setString(1, to.getNome());
			prepStat.setString(2, to.getEmail());
			prepStat.setInt(3, to.getCpf());
			prepStat.setString(4, to.getProdutos());
			prepStat.setString(5, to.getMes());
			prepStat.setInt(6, to.getNotaFiscal());

			prepStat.execute();
		} catch (Exception e) {
			throw new atendenteException("Erro salvando �rea de pesquisa " + to.getNome(), e);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}

	// Exerc�cio: implementar um m�todo para excluir um registro do banco
	/*
	 * public void deleteAreaPesquisa(int codigo) throws atendenteException {
	 * String sql = "DELETE FROM AREA_PESQUISA WHERE CODIGO = ?"; Connection
	 * conn = null; try { conn = DBUtil.openConnection(); PreparedStatement prep
	 * = conn.prepareStatement(sql); prep.setInt(1, codigo); prep.execute(); }
	 * catch (SQLException e) { throw new atendenteException(
	 * "Erro excluindo a �rea de pesquisa " + codigo); } finally {
	 * DBUtil.closeConnection(conn); } }
	 * 
	 * public ArrayList<atendenteTO> consultaAreaPesquisa(int indiceRelevancia)
	 * throws atendenteException {
	 * 
	 * //Exerc�cio: fazer uma consulta com filtro de �ndice de relev�ncia,
	 * usando ?
	 * 
	 * String sql = "SELECT CODIGO, NOME, INDICE_RELEVANCIA, DESCRICAO " +
	 * " FROM AREA_PESQUISA" + " WHERE INDICE_RELEVANCIA = ?";
	 * 
	 * ArrayList<atendenteTO> lista = new ArrayList<atendenteTO>(); Connection
	 * conn = null; try { conn = DBUtil.openConnection(); PreparedStatement prep
	 * = conn.prepareStatement(sql); prep.setInt(1, indiceRelevancia);
	 * 
	 * ResultSet rs = prep.executeQuery(); while(rs.next()) {
	 * 
	 * int codigo = rs.getInt(1); String nome = rs.getString(2); int indice =
	 * rs.getInt(3); String descricao = rs.getString(4);
	 * 
	 * atendenteTO to = new atendenteTO(codigo, indice, nome, descricao);
	 * lista.add(to); // System.out.println(codigo + " - " + nome); } } catch
	 * (SQLException e) { throw new atendenteException(
	 * "Erro consultando a �rea de pesquisa"); } finally {
	 * DBUtil.closeConnection(conn); } return lista; }
	 * 
	 * //Exerc�cio: criar um m�todo para fazer update dos campos: //NOME, �NDICE
	 * DE RELEV�NCIA E DESCRI��O
	 */

	public void updateAtendente(atendenteTO newArea) {

	}
}