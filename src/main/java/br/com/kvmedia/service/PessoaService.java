package br.com.kvmedia.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.kvmedia.entity.Pessoa;
import br.com.kvmedia.entity.PessoaFisica;
import br.com.kvmedia.entity.PessoaJuridica;

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

	public static List<Pessoa> carregarPessoas() {

		List<Pessoa> listaClientes = new ArrayList<Pessoa>();

		PessoaJuridica pes01 = new PessoaJuridica();
		pes01.setId(1);
		pes01.setNome("Nome - 1");
		pes01.setEndereco("Endereço - 1");
		pes01.setAtividade("Jogado de Futebol");
		pes01.setCnpj("00.000.000/0000-01");
		listaClientes.add(pes01);

		PessoaJuridica pes02 = new PessoaJuridica();
		pes02.setId(2);
		pes02.setNome("Nome - 2");
		pes02.setEndereco("Endereço - 2");
		pes02.setAtividade("Jogado de Futebol");
		pes02.setCnpj("00.000.000/0000-02");
		listaClientes.add(pes02);

		PessoaJuridica pes03 = new PessoaJuridica();
		pes03.setId(3);
		pes03.setNome("Nome - 3");
		pes03.setEndereco("Endereço - 3");
		pes03.setAtividade("Jogado de Futebol");
		pes03.setCnpj("00.000.000/0000-03");
		listaClientes.add(pes03);

		PessoaJuridica pes04 = new PessoaJuridica();
		pes04.setId(4);
		pes04.setNome("Nome - 4");
		pes04.setEndereco("Endereço - 4");
		pes04.setAtividade("Jogado de Futebol");
		pes04.setCnpj("00.000.000/0000-04");
		listaClientes.add(pes04);

		PessoaFisica pes05 = new PessoaFisica();
		pes05.setId(5);
		pes05.setNome("Nome - 5");
		pes05.setEndereco("Endereço - 5");
		pes05.setGenero("M");
		pes05.setDtNascimento(LocalDate.of(1980, 3, 21));
		pes05.setCpf("000.000.000-05");
		listaClientes.add(pes05);

		PessoaFisica pes06 = new PessoaFisica();
		pes06.setId(6);
		pes06.setNome("Nome - 6");
		pes06.setEndereco("Endereço - 6");
		pes06.setGenero("M");
		pes06.setDtNascimento(LocalDate.of(1980, 3, 21));
		pes06.setCpf("000.000.000-06");
		listaClientes.add(pes06);

		return listaClientes;
	}
}
