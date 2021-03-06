/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package controller;

import java.util.List;
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
    
    public List consultarMaterial(Livro livro, int IdMaterial) {
        return livro.consultarMaterial(IdMaterial);
    }
    
    public List consultarMaterial(Artigo artigo, int IdMaterial) {
        return artigo.consultarMaterial(IdMaterial);
    }
    
    public List consultarMaterial(Periodico periodico, int IdMaterial) {
        return periodico.consultarMaterial(IdMaterial);
    }
    
    public List consultarMaterial(Video video, int IdMaterial) {
        return video.consultarMaterial(IdMaterial);
    }
    
    public List consultarMaterial(int valor, String nome, Livro livro){
        return livro.consultarMaterial(valor, nome);
    }
    
    public List consultarMaterial(int valor, String nome, Artigo artigo){
        return artigo.consultarMaterial(valor, nome);
    }
    
    public List consultarMaterial(int valor, String nome, Periodico periodico){
        return periodico.consultarMaterial(valor, nome);
    }
    
    public List consultarMaterial(int valor, String nome, Video video){
        return video.consultarMaterial(valor, nome);
    }
    
    public List consultarMaterialID(int valor, int id, Livro livro){
        return livro.consultarMaterialID(valor, id);
    }
    
    public List consultarMaterialID(int valor, int id, Artigo artigo){
        return artigo.consultarMaterialID(valor, id);
    }
    
    public List consultarMaterialID(int valor, int id, Periodico periodico){
        return periodico.consultarMaterialID(valor, id);
    }
    
    public List consultarMaterialID(int valor, int id, Video video){
        return video.consultarMaterialID(valor, id);
    }
    
    public void editarLivro(Livro livro) {
        livro.editarLivro(livro);
    }
    
    public void editarArtigo(Artigo artigo) {
        artigo.editarArtigo(artigo);
    }
    
    public void editarPeriodico(Periodico periodico) {
        periodico.editarPeriodico(periodico);
    }
    
    public void editarVideo(Video video) {
        video.editarVideo(video);
    }

    public void excluirLivro(Livro livro) {
        livro.excluirLivro(livro);
    }
    
    public void excluirArtigo(Artigo artigo) {
        artigo.excluirArtigo(artigo);
    }
    
    public void excluirPeriodico(Periodico periodico) {
        periodico.excluirPeriodico(periodico);
    }
    
    public void excluirVideo(Video video) {
        video.excluirVideo(video);
    }
}
