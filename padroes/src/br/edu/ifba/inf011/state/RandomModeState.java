package br.edu.ifba.inf011.state;

import br.edu.ifba.inf011.model.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomModeState extends PlayerState{
    public RandomModeState(List<Component> components) {
        super.setComponents(components);
    }

    @Override
    public boolean temProximo() {
        return true;
    }

    @Override
    public String proximo() {
        Random random = new Random();
        int indice = random.nextInt(components.size());
        return components.get(indice).execute();
    }

    @Override
    public void reset() {
    }
}
