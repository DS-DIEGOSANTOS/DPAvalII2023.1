package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist implements Component{
	
	private String nome;
	private List<Component> components;

	public Playlist(String nome) {
		this.nome = nome;
		this.components = new ArrayList<Component>();
	}

	public void insert(Component component) {
		this.components.add(component);
	}
	
	public String getNome() {
		return this.nome;
	};
	
	public String randomize() {
		List<Component> shuffledComponents = new ArrayList<>(components);
		Collections.shuffle(shuffledComponents);
		StringBuilder sb = new StringBuilder();

		for (Component comp : components) {
			sb.append(comp.execute());
			sb.append("\n-------------------------------\n");
		}
		return sb.toString();
	};
	
	public String execute() {
		StringBuilder sb = new StringBuilder();
		sb.append("Executando playlist: ");
		sb.append(nome);
		sb.append("\n");

		for (Component component : components) {
			sb.append(component.execute());
			sb.append("\n-------------------------------\n");
		}

		return sb.toString();
	}	

}
