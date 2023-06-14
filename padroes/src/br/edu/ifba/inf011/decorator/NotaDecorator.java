package br.edu.ifba.inf011.decorator;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.resources.ResourceLoader;

import java.io.IOException;
import java.util.List;

public class NotaDecorator extends MusicaBase{
    private List<String> notas;
    private Integer linha;

    public NotaDecorator(Musica musica) throws IOException {
        super(musica);
        this.notas = ResourceLoader.instance().loadNotas(super.getNome());
        this.reset();
    }

    public void reset() {
        super.reset();
        this.linha = 0;
    }

    public Boolean finish() {
        return this.linha >= this.notas.size();
    }

    public String play() {
        return super.play()+this.notas.get(this.linha++)+"\n";
    }

    public String execute() {
        StringBuffer str = new StringBuffer();
        this.reset();
        while(!this.finish())
            str.append(this.play());
        return str.toString();
    }

}
