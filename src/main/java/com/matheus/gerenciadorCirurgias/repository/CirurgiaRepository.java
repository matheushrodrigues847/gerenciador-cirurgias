package com.matheus.gerenciadorCirurgias.repository;

import com.matheus.gerenciadorCirurgias.model.Cirurgia;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirurgiaRepository extends PagingAndSortingRepository<Cirurgia, Integer> {
}
