package com.programminglanguagesworkspace.api.service.abstracts;

import com.programminglanguagesworkspace.api.dto.LanguageDto;
import com.programminglanguagesworkspace.api.entity.Language;

import java.util.List;
import java.util.Optional;

public interface ILanguageService {
    void add(LanguageDto languageDto);

    void delete(Integer id);

    void update(LanguageDto languageDto,Integer id);

    Optional<Language> getById(Integer id);

    List<Language> getAll();
}
