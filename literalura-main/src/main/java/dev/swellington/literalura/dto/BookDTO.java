package dev.swellington.literalura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookDTO(
        int id,
        String title,
        List<PersonDTO> authors,
        List<String> languages,
        int download_count
) { }
