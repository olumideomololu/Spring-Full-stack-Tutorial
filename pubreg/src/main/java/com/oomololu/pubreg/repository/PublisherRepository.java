package com.oomololu.pubreg.repository;

import com.oomololu.pubreg.model.Publisher;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PublisherRepository extends ListCrudRepository<Publisher, Integer> {
    List<Publisher> findAllByNameContains(String string);
}
