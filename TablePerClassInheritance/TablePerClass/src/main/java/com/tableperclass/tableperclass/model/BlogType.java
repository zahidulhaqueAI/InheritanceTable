package com.tableperclass.tableperclass.model;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tpc_blog_type")
@Setter
@NoArgsConstructor
public class BlogType extends Publisher{

    private String title;
    private String description;
}
