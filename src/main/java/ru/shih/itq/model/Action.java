package ru.shih.itq.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Action {
    SUBMIT(1, "Submit"), APPROVED(2, "Approved");

    private final Integer number;
    private final String desc;
}
