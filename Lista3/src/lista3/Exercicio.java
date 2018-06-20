/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
public class Exercicio{
  public static void main(String[] args){
    Livro l = new Livro();
    LivroLivraria ll = new LivroLivraria();
    LivroBiblioteca lb = new LivroBiblioteca();
    


    System.out.println("Livro: "+l.getTitulo());
    System.out.println("Preço: " + ll.getPreco());
    System.out.println("Quantidade de livros em estoque: "+ll.getQuantidade());

    System.out.println("Livro: "+l.getTitulo());
    System.out.println("leitor: "+lb.getLeitor());
    System.out.println("Data de devolução: "+lb.getDataDev());
  }
}
