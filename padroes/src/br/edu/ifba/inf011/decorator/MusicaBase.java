package br.edu.ifba.inf011.decorator;

import br.edu.ifba.inf011.model.Component;
import br.edu.ifba.inf011.model.Musica;

public abstract class MusicaBase implements Musica {
    private Musica musica;

    public MusicaBase(Musica musica) {
        this.musica = musica;
    }

    @Override
    public String getNome() {
        return musica.getNome();
    }

    @Override
    public String execute() {
        return  musica.execute();
    }

    @Override
    public void reset() {
        musica.reset();
    }
    @Override
    public Boolean finish() {
        return musica.finish();
    }

    @Override
    public String play() {
        return musica.play();
    }
}
