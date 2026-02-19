package edu.iesam.features.authors.data;

import features.authors.domain.Author;
import features.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;
    private AuthorApiLocalDataSource authorApiLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource,
                                AuthorApiLocalDataSource authorApiLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
        this.authorApiLocalDataSource = authorApiLocalDataSource;
    }


    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }
}
