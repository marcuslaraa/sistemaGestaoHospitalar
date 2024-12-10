package sistemaGestaoHospitalar;

import java.util.Scanner;

public class Paciente {
  private int id;
  private String nome;
  private String cpf;
  private String dataNascimento;
  private String telefone;
  private String endereco;

  public void cadastrarPaciente() {

    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Nome: ");
      this.nome = scanner.nextLine();

      System.out.print("CPF: ");
      this.cpf = scanner.nextLine();

      System.out.print("Data de Nascimento (dd/MM/yyyy): ");
      this.dataNascimento = scanner.nextLine();

      System.out.print("Telefone: ");
      this.telefone = scanner.nextLine();
      System.out.print("Endereço: ");

      this.endereco = scanner.nextLine();
      System.out.println("Paciente cadastrado com sucesso!");
    } finally {
      scanner.close();
    }

  }

  public void atualizarPaciente() {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Nome: ");
      this.nome = scanner.nextLine();

      System.out.print("CPF: ");
      this.cpf = scanner.nextLine();

      System.out.print("Data de Nascimento (dd/MM/yyyy): ");
      this.dataNascimento = scanner.nextLine();

      System.out.print("Telefone: ");
      this.telefone = scanner.nextLine();

      System.out.print("Endereço: ");
      this.endereco = scanner.nextLine();

      System.out.println("Paciente atualizado com sucesso!");
    } finally {
      scanner.close();
    }
  }

  public void deletarPaciente() {
    this.id = 0;
    this.nome = null;
    this.cpf = null;
    this.dataNascimento = null;
    this.telefone = null;
    this.endereco = null;
    System.out.println("Paciente deletado com sucesso!");
  }

  public void visualizarPaciente() {
    System.out.println("ID: " + this.id);
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Data de Nascimento: " + this.dataNascimento);
    System.out.println("Telefone: " + this.telefone);
    System.out.println("Endereço: " + this.endereco);
  }
}
