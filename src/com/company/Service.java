package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {


   static void bemVindo(){
        User.login();
        cadatroLivro();
    }

    static void cadatroLivro(){
       LOL:
        while (true){
            List<Book> listBook = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            Scanner stringScan = new Scanner(System.in);
            System.out.println("Quantos livros você deseja cadastrar?");
            int livros = scanner.nextInt();
            for (int i = 0; i < livros; i++){
                Book book = new Book();
                System.out.println("Digite o numero do ISBN do livro");
                book.isbn = scanner.nextInt();
                System.out.println("Digite o nome do livro: ");
                book.title = stringScan.nextLine();
                System.out.println("Digite o autor do livro: ");
                book.author = stringScan.nextLine();
                System.out.println("Digite o ano que o livro foi lançado: ");
                book.year = stringScan.nextLine();
                System.out.println("Digite a editora do livro: ");
                book.publisher = stringScan.nextLine();
                listBook.add(book);
            }
            System.out.println("(1)Você deseja salvar e encerrar o cadastramento?, (2) Editar ou deletar alguma informação?");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                for(Book f : listBook){
                    System.out.println("ISBN: " + f.isbn);
                    System.out.println("Nome: " + f.title);
                    System.out.println("Autor: " + f.author);
                    System.out.println("Ano Publicação: " + f.year);
                    System.out.println("Editora: " + f.publisher);
                    System.out.println("Você salvou essa lista de livro(s) com sucesso, obrigado por usar o sistema");
                }
                break LOL;
            }else if(opcao == 2){
                System.out.println("(1) Você deseja Editar? ou (2) Você deseja Deletar? ");
                int escolha = scanner.nextInt();
                if(escolha == 1){
                    System.out.println("Qual o ISBN do livro que voçê deseja mudar?");
                    int intIsbn = scanner.nextInt();
                    for(int i = 0; i < listBook.size(); i++){
                        if(listBook.get(i).isbn.equals(intIsbn)){
                            System.out.println("(1) Nome, (2) Autor, (3) Ano Publicação, (4) Editora, (ISBN nao é editado)");
                            int escolhaUm = scanner.nextInt();
                            if(escolhaUm == 1){
                                System.out.println("Digite o novo titulo: ");
                                String newTitulo = stringScan.nextLine();
                                listBook.get(i).title = newTitulo;
                        }
                            if(escolhaUm == 2){
                                System.out.println("Digite o novo autor: ");
                                String newAutor = stringScan.nextLine();
                                listBook.get(i).author = newAutor;
                            }
                            if (escolhaUm == 3){
                                System.out.println("Digite um novo ano de publicação: ");
                                String newAno = stringScan.nextLine();
                                listBook.get(i).year = newAno;
                            }
                            if(escolhaUm == 4){
                                System.out.printf("Digite uma nova editora: ");
                                String newEditora = stringScan.nextLine();
                                listBook.get(i).publisher = newEditora;
                            }
                            }
                        }
                    for(Book f : listBook){
                        System.out.println("ISBN: " + f.isbn);
                        System.out.println("Nome: " + f.title);
                        System.out.println("Autor: " + f.author);
                        System.out.println("Ano Publicação: " + f.year);
                        System.out.println("Editora: " + f.publisher);
                    }
                    break LOL;
                }else if(escolha == 2){
                    System.out.println("Qual o ISBN do livro que voçê deseja deletar?");
                    int intId = scanner.nextInt();
                    for(int a = 0; a < listBook.size(); a++){
                        if(listBook.get(a).isbn.equals(intId)){
                            listBook.remove(a);
                        }
                    }
                    for(Book f : listBook){
                        System.out.println("Sua lista de livros cadastrada atualizada!!!");
                        System.out.println("ISBN: " + f.isbn);
                        System.out.println("Nome: " + f.title);
                        System.out.println("Autor: " + f.author);
                        System.out.println("Ano Publicação: " + f.year);
                        System.out.println("Editora: " + f.publisher);
                    }
                    break LOL;
                }
            }

        }

    }

}
