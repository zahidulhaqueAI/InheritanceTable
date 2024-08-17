package com.tableperclass.tableperclass.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tpc_book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Publisher {
    private Long pages;
}
