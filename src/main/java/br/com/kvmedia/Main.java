package br.com.kvmedia;

import br.com.kvmedia.dao.FabricanteDAO;
import br.com.kvmedia.entity.Fabricante;

public class Main {

	public static void main(String[] args) {
		try {

			// Telas tel = new Telas();
			// tel.abrirMenu();

			FabricanteDAO dao = new FabricanteDAO();
			dao.delete(3);

			Fabricante fabricante = new Fabricante();
			fabricante.setDescFabricante("FIAT");
			dao.insert(fabricante);

			Fabricante fb = new Fabricante();
			fb.setIdFabricante(1);
			fb.setDescFabricante("MERCEDES BENZ");
			fb = dao.update(fb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
