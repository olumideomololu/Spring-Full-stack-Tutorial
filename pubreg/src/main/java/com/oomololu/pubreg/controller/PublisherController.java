package com.oomololu.pubreg.controller;

import com.oomololu.pubreg.model.Publisher;
import com.oomololu.pubreg.repository.PublisherRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/publisher")
public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Publisher create(@Valid @RequestBody Publisher publisher){
        return publisherRepository.save(publisher);
    }

    @GetMapping("/all")
    public List<Publisher> getAllAuthors() {
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Publisher> findOneById(@PathVariable Integer id) {
        return publisherRepository.findById(id);
    }

    @PutMapping("/update")
    public Publisher update(@RequestBody Publisher publisher){
        return publisherRepository.save(publisher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        publisherRepository.deleteById(id);
    }

    @GetMapping("/search")
    public List<Publisher> searchByName(@RequestBody String string) {
        return publisherRepository.findAllByNameContains(string);
    }
}
