package com.company;

public class VerseGenre extends GenreByForm{
    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}
