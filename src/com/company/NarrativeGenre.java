package com.company;

public class NarrativeGenre extends GenreByNumberOfPages{
    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
