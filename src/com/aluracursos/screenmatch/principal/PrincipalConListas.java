package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021 );
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1999);
        otraPelicula.evalua(6);
        var peliculaDeNati = new Pelicula("El señor de los anillos",2001);
        peliculaDeNati.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón",2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeNati);
        lista.add(casaDragon);

        for(Titulo item : lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtista = new ArrayList<>();
        listaDeArtista.add("Penelope Cruz");
        listaDeArtista.add("Antonio Banderas");
        listaDeArtista.add("Ricardo Darin");

        //este sout es una lista no ordenada
        System.out.println(listaDeArtista);

        Collections.sort(listaDeArtista);
        System.out.println("Lista de artistas ordenada: " + listaDeArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}
