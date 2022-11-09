package com.programminglanguagesworkspace.api.service.abstracts;

import com.programminglanguagesworkspace.api.dto.TechnologyDto;
import com.programminglanguagesworkspace.api.entity.Technology;

import java.util.List;
import java.util.Optional;

public interface ITechnologyService {
    void add(TechnologyDto technologyDto);

    void delete(Integer id);

    void update(TechnologyDto technologyDto, Integer id);

    Optional<Technology> getById(Integer id);

    List<Technology> getAll();
}
