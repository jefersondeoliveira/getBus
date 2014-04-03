package model;

import java.util.Random;


public abstract class Pessoa {
    Random r = new Random();
    private String nome = "";
    public int codigo = 1;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void GeraCodigo();
}
