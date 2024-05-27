package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Set fim de ano 1");
        minhaMusica.setCantor("DJ Blakes");

        for (int  i= 0;  i < 2500; i++) {
            minhaMusica.reproduz();
            
        }

        for (int i = 0; i < 450; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpah");
        meuPodcast.setApresentador("Igão e Mítico");

        for (int i = 0; i < 3000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 300; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
