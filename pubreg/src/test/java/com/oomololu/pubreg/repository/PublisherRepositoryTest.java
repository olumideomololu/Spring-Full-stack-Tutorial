package com.oomololu.pubreg.repository;

import com.oomololu.pubreg.model.Publisher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
class PublisherRepositoryTest {

    @Autowired
    private  PublisherRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void CheckIfPublisherExists() {
        //given
        String name = "Olumide Omololu";
        Publisher publisher = new Publisher(name,"oaomololu@gmail.com",2);

        underTest.save(publisher);
        //when
        List<Publisher> expected = underTest.findAllByNameContains("Olu");

        //then
        assertTrue(expected.contains(publisher));
    }

    @Test
    void CheckIfPublisherDoesNotExist() {
        //given
        String name = "Olumide Omololu";
        Publisher publisher = new Publisher(name,"oaomololu@gmail.com",2);

        underTest.save(publisher);
        //when
        List<Publisher> expected = underTest.findAllByNameContains("Ti");

        //then
        assertFalse(expected.contains(publisher));
    }

}