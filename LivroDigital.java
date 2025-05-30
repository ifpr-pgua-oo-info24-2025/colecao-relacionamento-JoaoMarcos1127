public class LivroDigital extends Livro {

    private double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, Integer anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes()+"| Tamanho: "+ tamanhoDoArquivoMB;
    }
}
