package br.com.astralgate.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	List<Produto> produto = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Sejá bem vindo ao Astral Gate ERP");
		int opcao = 0;


		do{
			List<Produto> soProdutos = produto.stream()
					.filter(produtos -> produtos instanceof Produto)
					.collect(Collectors.toList());

			System.out.println("Informe as opções que deseja como:\n 1-Cadastrar Produto \n 2-Vender Produto\n 3-Exibir itens\n 4-atualizar\n 5-remover item\n 6-pesquisar produto\n 7-Sair");
			 opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
                case 1 -> {
				Peca novaPeca = lerDadosProduto(sc);
				produto.add(novaPeca);
					break;
                }
				case 2 ->{

                    if(produto.isEmpty()){
                        System.out.println("Estoque vazio. ");
                    break;
                    }else {
                        soProdutos.forEach(System.out::println);
                        System.out.println("Digite o id do produto que deseja vender: ");
                        Long id = sc.nextLong();
						sc.nextLine();
//                           int index = produto.indexOf(id);
							boolean vendido = produto.removeIf(p -> p.getId().equals(id));
							if(vendido) {
								System.out.println("Produto Vendido com sucesso ");
							}else{
								System.out.println("Produto não encontrado no estoque");
							}
                        break;
                    }
				}
				case 3 -> {
                    System.out.println("Exibir produtos\n ");
                    soProdutos.forEach(System.out::println);
                    break;
                }

				case 4 -> {
					System.out.println("Informe seu ID: ");
					Long id = sc.nextLong();
					sc.nextLine();
					java.util.Optional<Produto> produtoBuscando = produto.stream().filter(p ->
							p.getId().equals(id)).findFirst();
					if(produtoBuscando.isPresent()){

						Produto produtoOriginal = produtoBuscando.get();
						Peca dadosNovos = lerDadosProduto(sc);
						produtoOriginal.setNome(dadosNovos.getNome());
						produtoOriginal.setValorCusto(dadosNovos.getValorCusto());
						produtoOriginal.setValorVenda(dadosNovos.getValorVenda());
						System.out.println("Produto atualizado com sucesso!");
					}else{
						System.out.println("Produto não encontrado");
					}
					break;
				}
				case 5 -> {

					break;
				}
				case 6 -> {

					break;
				}
				case 7 -> {
				System.exit(0);
					break;
				}


            }

		}while(opcao != 7);


}
	private static Peca lerDadosProduto(Scanner sc) {
		System.out.println("Informe o nome do item:\n");
		String nome = sc.nextLine();
		System.out.println("Informe o valor custo:\n ");
		BigDecimal valorCusto = sc.nextBigDecimal();
		sc.nextLine();
		System.out.println("Informe o valor de venda do item\n");
		BigDecimal valorVenda = sc.nextBigDecimal();
		sc.nextLine();

		return new Peca(nome,valorVenda,valorCusto);
	};


}
