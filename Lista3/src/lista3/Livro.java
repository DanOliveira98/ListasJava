package lista3;
public class Livro {
private String autor, titulo, editora,categoria;
private String quantPag;
private int anoEditora;
 
 public Livro(String nomeLivro, String nomeAutor, String quantidade){
    this.titulo = nomeLivro;
    this.autor = nomeAutor;
    this.quantPag = quantidade;
  }
  public Livro(String nomeLivro, String nomeAutor, String quantidade, int anoEditora){
    this.titulo = nomeLivro;
    this.autor = nomeAutor;
    this.quantPag = quantidade;
    this.anoEditora= anoEditora;
  }
  public Livro(String nomeLivro, String nomeAutor, String quantidade, String editora){
    this.titulo = nomeLivro;
    this.autor = nomeAutor;
    this.quantPag = quantidade;
    this.editora = editora;
  }

    Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public String getTitulo(){
    return this.titulo;
  }
  public String getAutor(){
    return this.autor;
  }
  public String getQuantPag(){
    return this.quantPag.toString();
  }
  public int getAnoEditora(){
    return this.anoEditora;
  }

    public void setAnoEditora(int ano){
    this.anoEditora = ano;
  }
}
