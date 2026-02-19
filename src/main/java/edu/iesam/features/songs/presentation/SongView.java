package edu.iesam.features.songs.presentation;

import features.songs.data.SongDataRepository;
import features.songs.domain.GetSongsUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs (){

        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository());

        ArrayList<Song> songsList = new ArrayList<>();
        songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }
}
