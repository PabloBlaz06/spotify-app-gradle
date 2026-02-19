package edu.iesam.features.album.presentation;

import features.album.data.AlbumDataRepository;
import features.album.data.AlbumMemLocalDataSource;
import features.album.domain.Album;
import features.album.domain.GetAlbumsUseCase;
import features.album.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {


    /*
      Metodo que me permite visualizar un listado de Albums
     */
    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(new AlbumMemLocalDataSource())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbum(){


        //Me creo un album ficticio y lo almaceno.
        Album newAlbum = new Album("2" , "name2", "2000");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(new AlbumMemLocalDataSource())
        );
        saveAlbumUseCase.execute(newAlbum);


        //Recupero la información y valido que está guardada.
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(new AlbumMemLocalDataSource())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

}