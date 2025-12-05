package com.jspider.service;

import com.jspider.dao.AuditoriumDaoImpl;
import com.jspider.dao.MovieDaoImpl;
import com.jspider.dao.ShowDaoImpl;
import com.jspider.dto.ShowDto;
import com.jspider.entity.AuditoriumEntity;
import com.jspider.entity.MovieEntity;
import com.jspider.entity.ShowEntity;
import com.jspider.enums.ShowStatus;

import java.time.LocalDate;

public class ShowsServiceImpl implements ShowsService{
    @Override
    public void addShowO(Long audiId, Long movieId, ShowDto showDto) {
        ShowDaoImpl showDaoImpl = new ShowDaoImpl();
        AuditoriumDaoImpl auditoriumDao = new AuditoriumDaoImpl();
        MovieDaoImpl movieDao = new MovieDaoImpl();

        //MAPPING DTO to ENTITY
        ShowEntity showEntity = new ShowEntity();
        showEntity.setShowTime(LocalDate.now());
        showEntity.setEndTime(LocalDate.now());
        showEntity.setStatus(ShowStatus.OPEN);

        AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
        showEntity.setAuditorium(auditoriumEntity);//link audi to show

        MovieEntity movieEntity = movieDao.getMovie(1l);
        showEntity.setMovie(movieEntity);//link movie to show

        showDaoImpl.addShow(showEntity);//add show to table
    }
}
