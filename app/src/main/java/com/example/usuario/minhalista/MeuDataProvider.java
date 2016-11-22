package com.example.usuario.minhalista;

/**
 * Created by usuario on 22/11/16.
 */

public class MeuDataProvider {
    private int icone;
    private String nome;
    private String descricao;

    public MeuDataProvider(int icone, String nome, String descricao){
        this.icone = icone;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIcone() {
        return icone;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

}
