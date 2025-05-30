import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Livro> biblioteca = new ArrayList<>();
        Autor autor1 = new Autor("ANtoine de Saint-Exupéry","francês");
        Autor autor2 = new Autor("Stephen King", "estadunidense");
        LivroFisico livroFisico1 = new LivroFisico("O Pequeno Principe",1943 , autor1, 96);
        LivroFisico livroFisico2 = new LivroFisico("It - A Coisa", 1986, autor2, 1104);
    }
}
