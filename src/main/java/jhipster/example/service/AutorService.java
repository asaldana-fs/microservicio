package jhipster.example.service;

import java.util.Optional;
import jhipster.example.service.dto.AutorDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link jhipster.example.domain.Autor}.
 */
public interface AutorService {
    /**
     * Save a autor.
     *
     * @param autorDTO the entity to save.
     * @return the persisted entity.
     */
    AutorDTO save(AutorDTO autorDTO);

    /**
     * Partially updates a autor.
     *
     * @param autorDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AutorDTO> partialUpdate(AutorDTO autorDTO);

    /**
     * Get all the autors.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AutorDTO> findAll(Pageable pageable);

    /**
     * Get the "id" autor.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AutorDTO> findOne(Long id);

    /**
     * Delete the "id" autor.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
