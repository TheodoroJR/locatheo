package br.com.locatheo.locatheo.repositories;

import br.com.locatheo.locatheo.entities.Veiculo;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {
    Optional<Veiculo> findById(Long id);
    List<Veiculo> findAll(int size, int offset);
    Integer save(Veiculo veiculo);
    Integer update(Veiculo veiculo, Long id);
    Integer delete(Long id);

}
