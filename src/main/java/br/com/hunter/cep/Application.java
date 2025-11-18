package br.com.hunter.cep;

import br.com.hunter.cep.controller.EnderecoController;
import br.com.hunter.cep.model.Endereco;

public class Application {
    public static void main(String[] args) {
        EnderecoController controller = new EnderecoController();
        controller.buscarCep("58880000");
        controller.escreverJson("58880000");
    }

}
