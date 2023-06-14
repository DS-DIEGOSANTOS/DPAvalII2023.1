package br.edu.ifba.inf011.model;

public interface Musica extends Component{
	public String getNome();
	public String execute();
	public void reset();
	public Boolean finish();
	public String play();
}
