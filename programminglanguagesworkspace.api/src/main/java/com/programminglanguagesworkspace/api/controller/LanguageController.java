package com.programminglanguagesworkspace.api.controller;

import com.programminglanguagesworkspace.api.dto.LanguageDto;
import com.programminglanguagesworkspace.api.entity.Language;
import com.programminglanguagesworkspace.api.service.abstracts.ILanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/languages")
public class LanguageController {
    private final ILanguageService languageService;

    @GetMapping(value = "/{id}")
    public Optional<Language> getById(@PathVariable("id") Integer id) {
        return this.languageService.getById(id);
    }

    @GetMapping
    public List<Language> getAll() {
        return this.languageService.getAll();
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody LanguageDto languageDto) {
        this.languageService.add(languageDto);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@RequestBody LanguageDto languageDto, @PathVariable("id") Integer id) {
        this.languageService.update(languageDto, id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.languageService.delete(id);
    }
}
