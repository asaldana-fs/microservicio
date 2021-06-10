package jhipster.example.service.mapper;

import jhipster.example.domain.*;
import jhipster.example.service.dto.AutorDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Autor} and its DTO {@link AutorDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AutorMapper extends EntityMapper<AutorDTO, Autor> {}
