package br.edu.ifba.inf011.state;

import br.edu.ifba.inf011.model.Component;

import java.util.List;

public class PlayerAllState extends PlayerState {
    private int indiceAtual;
    public PlayerAllState(List<Component> components) {
        super.setComponents(components);
        this.indiceAtual = 0;
    }
    @Override
    public boolean temProximo() {
        return indiceAtual < components.size();
    }
    @Override
    public String proximo() {
        String musica = components.get(indiceAtual).execute();
        indiceAtual++;
        return musica;
    }

    @Override
    public void reset() {

    }
}

