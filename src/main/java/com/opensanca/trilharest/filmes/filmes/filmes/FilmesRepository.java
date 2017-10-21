package com.opensanca.trilharest.filmes.filmes.filmes;

import com.opensanca.trilharest.filmes.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.filmes.comum.ParametrosDePaginacao;

import java.time.LocalDate;
import java.util.UUID;

public interface FilmesRepository {

    Pagina<Filme> buscarFilmesEmExibicao(ParametrosDePaginacao parametrosDePaginacao, LocalDate referencia);

    /**
     *
     * @param id
     * @return Filme / IllegalArgumentException
     */
    Filme buscaPorId(UUID id);
}
