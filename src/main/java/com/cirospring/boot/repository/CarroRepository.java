package com.cirospring.boot.repository;

import com.cirospring.boot.descricao.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
