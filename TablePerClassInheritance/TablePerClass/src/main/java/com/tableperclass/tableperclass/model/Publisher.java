package com.tableperclass.tableperclass.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tpc_publisher")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String author;

}
