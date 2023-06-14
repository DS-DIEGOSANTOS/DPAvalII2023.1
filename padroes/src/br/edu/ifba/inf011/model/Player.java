package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.state.PlayerState;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Component> components;
	private PlayerState mode;

	public Player() {
		this.components = new ArrayList<Component>();
		this.setMode(PlayerMode.PlayerAll);

	}
	
	public void insert(Component component) {
		this.components.add(component);
		mode.setComponents(components);
	}

	public boolean temProximo() {
		return mode.temProximo();
	}
	
	public String proximo() {
		return mode.proximo();
	}
	
	public void reset() {
		mode.reset();
	}
	
	public void setMode(PlayerMode mode) {
		this.mode = mode.createState(this.components);
	}

}
