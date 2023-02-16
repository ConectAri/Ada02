package Aula;
/*
Crie uma função que recebe uma String e retorna o tamanho da String.
E depois crie um método main para testar o seu método, usando um texto
inserido pelo usuário.
 */

public class Aprendendolength {

    public static void main(String[] args) {
        int tamanho =  imprimirMensagem("Java");
        System.out.println(" O tamanho da palavra é: " + tamanho);
    }

    public static int imprimirMensagem(String mensagem) {
            return mensagem.length();

    }



}
