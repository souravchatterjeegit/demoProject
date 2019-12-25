package org.jhipster.blog.service;

import org.jhipster.blog.domain.Author;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Author}.
 */
public interface AuthorService {

    /**
     * Save a author.
     *
     * @param author the entity to save.
     * @return the persisted entity.
     */
    Author save(Author author);

    /**
     * Get all the authors.
     *
     * @return the list of entities.
     */
    List<Author> findAll();


    /**
     * Get the "id" author.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Author> findOne(Long id);

    /**
     * Delete the "id" author.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
