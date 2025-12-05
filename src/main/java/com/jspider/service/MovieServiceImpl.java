package com.jspider.service;

import com.jspider.dao.MovieDaoImpl;
import com.jspider.dto.MovieDto;
import com.jspider.entity.MovieEntity;

import java.util.List;

public class MovieServiceImpl implements MovieService{

    private MovieDaoImpl movieDao = new MovieDaoImpl();
    @Override
    public void addMovie(MovieDto movieDto) {

        //convert MovieDTO to MovieEntity
        MovieEntity movieEntity = new MovieEntity();
        //mapping movieDto to MovieEntity
        movieEntity.setTitle(movieDto.getTitle());
        movieEntity.setCertification(movieDto.getCertification());
        movieEntity.setLanguage(movieDto.getLanguage());
        movieEntity.setDuration(movieDto.getDuration());
        movieEntity.setStatus(movieDto.getStatus());
        movieEntity.setCreatedBy(movieDto.getCreatedBy());

        movieDao.addMovie(movieEntity);
    }

    @Override
    public MovieEntity getMovie(Long movieId) {
        return null;
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return null;
    }
}
