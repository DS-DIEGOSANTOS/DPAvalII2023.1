package br.edu.ifba.inf011;

import java.io.IOException;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.decorator.MusicaConcrete;
import br.edu.ifba.inf011.model.Player;
import br.edu.ifba.inf011.decorator.LetrasDecorator;
import br.edu.ifba.inf011.decorator.NotaDecorator;
import br.edu.ifba.inf011.decorator.TraducaoDecorator;
import br.edu.ifba.inf011.model.PlayerMode;
import br.edu.ifba.inf011.model.Playlist;
import br.edu.ifba.inf011.model.resources.ResourceLoader;

public class Aplicacao{
	private void musica() throws IOException {

		ResourceLoader.DIR_NAME = "C:\\Users\\DOST\\Downloads\\DPAvalII2023.1\\padroes\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";

		System.out.println("somente notas");
		Musica notas =  new NotaDecorator(new MusicaConcrete("GodSaveTheQueen"));
		System.out.println(notas.execute());

		System.out.println("somente letras");
		Musica letras =  new LetrasDecorator(new MusicaConcrete("GodSaveTheQueen"));
		System.out.println(letras.execute());

		System.out.println("somente Traducao");
		Musica traducao =  new TraducaoDecorator(new MusicaConcrete("GodSaveTheQueen"),"pt");
		System.out.println(traducao.execute());

		System.out.println("notas e letras");
		Musica notasLetras = new LetrasDecorator(new NotaDecorator(new MusicaConcrete("GodSaveTheQueen")));
		System.out.println(notasLetras.execute());

		System.out.println("notas ,letras e traducao");
		Musica notasLetrasTraducao = new TraducaoDecorator(new LetrasDecorator(new NotaDecorator(new MusicaConcrete("GodSaveTheQueen"))),"pt");
		System.out.println(notasLetrasTraducao.execute());
	}
	
	
	private void player() throws IOException {

		ResourceLoader.DIR_NAME = "C:\\Users\\DOST\\Downloads\\DPAvalII2023.1\\padroes\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";
		Musica notas =  new NotaDecorator(new MusicaConcrete("GodSaveTheQueen"));
		Musica letras =  new LetrasDecorator(new MusicaConcrete("GodSaveTheQueen"));
		Playlist playlist = new Playlist("a");
		playlist.insert(notas);
		playlist.insert(letras);


		Player player = new Player();
		int iCount = 0;

		player.insert(playlist);
		player.setMode(PlayerMode.RandomMode);
		//......
		
		while(player.temProximo() && iCount < 30) {
			System.out.println(player.proximo());
			iCount++;
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		Aplicacao app = new Aplicacao();
		app.player();
		//app.teste();
	}

}
