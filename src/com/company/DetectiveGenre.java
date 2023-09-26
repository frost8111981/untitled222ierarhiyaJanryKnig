package com.company;

public class DetectiveGenre extends GenreByContent{
    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}
