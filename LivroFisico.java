public class LivroFisico extends Livro {

    private Integer numeroDePaginas;

    public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, Integer numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public Integer getNumeroPaginas() {
        return numeroDePaginas;
    }

    public void setNumeroPaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes()+"| Numero de páginas: " + numeroDePaginas;
    }
}
