package br.com.hunter.cep.controller;

import br.com.hunter.cep.repository.EnderecoRepository;

import java.io.FileWriter;
import java.io.IOException;

public class EnderecoController {
    private final EnderecoRepository enderecoRepository = new EnderecoRepository();
    public void buscarCep(String cep){
        System.out.println(enderecoRepository.buscarCep(cep));
    }

    public void escreverJson(String cep){
        enderecoRepository.escrever(cep);
    }
}
