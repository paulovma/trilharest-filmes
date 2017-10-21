package com.opensanca.trilharest.filmes.filmes.filmes;

import com.opensanca.trilharest.filmes.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.filmes.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping(path = "/em-exibicao", method = RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(ParametrosDePaginacao parametrosDePaginacao) {
        LocalDate hoje = LocalDate.now();
        return filmesRepository.buscarFilmesEmExibicao(parametrosDePaginacao, hoje);
    }

    @GetMapping("/{id}")
    public Filme getPorId(@PathVariable UUID id) {
        return filmesRepository.buscaPorId(id);
    }
}
