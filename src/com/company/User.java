package com.company;

import java.util.Scanner;

public class User {


    static void login(){
        int user = 32;
        int senha = 123;
        System.out.println("Bem vindo ao login ao programa de login!");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o usuario: ");
            int nome = scanner.nextInt();
            System.out.println("Digite a sua senha: ");
            int pass = scanner.nextInt();
            if(nome != user){
                if(pass != senha){
                    System.out.println("Nao achamos a sua conta, tente novamente!");
                    continue;
                }
        }else{
                System.out.println("Você logou com sucesso!!!");
                break;
            }
    }
  }
}
