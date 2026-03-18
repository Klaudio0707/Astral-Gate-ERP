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

			System.out.println("Informe as opções que deseja como:\n 1-Cadastrar Produto \n 2-Vender Produto\n 3-Exibir itens\n 4-Sair");
			 opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
                case 1 -> {
					System.out.println("Informe o nome do item:\n");
					String nome = sc.nextLine();
					System.out.println("Informe o valor custo:\n ");
					BigDecimal valorCusto = sc.nextBigDecimal();
					sc.nextLine();
					System.out.println("Informe o valor de venda do item\n");
					BigDecimal valorVenda = sc.nextBigDecimal();
					sc.nextLine();

                    produto.add(new Peca(nome, valorVenda, valorCusto ));

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
                        if(produto.contains(id)){
                            produto.remove(id);
                            int index = produto.indexOf(id);
                            System.out.println("Produto Vendido com sucesso " + produto.get(index));
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
                     System.exit(0);
                     break;
                 }


            }

		}while(opcao != 4);


}


}
