package com.tableperclass.tableperclass.repository;

import com.tableperclass.tableperclass.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepoI extends JpaRepository<Publisher, Long> {
}
