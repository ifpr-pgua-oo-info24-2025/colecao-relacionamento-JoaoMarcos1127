import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Livro> biblioteca = new ArrayList<>();
        Autor autor1 = new Autor("ANtoine de Saint-Exupéry","francês");
        Autor autor2 = new Autor("Stephen King", "estadunidense");
        Autor autor3 = new Autor("Dante Aligheri", "italiano");
        Autor autor4 = new Autor("Fernando Pessoa", "português");
        LivroFisico livroFisico1 = new LivroFisico("O Pequeno Principe",1943 , autor1, 96);
        LivroFisico livroFisico2 = new LivroFisico("It - A Coisa", 1986, autor2, 1104);
        LivroDigital livroDigital1 = new LivroDigital("A Divina Comédia", 2012, autor3, 1.71);
        LivroDigital livroDigital2 = new LivroDigital("Livro do Desassossego", 2023, autor4, 1.62);

        biblioteca.add(livroFisico1);
        biblioteca.add(livroFisico2);
        biblioteca.add(livroDigital1);
        biblioteca.add(livroDigital2);

        for(Livro livro : biblioteca){
            System.out.println(livro.exibirDetalhes());
        }
        
    }
}
