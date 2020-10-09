package br.com.kvmedia.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.kvmedia.entity.CarroEntity;

public class CarroDAO {

	public void insert(CarroEntity carro) {

	}

	public void update(CarroEntity novoCarro) {

	}

	public void delete(Integer idCarro) throws SQLException {

		Connection connection = DatabaseConnectionDAO.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("DELETE FROM Carros WHERE ID_Carro = " + idCarro);
	}

	public CarroEntity select(Integer idCarro) {
		return null;
	}
}
