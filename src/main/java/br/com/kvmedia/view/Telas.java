package br.com.kvmedia.view;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import br.com.kvmedia.entity.Conta;
import br.com.kvmedia.entity.Pessoa;
import br.com.kvmedia.entity.PessoaFisica;
import br.com.kvmedia.entity.PessoaJuridica;
import br.com.kvmedia.service.ContaService;
import br.com.kvmedia.service.PessoaService;

public class Telas {

	private List<Conta> listaContas;
	private List<Pessoa> listaClientesSemConta;
	private Scanner scan;

	public Telas() {

		this.listaContas = ContaService.carregarContas();
		this.listaClientesSemConta = PessoaService.carregarPessoas();
		this.scan = new Scanner(System.in);
	}

	public void abrirMenu() {

		int opcao = 0;

		do {

			limparTela();
			System.out.println("\t\t\tMenu Principal\n\n");
			System.out.println("\t1 - Abrir Nova Conta");
			System.out.println("\t2 - Selecionar Conta");
			System.out.println("\t3 - Cadastrar Cliente");
			System.out.println("\t4 - Relatórios");
			System.out.println("\t5 - Sair\n");
			System.out.println("\tDigite a opção que deseja: ");

			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				subAbrirConta();
				break;
			case 2:
				subSelecionarConta();
				break;
			case 3:
				subCadastrarCliente();
				break;
			case 4:
				subRelatorios();
				break;
			case 5:
				continue;

			default:
				break;
			}

		} while (opcao != 5);

		System.out.println("\tSessão Encerrada");
	}

	private void subAbrirConta() {

		// TODO

	}

	private void subSelecionarConta() {

		// TODO Implementar seleção de conta antes de abrir o menu

		int opcao = 0;

		do {

			limparTela();
			System.out.println("\t\t\tMenu - Selecionar Conta\n\n");
			System.out.println("\t1 - Alterar Conta");
			System.out.println("\t2 - Depósito");
			System.out.println("\t3 - Saque");
			System.out.println("\t4 - Transferência");
			System.out.println("\t5 - Saldo");
			System.out.println("\t6 - Extrato");
			System.out.println("\t7 - Retornar\n");
			System.out.println("\tDigite a opção que deseja: ");

			opcao = this.scan.nextInt();

			// TODO implementar swtich case

		} while (opcao != 7);
	}

	private void subCadastrarCliente() {

		Integer opcao = 0;

		do {

			limparTela();
			System.out.println("\t\t\tMenu - Cadastrar Cliente\n\n");
			System.out.println("\t1 - Pessoa Física");
			System.out.println("\t2 - Pessoa Jurídica");
			System.out.println("\tDigite a opção que deseja: ");

			opcao = this.scan.nextInt();

			switch (opcao) {
			case 1:

				// Declarando as variaveis
				Integer dia, mes, ano;
				String nome, endereco, sexo, cpf;

				// Exibe os campos e recebe os valores
				limparTela();
				System.out.println("\t\t\tMenu - Cadastrar Cliente - Pessoa Fisíca\n\n");
				System.out.println("\tInforme o nome: ");
				nome = this.scan.next();
				System.out.println("\tInforme o endereço: ");
				endereco = this.scan.next();
				System.out.println("\tInforme o sexo (M - Masculino | F - Feminino): ");
				sexo = this.scan.next();
				System.out.println("\tInforme o cpf (Sem Pontuações): ");
				cpf = this.scan.next();
				System.out.println("\tInforme a data de nascimento");
				System.out.println("\tInforme o dia: ");
				dia = this.scan.nextInt();
				System.out.println("\tInforme o mês: ");
				mes = this.scan.nextInt();
				System.out.println("\tInforme o ano: ");
				ano = this.scan.nextInt();

				// Validação das informações preenchidas
				// TODO

				// Caso esteja tudo ok, setar valores
				PessoaFisica pesFis = new PessoaFisica();
				pesFis.setNome(nome);
				pesFis.setEndereco(endereco);
				pesFis.setGenero(sexo);
				pesFis.setDtNascimento(LocalDate.of(ano, mes, dia));
				pesFis.setCpf(cpf);

				// Setar id pessoa
				PessoaService.proximoIdPessoa(listaClientesSemConta, pesFis);
				listaClientesSemConta.add(pesFis);

				break;

			case 2:

				// Declarando variáveis
				String nomeJuridico, enderecoJuridico, atividade, cnpj;

				limparTela();
				System.out.println("\t\t\tMenu - Cadastrar Cliente - Pessoa Jurídica\n\n");
				System.out.println("\tInforme o nome: ");
				nomeJuridico = this.scan.next();
				System.out.println("\tInforme o endereço: ");
				enderecoJuridico = this.scan.next();
				System.out.println("\tInforme a atividade: ");
				atividade = this.scan.next();
				System.out.println("\tInforme o CNPJ (Sem Pontuações): ");
				cnpj = this.scan.next();

				// Validando cadastros
				// TODO

				// Atribuindo valores
				PessoaJuridica pesJur = new PessoaJuridica();
				pesJur.setNome(nomeJuridico);
				pesJur.setEndereco(enderecoJuridico);
				pesJur.setAtividade(atividade);
				pesJur.setCnpj(cnpj);

				// Setar id pessoa
				PessoaService.proximoIdPessoa(listaClientesSemConta, pesJur);

				listaClientesSemConta.add(pesJur);

				break;

			default:
				break;
			}

		} while (1 == 2);

	}

	private void subRelatorios() {

		int opcao = 0;

		do {

			limparTela();
			System.out.println("\t\t\tMenu - Relatórios\n\n");
			System.out.println("\t1 - Saldo das Contas");
			System.out.println("\t2 - Total das Contas");
			System.out.println("\t3 - Retornar");
			System.out.println("\tOpção desejada: ");
			opcao = this.scan.nextInt();

			switch (opcao) {
			case 1:
				ContaService.relatorioSaldo(this.listaContas);
				break;
			case 2:
				ContaService.relatorioTotal(this.listaContas);
				break;
			case 3:
				continue;

			default:
				break;
			}

			opcao = scan.nextInt();

		} while (opcao != 3);
	}

	private void limparTela() {
		try {

			System.out.flush();

			// Limpa a tela no windows, no linux e no MacOS
			if (System.getProperty("os.name").contains("Windows")) {

				new ProcessBuilder("cls").inheritIO().start().waitFor();
			} else {

				Runtime.getRuntime().exec("clear");
			}

		} catch (IOException e) {
		} catch (InterruptedException e) {
		}
	}
}