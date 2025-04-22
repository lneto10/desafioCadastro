package model.entities.enums;

public enum Sexo {
    MACHO("MACHO"),
    FEMEA("FEMEA");

    private String nome;

    Sexo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
