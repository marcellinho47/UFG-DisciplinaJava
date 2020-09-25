package br.com.kvmedia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.kvmedia.entity.Fabricante;

public class FabricanteDAO {

	public void insert(Fabricante fabricante) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("INSERT INTO Fabricantes VALUES ('" + fabricante.getDescFabricante() + "');");
		statement.close();
	}

	public Fabricante update(Fabricante novoFabricante) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("UPDATE Fabricantes SET DESC_Fabricante = '" + novoFabricante.getDescFabricante() + "' WHERE ID_Fabricante = " + novoFabricante.getIdFabricante() + ";");
		statement.close();

		Fabricante fb = select(novoFabricante.getIdFabricante());
		return fb;
	}

	public void delete(Integer idFabricante) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		statement.execute("DELETE FROM Fabricantes WHERE ID_Fabricante = " + idFabricante + ";");
		statement.close();
	}

	public Fabricante select(Integer idFabricante) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM Fabricantes WHERE ID_Fabricante = " + idFabricante + ";");

		if (resultSet == null) {
			return null;
		}
		resultSet.next();

		Fabricante fb = new Fabricante();
		fb.setIdFabricante(resultSet.getInt("ID_Fabricante"));
		fb.setDescFabricante(resultSet.getString("DESC_Fabricante"));

		statement.close();
		return fb;
	}
}
