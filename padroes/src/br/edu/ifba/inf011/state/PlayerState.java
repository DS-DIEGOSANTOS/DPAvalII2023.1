package br.edu.ifba.inf011.state;

import br.edu.ifba.inf011.model.Component;

import java.util.List;

public abstract class PlayerState {

    protected List<Component> components;
    public abstract  boolean temProximo();
    public abstract String proximo();
    public abstract void reset();

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
