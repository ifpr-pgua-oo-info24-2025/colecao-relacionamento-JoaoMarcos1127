public class Livro {
    private String titulo;
    private Integer anoPublicacao;
    private Autor autor;


    public Livro(String titulo, Integer anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String exibirDetalhes() {
        return "Titulo: " + titulo + "| Ano: " + anoPublicacao +
        "| Autor: " + autor.getNome() + "| Nacionalidade: " + autor.getNacionalidade();
    }
    
}
