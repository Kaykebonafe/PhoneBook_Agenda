package agenda;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Kayke Bonafé de Luca
 * R.A.: 22.217.003-7
 * 
 */
public class Agenda {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList <PhoneBook> agendaVector = new ArrayList<>();//Cria um ArrayList
        while (true) {
            Scanner entrada = new Scanner(System.in);//Cria um Scanner
        
            System.out.println("Entre com uma das seguintes opções:\n");//Menu de opções
            System.out.println("n - Novo Contato");
            System.out.println("d - Apaga o contato escolhido");
            System.out.println("p - Mostra todos os contatos adicionados na agenda");
            System.out.println("q - Encerra o programa");
            System.out.println(" ");
            
            String in = entrada.next();//Scanner de entrada do índice do menu
              
            switch (in){
                
                case ("n"):
                    System.out.println("Digite o nome:");
                    String nome = entrada.next();//Scanner de input do nome
                    System.out.println("Digite o telefone:");
                    Integer telefone = entrada.nextInt();//Scanner de input de telefone
                    agendaVector.add(new PhoneBook(nome, telefone));
                    break;
            
                case ("d"):
                    System.out.println("Digite o nome do contato que deseja excluir: \n");
                    nome = entrada.next();
                    for(int i = agendaVector.size() - 1; i >= 0; i--){
                       final PhoneBook f = agendaVector.get(i);
                        System.out.println("\tChecando <" + agendaVector.get(i).nome + ">");
                        if(f.nome.equals(nome)){
                            System.out.println("Ele foi encontrado no índice: " + i);
                            agendaVector.remove(i);
                            System.out.println("Excluído com sucesso");
                        }
                    }
                    break;
                case ("p"): 
                        for(int i = 0; i < agendaVector.size(); i++){
                            System.out.println(agendaVector.get(i).getNome());
                            System.out.println(agendaVector.get(i).getTelefone());
                        }
                    break;
                case ("q"):
                    System.exit(0);
            }         
        }
    }
}