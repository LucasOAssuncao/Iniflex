package project;

import entities.Funcionario;
import enums.roles;
import java.util.ArrayList;
import java.util.List;

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
  }
}
