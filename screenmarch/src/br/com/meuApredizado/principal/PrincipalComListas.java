package br.com.meuApredizado.principal;

import java.util.ArrayList;
import java.util.Collections;

import br.com.meuApredizado.modelos.Filme;
import br.com.meuApredizado.modelos.Serie;
import br.com.meuApredizado.modelos.Titulo;

public class PrincipalComListas {
	
	public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }
        
        ArrayList<String> buscaPorArtista = new ArrayList<String>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Claudia");
        buscaPorArtista.add("Paulinho Gogó");
        
        
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtista);
        
        Collections.sort(lista);
        System.out.println(lista);
        

        
    }

}
