/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
public class LivroBiblioteca{
  private Livro livro;
  private boolean emp;
  private String usuario;
  private String dataDev;

  public LivroBiblioteca(Livro livro){
    this.livro = livro;
    this.emp = false;
  }
  public LivroBiblioteca(Livro livro, String leitor){
    this.livro = livro;
    this.usuario = leitor;
    this.emp = true;
    this.dataDev = "Segundo o usuario, com limite maximo de 3 meses";
  }
  public LivroBiblioteca(Livro livro, String leitor,String dataDevolucao){
    this.livro = livro;
    this.usuario = leitor;
    this.emp = true;
    this.dataDev = dataDevolucao;
  }

    LivroBiblioteca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //getters
  public String getNomeAutor(){
    return livro.getAutor();
  }
  public String getDataDev(){
    return this.dataDev;
  }
 
  public int getEditora(){
    return livro.getAnoEditora();
  }
  public boolean getEmprestado(){
    return this.emp;
  }
  public String getLeitor(){
    if(this.emp) return this.usuario;
    else return "O livro não foi emprestado";
  }
  public String getDataDevolucao(){
    if(this.emp) return dataDev;
    else return "O livro não foi emprestado";
  }

  //setters
  public void devolver(){
    this.emp = false;
    this.usuario = "";
  }
  public void alugar(String nome){
    this.emp = true;
    this.usuario = nome;
    this.dataDev = "Segundo o usuario, com limite maximo de 3 meses";
  }
  public void trocarLeitor(String nome){
    this.usuario = nome;
  }
  
}
