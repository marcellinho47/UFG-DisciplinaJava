package br.com.kvmedia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.kvmedia.entity.Fabricante;
import br.com.kvmedia.entity.Modelo;

public class ModeloDAO {

	public void insert(Modelo modelo) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("INSERT INTO Modelos VALUES ('" + modelo.getDescModelo() + "', '" + modelo.getFabricante().getIdFabricante() + "');");
		statement.close();
	}

	public Modelo update(Modelo novoModelo) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("UPDATE Modelos SET DESC_Modelo = '" + novoModelo.getDescModelo() + "' WHERE ID_Modelo = " + novoModelo.getIdModelo() + ";");
		statement.close();

		Modelo md = select(novoModelo.getIdModelo());
		return md;
	}

	public void delete(Integer idFabricante) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("DELETE FROM Fabricantes WHERE ID_Fabricante = " + idFabricante + ";");
		statement.close();
	}

	public Modelo select(Integer idModelo) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM Modelos WHERE ID_Modelo = " + idModelo + ";");

		if (resultSet == null) {
			return null;
		}
		resultSet.next();

		Modelo fb = new Modelo();
		fb.setIdModelo(resultSet.getInt("ID_Modelo"));
		fb.setDescModelo(resultSet.getString("DESC_Modelo"));

		int idFabricante = resultSet.getInt("ID_Fabricante");
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante = dao.select(idFabricante);
		fb.setFabricante(fabricante);

		statement.close();
		return fb;
	}
}
