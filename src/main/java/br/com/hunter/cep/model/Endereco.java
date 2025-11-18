package br.com.hunter.cep.model;

import br.com.hunter.cep.controller.EnderecoDTO;

public class Endereco {
    private final String cep;
    private final String logradouro;
    private final String complemento;
    private final String bairro;
    private final String localidade;
    private final String uf;
    private final String estado;
    private final String regiao;
    private final String ibge;
    private int gia;
    private int ddd;
    private int siafi;

   public Endereco(EnderecoDTO dto){
        this.cep = dto.cep();
        this.logradouro = dto.logradouro();
        this.complemento = dto.complemento();
        this.bairro = dto.bairro();
        this.localidade = dto.localidade();
        this.uf = dto.uf();
        this.estado = dto.estado();
        this.regiao = dto.regiao();
        this.ibge = dto.ibge();
//        this.gia = dto.gia();
//        this.ddd = dto.ddd();
//        this.siafi = dto.siafi();
   }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getIbge() {
        return ibge;
    }

    public int getGia() {
        return gia;
    }

    public int getDdd() {
        return ddd;
    }

    public int getSiafi() {
        return siafi;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia=" + gia +
                ", ddd=" + ddd +
                ", siafi=" + siafi +
                '}';
    }
}
