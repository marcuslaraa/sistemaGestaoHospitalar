package sistemaGestaoHospitalar;

import java.util.Scanner;

public class Sistema {
  public void menuPrincipal() {
    Scanner scanner = new Scanner(System.in);
    int opcao;
    do {
      System.out.println("Menu Principal:");
      System.out.println("1. Cadastro de Paciente");
      System.out.println("2. Cadastro de Médico");
      System.out.println("3. Cadastro de Atendimento");
      System.out.println("4. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          menuCadastroPaciente();
          break;
        case 2:
          menuCadastroMedico();
          break;
        case 3:
          menuCadastroAtendimento();
          break;
        case 4:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 4);
    scanner.close();
  }

  public void menuCadastroPaciente() {
    Paciente paciente = new Paciente();
    paciente.cadastrarPaciente();
  }

  public void menuCadastroMedico() {
    Medico medico = new Medico();
    medico.cadastrarMedico();
  }

  public void menuCadastroAtendimento() {
    Atendimento atendimento = new Atendimento();
    atendimento.cadastrarAtendimento();
  }

  public void validarAcessoMedico() {
    // Implementação da validação de acesso do médico
    System.out.println("Acesso do médico validado!");
  }
}
