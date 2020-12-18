package com.exame.examepdm.entity;

import java.io.Serializable;

public class Cachorro implements Serializable {

    public int idCachorro;
    public String raca;
    public String nome;
    public int idade;


    public int getIdCachorro() {
        return idCachorro;
    }

    public void setIdCachorro(int idCachorro) {
        this.idCachorro = idCachorro;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "raca: " + raca + " | nome: " + nome + " | idade: " + idade;
    }
}
