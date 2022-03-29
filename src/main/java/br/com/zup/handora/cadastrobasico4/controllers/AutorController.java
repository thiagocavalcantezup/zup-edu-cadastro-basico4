package br.com.zup.handora.cadastrobasico4.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zup.handora.cadastrobasico4.models.Autor;
import br.com.zup.handora.cadastrobasico4.models.AutorDTO;
import br.com.zup.handora.cadastrobasico4.repositories.AutorRepository;

@RestController
@RequestMapping(AutorController.BASE_URI)
public class AutorController {

    public final static String BASE_URI = "/autores";

    private final AutorRepository autorRepository;

    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid AutorDTO autorDTO,
                                       UriComponentsBuilder uriComponentsBuilder) {
        Autor autor = autorRepository.save(autorDTO.paraAutor());

        URI location = uriComponentsBuilder.path(BASE_URI + "/{id}")
                                           .buildAndExpand(autor.getId())
                                           .toUri();

        return ResponseEntity.created(location).build();
    }

}
