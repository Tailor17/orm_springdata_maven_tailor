package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.audiencia;


import org.springframework.stereotype.Controller;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static javax.swing.text.DateFormatter.*;

@Controller
public class AudienciaController {

    private static final Scanner input = new Scanner(System.in);
    private static AudienciaService audienciaService;


    //Injeção de dependência
    public AudienciaController(AudienciaService AudienciaService) {
        AudienciaController.audienciaService = AudienciaService;
    }



    public static void main(String[] args) {

        int opcao;
        do {
            System.out.print("\n\"-------  MENU cliente -------\"");
            System.out.print(
                """

                    1. Inserir nova audiencia
                    2. Buscar cliente pelo código
                    3. Editar Audiencia
                    4. Listar todas audiencias
                    5. Excluir audiencia
                    Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> inserir();
                case 2 -> selectaudienciasById();
                case 3 -> atualizar();
                case 4 -> selectaudiencia();
                case 5 -> excluir();
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }

    private static void inserir() {
        Audiencia audiencia = new Audiencia();
        System.out.println("\n++++++ Cadastro de nova Audiencia ++++++");
        System.out.print("\nDigite o nome do responsável: ");
        audiencia.setNomeAudiencia(input.nextLine());
        System.out.print("Digite a data da audiencia: ");
        audiencia.setDataAudiencia(LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.print("\nDigite o parecer da Audiencia: ");
        audiencia.setParecerAudiencia(input.nextLine());
        Audiencia.setSituacao(true);
        System.out.println("Audiencia salva com sucesso:" + audienciaService.insert(audiencia));
    }
    private static void atualizar() {
        System.out.println("\n++++++ Alterar um cliente ++++++");
        Audiencia audiencia;
        int opcao = 0;
        do {
            System.out.print("\nDigite o código do cliente (Zero p/sair): ");
            long codigo = input.nextLong();
            input.nextLine();
            if (codigo == 0) {
                opcao = 0;
            } else {
                audiencia = audienciaService.getAudienciaById(codigo);
                if (audiencia == null) {
                    System.out.println("Código inválido.");
                } else {

                    System.out.println("Responsável: " + audiencia.getNomeAudiencia());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite a nome do novo responsável: ");
                        audiencia.setNomeAudiencia(input.nextLine());;
                    }

                    System.out.println("Data: " + audiencia.getDataAudiencia());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite a nova data da audiencia: ");
                        audiencia.setDataAudiencia(LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    }
                    System.out.println("Parecer: " + audiencia.getParecerAudiencia());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.print("Digite o novo parecer da audiencia: ");
                        audiencia.setParecerAudiencia(input.nextLine());
                    }
                    audiencia.setSituacao(true);
                    if(audienciaService.update(audiencia) != null) {
                        System.out.println("audiencia atualizada com sucesso. " + audienciaService.getAudienciaById(audiencia.getId()));
                    } else {
                        System.out.println("Não foi possível atualizar esta audiencia. Por favor, contate o administrador.");
                    }

                    opcao = 1;
                }
            }
        } while (opcao != 0);
    }

    private static void selectaudienciasById(){
        System.out.print("\nDigite o código da audiencia: ");
        Audiencia audiencia = audienciaService.getAudienciaById(input.nextLong());
        input.nextLine();
        if (audiencia != null) {
            System.out.println(audiencia);
        } else {
            System.out.println("Código não localizado.");
        }

    }
    private static void selectaudiencia() {
        System.out.println("\nLista de audiencias cadastradas no banco de dados:\n" + audienciaService.getAudiencia());
    }
    private static void excluir() {
        System.out.println("\n++++++ Excluir uma audiencia ++++++");
        Audiencia audiencia;
        int opcao = 0;
        do {
            System.out.print("\nDigite o código da audiencia (Zero p/sair): ");
            long codigo = input.nextLong();
            input.nextLine();
            if (codigo == 0) {
                opcao = 0;
            } else if(codigo > 0){
                audiencia = audienciaService.getAudienciaById(codigo);
                if (audiencia == null) {
                    System.out.println("Código inválido.");
                } else {
                    System.out.println(audiencia);
                    System.out.print("Excluir esta audiencia? (0-sim/1-não) ");
                    if (input.nextInt() == 0) {
                        input.nextLine();
                        System.out.print("Tem certeza disso? (0-sim/1-não) ");
                        audiencia.setSituacao(false);
                        input.nextLine();
                        audienciaService.delete(audiencia.getId());
                        System.out.println("audiencia excluída com sucesso:" + audiencia);
                    }

                }
            } else {
                System.out.println("Digite um código válido!!!");
            }
        } while (opcao != 0);
    }




}//fim classe
