package com.grupom.SpeedClean.repository;

import com.grupom.SpeedClean.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicoRepository extends JpaRepository<Servico, Long> {
}
