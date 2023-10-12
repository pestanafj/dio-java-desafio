package edu.pestanafj.excecoes;

public class ParametrosInvalidosException extends Exception {
    private String mensagem = "ERRO: O primeiro parâmetro deve ser menor que o segundo!";

    public String getMensagem() {
        return mensagem;
    }
}
