package com.jspider.service;

import com.jspider.dto.ShowDto;
import com.jspider.entity.AuditoriumEntity;

public interface ShowsService {
    void addShowO(Long audiId, Long movieId, ShowDto showDto);
}
