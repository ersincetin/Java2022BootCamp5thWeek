package com.programminglanguagesworkspace.api.controller;

import com.programminglanguagesworkspace.api.dto.LanguageDto;
import com.programminglanguagesworkspace.api.dto.TechnologyDto;
import com.programminglanguagesworkspace.api.entity.Language;
import com.programminglanguagesworkspace.api.entity.Technology;
import com.programminglanguagesworkspace.api.service.abstracts.ITechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/technologies")
public class TechnologyController {
    private final ITechnologyService technologyService;

    @GetMapping(value = "/{id}")
    public Optional<Technology> getById(@PathVariable("id") Integer id) {
        return this.technologyService.getById(id);
    }

    @GetMapping
    public List<Technology> getAll() {
        return this.technologyService.getAll();
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody TechnologyDto technologyDto) {
        this.technologyService.add(technologyDto);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@RequestBody TechnologyDto technologyDto, @PathVariable("id") Integer id) {
        this.technologyService.update(technologyDto, id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.technologyService.delete(id);
    }
}
