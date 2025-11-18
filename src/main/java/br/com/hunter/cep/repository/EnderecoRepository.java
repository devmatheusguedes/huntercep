package br.com.hunter.cep.repository;

import br.com.hunter.cep.controller.EnderecoDTO;
import br.com.hunter.cep.model.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EnderecoRepository {
    private final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public EnderecoDTO buscarCep(String cep) {
            EnderecoDTO dto = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            String endereco = "https://viacep.com.br/ws/"+cep+"/json/";
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            dto = gson.fromJson(body, EnderecoDTO.class);
        } catch (InterruptedException e){
            throw new RuntimeException("Erro de requisição na API externa: " + e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
        }

        return dto;
    }

    public void escrever(String cep){
        EnderecoDTO enderecoDTO = buscarCep(cep);
        try {
            FileWriter writer = new FileWriter("dados.json");
            writer.write(gson.toJson(enderecoDTO));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
