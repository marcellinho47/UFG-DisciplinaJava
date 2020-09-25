package br.com.kvmedia.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.kvmedia.entity.Carro;

public class CarroDAO {

	public void insert(Carro carro) {

	}

	public void update(Carro novoCarro) {

	}

	public void delete(Integer idCarro) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("DELETE FROM Carros WHERE ID_Carro = " + idCarro);
	}

	public Carro select(Integer idCarro) {
		return null;
	}
}
