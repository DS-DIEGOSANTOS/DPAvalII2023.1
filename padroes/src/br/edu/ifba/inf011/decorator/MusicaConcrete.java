package br.edu.ifba.inf011.decorator;

import br.edu.ifba.inf011.model.Component;
import br.edu.ifba.inf011.model.Musica;

public class MusicaConcrete implements Musica {

    private String nome;

    public MusicaConcrete(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String execute() {
        return "";
    }

    @Override
    public void reset() {
    }

    @Override
    public Boolean finish() {
        return true;
    }

    @Override
    public String play() {
        return "";
    }
}
