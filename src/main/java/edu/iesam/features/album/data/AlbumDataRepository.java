package edu.iesam.features.album.data;

import features.album.domain.Album;
import features.album.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {

    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }

    @Override
    public ArrayList<Album> getAlbums() {
        return albumMemLocalDataSource.findAll();
    }

    @Override
    public void saveAlbum(Album album) {
        albumMemLocalDataSource.save(album);
    }
}