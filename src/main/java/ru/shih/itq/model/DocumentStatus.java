package ru.shih.itq.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentStatus {
    DRAFT(0, "Draft"), SUBMITTED(1, "Submitted"), APPROVED(2, "Approved");

    private final Integer number;
    private final String desc;
}
