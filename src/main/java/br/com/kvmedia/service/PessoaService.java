package br.com.kvmedia.service;

import java.util.List;

import br.com.kvmedia.entity.Pessoa;

public class PessoaService {

	public static void proximoIdPessoa(List<Pessoa> listaClientes, Pessoa cliente) {

		if (listaClientes == null || listaClientes.size() == 0) {

			cliente.setId(1);
		} else {

			Integer maxID = 0;
			for (Pessoa pessoa : listaClientes) {

				if (pessoa.getId() > maxID) {
					maxID = pessoa.getId();
				}
			}

			maxID = maxID + 1;
			cliente.setId(maxID);
		}
	}
}
