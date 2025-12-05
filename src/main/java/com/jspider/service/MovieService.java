package com.jspider.service;

import com.jspider.entity.MovieEntity;
import com.jspider.dto.MovieDto;
import com.jspider.entity.MovieEntity;

import java.util.List;

public interface MovieService
{

    void addMovie(MovieDto movieDto);
    MovieEntity getMovie(Long movieId);
    List<MovieEntity> getAllMovies();
}
