package br.com.kvmedia;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.kvmedia.entity.Conta;
import br.com.kvmedia.entity.ContaEspecial;
import br.com.kvmedia.entity.ContaPoupanca;
import br.com.kvmedia.entity.PessoaFisica;
import br.com.kvmedia.entity.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		List<Conta> listaContas = abrirContas();

		Conta conta1 = listaContas.get(0);
		conta1.depositar(5000.00);
		conta1.sacar(250.00);
		conta1.sacar(150.00);

		Conta conta2 = listaContas.get(1);
		conta2.depositar(1000.00);

		Conta conta3 = listaContas.get(2);
		conta3.depositar(3500.00);
		conta3.transferir(500.00, conta2);
		((ContaPoupanca) conta3).atualizaSaldoRendimento();

		Conta conta4 = listaContas.get(3);
		conta4.depositar(2000.00);
		conta4.depositar(500.00);
		conta4.sacar(200.00);

		relatorioSaldo(listaContas);
	}

	private static List<Conta> abrirContas() {

		// ESPECIAL - FISICA --------------------------------------------------------
		ContaEspecial con01 = new ContaEspecial();

		PessoaFisica pes01 = new PessoaFisica();
		pes01.setId(1);
		pes01.setNome("Ronaldo Fenomeno");
		pes01.setEndereco("Inter de Milão");
		pes01.setGenero("M");
		pes01.setDtNascimento(LocalDate.of(1976, 9, 18));
		pes01.setCpf("000.000.000-01");

		con01.abrirConta(pes01, 1000.00);

		// ESPECIAL - JURIDICA -------------------------------------------------------
		ContaEspecial con02 = new ContaEspecial();

		PessoaJuridica pes02 = new PessoaJuridica();
		pes02.setId(2);
		pes02.setNome("Messi - LTDA");
		pes02.setEndereco("Barcelona");
		pes02.setAtividade("Jogado de Futebol");
		pes02.setCnpj("00.000.000/0000-01");

		con02.abrirConta(pes02, 2000.00);

		// POUPANCA - FISICA -------------------------------------------------------
		ContaPoupanca con03 = new ContaPoupanca();

		PessoaFisica pes03 = new PessoaFisica();
		pes03.setId(3);
		pes03.setNome("Ronaldinho Gaúcho");
		pes03.setEndereco("Paris");
		pes03.setGenero("M");
		pes03.setDtNascimento(LocalDate.of(1980, 3, 21));
		pes03.setCpf("000.000.000-02");

		con03.abrirConta(pes03, 2.5);

		// POUPANCA - JURIDICA -------------------------------------------------------
		ContaPoupanca con04 = new ContaPoupanca();

		PessoaJuridica pes04 = new PessoaJuridica();
		pes04.setId(4);
		pes04.setNome("CR7 - LTDA");
		pes04.setEndereco("Turin");
		pes04.setAtividade("Jogado de Futebol");
		pes04.setCnpj("00.000.000/0000-02");

		con04.abrirConta(pes04, 3.0);

		return Arrays.asList(con01, con02, con03, con04);
	}

	private static void relatorioSaldo(List<Conta> listaContas) {

		StringBuilder sb = new StringBuilder("\t\t\tRelatório de Saldo por Cliente\n\n\n");
		Double saldoTotal = 0.0;

		for (Conta conta : listaContas) {

			sb.append("Nome: ").append(conta.getCliente().getNome()).append("\n");
			sb.append("Saldo: R$ ").append(conta.getSaldo()).append("\n\n");

			saldoTotal = saldoTotal + conta.getSaldo();
		}

		sb.append("\n\nSaldo Total: R$ ").append(saldoTotal);

		System.out.println(sb.toString());
	}
}
