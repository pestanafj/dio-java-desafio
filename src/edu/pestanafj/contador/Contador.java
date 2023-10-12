package edu.pestanafj.contador;

import java.util.Locale;
import java.util.Scanner;

import edu.pestanafj.excecoes.ParametrosInvalidosException;

public class Contador {

    static int primeiroParametro;
    static int segundoParametro;

    public static void main(String[] args) {

        try {
            lerParametros();
            contar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void lerParametros() throws ParametrosInvalidosException {

        try {
            Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro parmetro: ");
            primeiroParametro = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            segundoParametro = terminal.nextInt();

            terminal.close();

            if (primeiroParametro > segundoParametro)
                throw new ParametrosInvalidosException();

        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMensagem());
        }
    }

    public static void contar() {

        int numeroAtual = primeiroParametro;

        while (numeroAtual <= segundoParametro) {
            System.out.println("Imprimir número " + numeroAtual);
            numeroAtual++;

        }

    }
}
