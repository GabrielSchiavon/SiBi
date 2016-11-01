/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package controller;

import modelo.*;

/**
 *
 * @author schiavon
 */
public class MaterialBibliograficoController {
    public Livro livro;
    public Artigo artigo;
    public Periodico periodico;
    public Video video;
    
    public MaterialBibliograficoController(){};

    public MaterialBibliograficoController(Livro livro) {
        this.livro = livro;
    }
    
    public MaterialBibliograficoController(Artigo artigo) {
        this.artigo = artigo;
    }
    
    public MaterialBibliograficoController(Periodico periodico) {
        this.periodico = periodico;
    }
    
    public MaterialBibliograficoController(Video video) {
        this.video = video;
    }
        
    public void cadastrarLivro(Livro livro){
        livro.cadastrarLivro(livro);        
    }
    
    public void cadastrarArtigo(Artigo artigo){
        artigo.cadastrarArtigo(artigo);
    }
    
    public void cadastrarPeriodico(Periodico periodico){
        periodico.cadastrarPeriodico(periodico);
    }
    
    public void cadastrarVideo(Video video){
        video.cadastrarVideo(video);
    }
}
