package com.programminglanguagesworkspace.api.dto;

import com.programminglanguagesworkspace.api.entity.Language;
import lombok.Setter;

@Setter
public class LanguageDto {
    private String name;

    public Language getLanguageFromDto() {
        return Language.builder()
                .name(name)
                .build();
    }
}
