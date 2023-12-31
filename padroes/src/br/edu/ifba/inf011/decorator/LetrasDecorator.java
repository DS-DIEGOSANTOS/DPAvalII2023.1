package br.edu.ifba.inf011.decorator;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.resources.ResourceLoader;

import java.io.IOException;
import java.util.List;

public class LetrasDecorator extends MusicaBase{
    private List<String> letras;
    private Integer linha;

    public LetrasDecorator(Musica musica) throws IOException {
        super(musica);
        this.letras = ResourceLoader.instance().loadLetra(super.getNome());
        this.reset();
    }

    public void reset() {
        super.reset();
        this.linha = 0;
    }

    public Boolean finish() {
        return this.linha >= this.letras.size();
    }

    public String play() {
        return super.play()+this.letras.get(this.linha++)+"\n";
    }

    public String execute() {
        StringBuffer str = new StringBuffer();
        this.reset();
        while(!this.finish())
            str.append(this.play());
        return str.toString();
    }
}
