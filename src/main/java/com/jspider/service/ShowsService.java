package com.jspider.service;

import com.jspiders.dto.ShowDto;
import com.jspiders.entity.AuditoriumEntity;

public interface ShowsService {
    void addShowO(Long audiId, Long movieId, ShowDto showDto);
}
