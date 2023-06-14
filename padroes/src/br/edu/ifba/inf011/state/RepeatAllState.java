package br.edu.ifba.inf011.state;

import br.edu.ifba.inf011.model.Component;

import java.util.List;

public class RepeatAllState extends PlayerState{
    private int indiceAtual;

    public RepeatAllState(List<Component> components) {
        super.setComponents(components);
        reset();
    }

    @Override
    public boolean temProximo() {
        return true;
    }

    @Override
    public String proximo() {
        Component musica = components.get(indiceAtual);
        indiceAtual = (indiceAtual + 1) % components.size();
        return musica.execute();
    }

    @Override
    public void reset() {
        indiceAtual=0;
    }
}
