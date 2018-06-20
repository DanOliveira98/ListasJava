/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
public class LivroLivraria{
  private Livro livro;
  private int quantidade;
  private float preco;
  public LivroLivraria(Livro livro, float preco){
    this.livro = livro;
    this.preco = preco;
  }
  public LivroLivraria(Livro livro, float preco,int quantidade){
    this.livro = livro;
    this.preco = preco;
    this.quantidade = quantidade;
  }

    LivroLivraria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  public String getNomeLivro(){
    return this.livro.getTitulo();
  }
  public String getAutorLivro(){
    return this.livro.getAutor();
  }
  public int getDataLancamentoLivro(){
    return this.livro.getAnoEditora();
  }
  public float getPreco(){
    return this.preco;
  }
  public int getQuantidade(){
    return this.quantidade;
  }

  public void setPreco(float novoPreco){
  this.preco = novoPreco;
  }

}