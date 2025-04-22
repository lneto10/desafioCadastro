package model.entities.enums;

public enum TipoPet {
    GATO("GATO"),
    CACHORRO("CACHORRO");

    private String nomeTipo;

    TipoPet(String nomeTipo){
        this.nomeTipo = nomeTipo;
    }

    public String getNomeTipo(){
        return nomeTipo;
    }
}
