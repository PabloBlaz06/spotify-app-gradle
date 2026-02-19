package edu.iesam.features.album.data;

import features.album.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {

    private ArrayList<Album> storage = new ArrayList<>();

    public AlbumMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Album album = new Album("1","album1", "1999");
        storage.add(album);
    }

    public ArrayList<Album> findAll(){
        return storage;
    }

    public void save(Album album){
        storage.add(album);
    }

    public static AlbumMemLocalDataSource newInstance(){
        AlbumMemLocalDataSource albumMemLocalDataSource = new AlbumMemLocalDataSource();

        return albumMemLocalDataSource;
    }
}