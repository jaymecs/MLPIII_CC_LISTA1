import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Agenda ag = new Agenda(2);
		String nome;
		String telefone = null;
		String opcao;

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("------------AGENDA------------");
			System.out.println("1 - ADICIONAR CONTATO");
			System.out.println("2 - PROCURAR CONTATOS");
			System.out.println("3 - EDITAR CONTATOS");
			System.out.println("6 - LISTAR CONTATOS");
			System.out.println("7 - REMOVER CONTATOS");
			System.out.println("------------------------------");
			System.out.println("0 - FECHAR AGENDA");
			System.out.println("------------------------------");

			System.out.println("Digite a opção desejada: ");
			opcao = input.nextLine();

			switch (opcao) {
			case "1":
				boolean ok = false;
				System.out.println("informe nome: ");
				nome = input.nextLine();

				while (ok == false) {
					System.out.println("informe telefone: ");
					telefone = input.nextLine();

					if (ag.validarTelefone(telefone))
						ok = true;
					else {
						System.out
								.println("Formato incorreto! digite novamente");
						System.out.println("------------------------------");
					}
				}

				if (ag.buscar(nome) != null) {
					System.out.println("Contato já existente na agenda!");
					System.out.println("------------------------------");
				} else {
					Pessoa pessoa1 = new Pessoa(nome, telefone);
					ag.add(pessoa1);
					System.out.println("------------------------------");
					System.out.println("Adicionar contatos:");
					System.out.println("------------------------------");
					System.out.println("Nome: " + pessoa1.getNome());
					System.out.println("Telefone: " + pessoa1.getTelefone());
					System.out.println("Contato adicionado!");
					System.out.println("------------------------------");
				}

				ag.pressEnter();
				break;

			case "2":

				if (ag.qtd == 0) {
					System.out.println("Agenda vazia!");
					System.out.println("------------------------------");
				} else {

					String buscarNome = null;
					System.out.println("informe nome para busca: ");
					buscarNome = input.nextLine();

					ag.buscarPeloNome(buscarNome);
				}

				ag.pressEnter();
				break;

			case "3":

				if (ag.qtd == 0) {
					System.out.println("Agenda vazia!");
					System.out.println("------------------------------");
					ag.pressEnter();
				} else {

					String nomeEditar;
					String novoNome;
					int opcao2;

					System.out.println("informe contato a editar: ");
					nomeEditar = input.nextLine();

					System.out.println("--------EDITAR CONTATO--------");
					System.out.println("1 - NOME");
					System.out.println("2 - TELEFONE");
					System.out.println("------------------------------");

					System.out.println("Digite a opção desejada: ");
					opcao2 = input.nextInt();

					switch (opcao2) {
					case 1:
						Scanner inp = new Scanner(System.in);
						if (ag.qtd != 0) {
							Pessoa pessoaAEditar = ag.buscar(nomeEditar);
							if (pessoaAEditar != null) {
								System.out.println("informe novo nome: ");
								novoNome = inp.nextLine();
								String antigoNome = pessoaAEditar.getNome();
								pessoaAEditar.setNome(novoNome);
								System.out
										.println("------------------------------");
								System.out.println("Nome Atual: " + antigoNome);
								System.out.println("Novo Nome: " + novoNome);
								System.out.println("Telefone: "
										+ pessoaAEditar.getTelefone());
								System.out
										.println("------------------------------");
								System.out.println("Contato Editado!");
								System.out
										.println("------------------------------");
							} else {
								System.out.println("Contato não encontrado!");
								System.out
										.println("------------------------------");
							}

						} else {
							System.out.println("Agenda vazia!");
							System.out
									.println("------------------------------");
						}
						ag.pressEnter();

						break; // case1 menu editar

					case 2:
						Scanner in = new Scanner(System.in);
						boolean ok2 = false;
						String novoFone = null;
						if (ag.qtd != 0) {
							Pessoa pessoaAEditar = ag.buscar(nomeEditar);
							if (pessoaAEditar != null) {

								while (ok2 == false) {
									System.out
											.println("informe novo telefone: ");
									novoFone = in.nextLine();

									
									if (ag.validarTelefone(novoFone))
										ok2 = true;
									else {
										System.out
												.println("Formato incorreto! digite novamente");
										System.out
												.println("------------------------------");
									}
								}

								String antigoTelefone = pessoaAEditar
										.getTelefone();
								pessoaAEditar.setTelefone(novoFone);
								System.out
										.println("------------------------------");
								System.out.println("Nome: "
										+ pessoaAEditar.getNome());
								System.out.println("Telefone atual: "
										+ antigoTelefone);
								System.out
										.println("Novo Telefone: " + novoFone);
								System.out
										.println("------------------------------");
								System.out.println("Contato Editado!\n");
								System.out
										.println("------------------------------");
							} else {
								System.out
										.println("Pessoa não encontrada na agenda\n");
								System.out
										.println("------------------------------");
							}

						} else {
							System.out.println("Agenda vazia\n");
							System.out
									.println("------------------------------");
						}
						ag.pressEnter();

						break;// case2 menu editar

					default:
						System.out.println("Opção Inválida");
						System.out.println("------------------------------");
						ag.pressEnter();

					}

				}

				break; // case 3 menu principal

			case "6":

				if (ag.qtd == 0) {
					System.out.println("Não há contatos na Agenda");
					System.out.println("------------------------------");
				} else {
					ag.listar();
				}
				ag.pressEnter();
				break;

			case "7":

				if (ag.qtd == 0) {
					System.out.println("Agenda vazia!");
					System.out.println("------------------------------");
				} else {

					String deletaNome = null;
					Pessoa removePessoa = null;
					String resposta = null;
					int indice = 0;
					System.out.println("informe nome a deletar: ");
					deletaNome = input.nextLine();

						removePessoa = ag.buscar(deletaNome);
						indice = ag.getIndice(deletaNome);
						if (removePessoa != null) {

							System.out
									.println("Tem certeza que deseja remover '"
											+ removePessoa.getNome()
													.toUpperCase() + "' (S/N)?");
							resposta = input.nextLine();

							if (resposta.equalsIgnoreCase("s")) {
								System.out
										.println("------------------------------");
								System.out.println("Nome: "
										+ removePessoa.getNome());
								ag.remover(indice);
								System.out
										.println("------------------------------");
								System.out.println("Contato removido!");
								System.out
										.println("------------------------------");
							}

						} else {
							System.out
									.println("Pessoa não encontrada na agenda");
							System.out
									.println("------------------------------");
						}
				}
				ag.pressEnter();
				break;

			case "0":
				System.out.println("Aplicação Encerrada");
				System.out.println("------------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("Opção Inválida");
				System.out.println("------------------------------");
				ag.pressEnter();
			}

		}

	}
}
