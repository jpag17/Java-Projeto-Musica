package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui (Audio audio){
         if (audio.getClassificacao() >=9) {
             System.out.println(audio.getTitulo() + " É um dos preferidos do momento");
         } else {
             System.out.println(audio.getTitulo() + " Também é uma boa opção do momento");
         }
    }
}
