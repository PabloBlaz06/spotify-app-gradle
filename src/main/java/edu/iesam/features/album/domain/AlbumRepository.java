package edu.iesam.features.album.domain;

import java.util.ArrayList;

public interface AlbumRepository {

    ArrayList<Album> getAlbums();
    void saveAlbum(Album album);
}