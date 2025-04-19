package model.entities;

import model.entities.enums.Sexo;
import model.entities.enums.TipoPet;

public class Pet {
    private String nome;
    private String sobrenome;
    private String endereco;
    private String bairro;
    private Integer idade;
    private Double peso;
    private String raça;
    private Sexo sexo;
    private TipoPet tipo;


    public Pet(String nome, String sobrenome, String endereco, String bairro, Integer idade, Double peso, String raça, Sexo sexo, TipoPet tipo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.idade = idade;
        this.peso = peso;
        this.raça = raça;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public TipoPet getTipo() {
        return tipo;
    }

    public void setTipo(TipoPet tipo) {
        this.tipo = tipo;
    }
}
