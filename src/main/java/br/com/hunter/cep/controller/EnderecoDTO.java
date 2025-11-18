package br.com.hunter.cep.controller;

public record EnderecoDTO(String cep, String logradouro, String complemento,
                          String bairro, String localidade, String uf,
                          String estado, String regiao, String ibge,
                          String gia, String ddd, String siafi) {
}
