package agenda;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {

    public static void main(String[] args) {
       
        while (true) {
            Scanner entrada = new Scanner(System.in);//Cria um Scanner
            ArrayList <PhoneBook> agendaVector = new ArrayList<>();//Cria um ArrayList
        
            System.out.println("Entre com uma das seguintes opções:\n");//Menu de opções
            System.out.println("n [nova entrada]");
            System.out.println("d [apaga registro da agenda]");
            System.out.println("p [imprime toda a agenda]");
            System.out.println("q [sai do programa]");
            System.out.println(" ");
            
            String in = entrada.next();//Scanner de entrada do índice do menu
            String nome = entrada.next();//Scanner de input do nome
            Integer telefone = entrada.nextInt();//Scanner de input de telefone
            
            switch (in){
                
                case ("n"):
                    System.out.println("Entre com o nome e o telefone: \n");
                    agendaVector.add(new PhoneBook(nome, telefone));
                    break;
            
                case ("d"):
                    System.out.println("Digite o nome do contato que deseja excluir: \n");
                    nome = entrada.next();
                    for(int i = agendaVector.size() - 1; i >= 0; i--){
                       final PhoneBook f = agendaVector.get(i);
                        System.out.println("\tChecando <" + agendaVector.get(i).nome + ">");
                        if(f.nome.equals(nome)){
                            System.out.println("Ele foi achado no índice: " + i);
                            agendaVector.remove(i);
                            System.out.println("Excluido com sucesso");
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