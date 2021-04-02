package Programa;

import java.util.Scanner;
import Classes.Contato;

public class Programa {
    public static void main(String[] args) {
        int totalContatos = 0;
        int i;
        int opcao = -1;

        Scanner ler = new Scanner(System.in);

        //#region
        System.out.println("\n********************************************************************");
        System.out.println("\n Olá, por favor, escolha uma das opções abaixo ou aperte 0 para sair");
        System.out.println("\n********************************************************************");
        System.out.println("\n 1 - Para adicionar um Novo Contato a sua agenda");
        System.out.println("\n 2 - Para exibir seus contatos");
        System.out.println("\n 3 - Para procurar um contato por seu código");
        System.out.println("\n 4 - Para procurar um contato por seu nome");
        opcao = ler.nextInt();
        Contato[] contatos = new Contato[totalContatos];
        //#endregion

        while(opcao != 0){
            exibeMenu();
            opcao = ler.nextInt();
            ler.nextLine();
        switch(opcao){
            case 0:
            System.out.println("Entendido, encerrando a aplicação");
            break;

            case 1:
            //#region
            System.out.println("Digite o total de contatos a cadastar:");
            totalContatos = ler.nextInt();
            for(i= 0;i <totalContatos;i++){
            Contato contato = new Contato();
            System.out.println("Insira aqui o nome do Contato");
            contato.setNOME(ler.next());
            System.out.println("Insira aqui o Numero de Telefone do Contato");
            contato.setTELEFONE(ler.next());
            System.out.println("Insira aqui o Codigo do seu Contato");
            contato.setCODIGO(ler.nextInt());
            System.out.println("Seu contato foi salvo na agenda");
            contatos[i] = contato;
            }
            break;
            //#endregion
            case 2:
            for(i= 0;i <totalContatos;i++){
            System.out.println("Aqui estão seus contatos cadastrados:\n Código:" + contatos[i].getCODIGO());
            System.out.println("Telefone:" + contatos[i].getTELEFONE());
            System.out.println("Nome:" + contatos[i].getNOME());
            }
            break;
            case 3:
            for(i= 0;i <totalContatos;i++){
                System.out.println("Contatos por código:\n -->" + contatos[i].getCODIGO() + ":" + contatos[i].getNOME() +"-" + contatos[i].getTELEFONE());
            } break;
            //#endregion
            case 4:
            for(i= 0;i <totalContatos;i++){
                System.out.println("Contatos por nome: \n -->" + contatos[i].getNOME() + ":" + contatos[i].getCODIGO() +":" + contatos[i].getTELEFONE());
            } break;
        } ler.close();
    }
}
    private static void exibeMenu() {
    }

}
