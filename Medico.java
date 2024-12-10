package sistemaGestaoHospitalar;

import java.util.Scanner;

public class Medico {
  private int id;
  private String nome;
  private String crm;
  private String especialidade;

  public void cadastrarMedico() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Nome: ");
      this.nome = scanner.nextLine();

      System.out.print("CRM: ");

      this.crm = scanner.nextLine();
      System.out.print("Especialidade: ");
      this.especialidade = scanner.nextLine();

      System.out.println("Médico cadastrado com sucesso!");
    } finally {
      scanner.close();
    }
  }

  public void atualizarMedico() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Nome: ");
      this.nome = scanner.nextLine();

      System.out.print("CRM: ");
      this.crm = scanner.nextLine();

      System.out.print("Especialidade: ");
      this.especialidade = scanner.nextLine();

      System.out.println("Médico atualizado com sucesso!");
    } finally {
      scanner.close();
    }
  }

  public void deletarMedico() {
    this.id = 0;
    this.nome = null;
    this.crm = null;
    this.especialidade = null;
    System.out.println("Médico deletado com sucesso!");
  }

  public void visualizarMedico() {
    System.out.println("ID: " + this.id);
    System.out.println("Nome: " + this.nome);
    System.out.println("CRM: " + this.crm);
    System.out.println("Especialidade: " + this.especialidade);
  }
}
