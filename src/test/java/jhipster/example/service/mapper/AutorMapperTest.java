package jhipster.example.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutorMapperTest {

    private AutorMapper autorMapper;

    @BeforeEach
    public void setUp() {
        autorMapper = new AutorMapperImpl();
    }
}
