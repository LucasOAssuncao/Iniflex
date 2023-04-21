package project;

import entities.Funcionario;
import enums.roles;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
  public static void main(String[] args) {
    List<Funcionario> funcionarios = new ArrayList<>();

    Funcionario maria = new Funcionario("Maria", 2000, 10, 18, 2009.44, roles.OPERADOR.toString());
    Funcionario joao = new Funcionario("João", 1990, 5, 12, 2284.38, roles.OPERADOR.toString());

    funcionarios.add(maria);
    funcionarios.add(joao);
    funcionarios.add(new Funcionario("Caio", 1961, 5, 2, 9836.14, roles.COORDENADOR.toString()));
    funcionarios.add(new Funcionario("Miguel", 1988, 10, 14, 19119.88, roles.DIRETOR.toString()));
    funcionarios
        .add(new Funcionario("Alice", 1995, 1, 5, 2234.68, roles.RECEPCIONISTA.toString()));
    funcionarios.add(new Funcionario("Heitor", 1999, 11, 19, 1582.72, roles.OPERADOR.toString()));
    funcionarios.add(new Funcionario("Arthur", 1993, 3, 31, 4071.84, roles.CONTADOR.toString()));
    funcionarios.add(new Funcionario("Laura", 1994, 7, 8, 3017.45, roles.GERENTE.toString()));
    funcionarios
        .add(new Funcionario("Heloísa", 2003, 5, 24, 1606.85, roles.ELETRICISTA.toString()));
    funcionarios.add(new Funcionario("Helena", 1996, 9, 2, 2799.93, roles.GERENTE.toString()));

    System.out.println(
        "3.1");
    System.out.println(funcionarios + "\n");

    removeEmployee(funcionarios, "João");
    System.out.println();

    printEmployees(funcionarios);
    System.out.println();

    System.out.println(
        "3.4");
    for (Funcionario funcionario : funcionarios) {
      funcionario.raiseSalary();
      System.out.println(funcionario);
    }

    System.out.println();

    //3.5
    Map<String, List<Funcionario>> sortByRole =
        funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));

    System.out.println();

    System.out.println("3.6");
    System.out.println(sortByRole.entrySet());

    System.out.println();

    System.out.println("3.8");
    System.out
        .println(
            funcionarios.stream()
                .filter(s -> s.getDataNascimento().getMonth().getValue() == 10
                    || s.getDataNascimento().getMonth().getValue() == 12)
                .collect(Collectors.toList()));

    System.out.println();

    System.out.println(
        "3.9");

    Comparator<Funcionario> comparator =
        (func1, func2) -> func1.getDataNascimento().compareTo(func2.getDataNascimento());

    Collections.sort(funcionarios, comparator);

    Funcionario oldest = funcionarios.get(0);
    System.out
        .println("Nome: " + oldest.getNome() + ", Idade: " + oldest.getAge() + " anos.");

    System.out.println();

    List<Funcionario> orderedList =
        funcionarios.stream().sorted((arg0, arg1) -> arg0.getNome().compareTo(arg1.getNome()))
            .collect(Collectors.toList());

    System.out.println("3.10");
    printEmployees(orderedList);

    System.out.println();

    BigDecimal salariesSum =
        funcionarios.stream().map(Funcionario::getSalario).reduce(BigDecimal.ZERO, BigDecimal::add);

    System.out.println("3.11");
    System.out.println(Funcionario.formatSalary(salariesSum) + "\n");
  }

  public static List<Funcionario> removeEmployee(List<Funcionario> funcionarios, String nome) {
    List<Funcionario> novaLista = new ArrayList<>(funcionarios);
    novaLista.removeIf(s -> s.getNome().equals(nome));

    System.out.println("3.2");
    System.out.println(novaLista);

    return novaLista;
  }

  public static void printEmployees(List<Funcionario> funcionarios) {
    System.out.println("3.3");
    for (Funcionario funcionario : funcionarios) {
      System.out.println(funcionario);
    }
  }
}
