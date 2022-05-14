package br.com.dio;

import br.com.dio.model.Gatun;

public class PrimeiroPrograma {
    private static String nome;

    public static void main(String[] args) {
        Gatun gato = new Gatun();
        System.out.println(gato);

        int numPaginas;
   ;
        int i = 300;
        Livro livro = new Livro( nome = "A Arte da Guerra", numPaginas = 300) ;
        System.out.println(livro);
        /*int a = 5;
        int b = 6;
        System.out.println("Hello World dnvo! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
