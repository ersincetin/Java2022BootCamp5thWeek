package com.programminglanguagesworkspace.api.repository;
import com.programminglanguagesworkspace.api.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
