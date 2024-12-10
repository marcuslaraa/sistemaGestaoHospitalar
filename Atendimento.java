package sistemaGestaoHospitalar;

import java.util.Scanner;

public class Atendimento {
  private int id;
  private String dataAtendimento;
  private EstadoAtendimento estadoAtendimento;
  private int pacienteId;
  private int medicoId;

  public void cadastrarAtendimento() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Data do Atendimento (dd/MM/yyyy): ");
      this.dataAtendimento = scanner.nextLine();

      System.out.print("Estado do Atendimento: ");
      this.estadoAtendimento = scanner.nextLine();

      System.out.print("ID do Paciente: ");
      this.pacienteId = scanner.nextInt();

      System.out.print("ID do Médico: ");
      this.medicoId = scanner.nextInt();

      System.out.println("Atendimento cadastrado com sucesso!");
    } finally {
      scanner.close();
    }
  }

  public void atualizarEstadoAtendimento() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Novo Estado do Atendimento: ");
      this.estadoAtendimento = scanner.nextLine();

      System.out.println("Estado do atendimento atualizado com sucesso!");
    } finally {
      scanner.close();
    }
  }

  public void visualizarAtendimento() {
    System.out.println("ID: " + this.id);
    System.out.println("Data do Atendimento: " + this.dataAtendimento);
    System.out.println("Estado do Atendimento: " + this.estadoAtendimento);
    System.out.println("ID do Paciente: " + this.pacienteId);
    System.out.println("ID do Médico: " + this.medicoId);
  }
}
