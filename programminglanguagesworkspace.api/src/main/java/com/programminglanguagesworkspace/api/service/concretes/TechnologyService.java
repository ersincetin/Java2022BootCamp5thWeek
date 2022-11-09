package com.programminglanguagesworkspace.api.service.concretes;

import com.programminglanguagesworkspace.api.dto.TechnologyDto;
import com.programminglanguagesworkspace.api.entity.Technology;
import com.programminglanguagesworkspace.api.repository.TechnologyRepository;
import com.programminglanguagesworkspace.api.service.abstracts.ITechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TechnologyService implements ITechnologyService {
    private final TechnologyRepository technologyRepository;

    @Override
    public void add(TechnologyDto technologyDto) {
    }

    @Override
    public void delete(Integer id) {
        this.technologyRepository.deleteById(id);
    }

    @Override
    public void update(TechnologyDto technologyDto, Integer id) {

    }

    @Override
    public Optional<Technology> getById(Integer id) {
        return this.technologyRepository.findById(id);
    }

    @Override
    public List<Technology> getAll() {
        return this.technologyRepository.findAll();
    }
}
