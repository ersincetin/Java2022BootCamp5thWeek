package com.programminglanguagesworkspace.api.service.concretes;

import com.programminglanguagesworkspace.api.dto.LanguageDto;
import com.programminglanguagesworkspace.api.entity.Language;
import com.programminglanguagesworkspace.api.repository.LanguageRepository;
import com.programminglanguagesworkspace.api.service.abstracts.ILanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LanguageService implements ILanguageService {
    private final LanguageRepository languageRepository;

    @Override
    public void add(LanguageDto languageDto) {
        this.languageRepository.save(languageDto.getLanguageFromDto());
    }

    @Override
    public void delete(Integer id) {
        this.languageRepository.deleteById(id);
    }

    @Override
    public void update(LanguageDto languageDto, Integer id) {
        Language language = languageDto.getLanguageFromDto();
        language.setId(id);
        this.languageRepository.save(language);
    }

    @Override
    public Optional<Language> getById(Integer id) {
        return this.languageRepository.findById(id);
    }

    @Override
    public List<Language> getAll() {
        return this.languageRepository.findAll();
    }
}
