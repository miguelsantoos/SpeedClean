package com.grupom.SpeedClean.repository;

import com.grupom.SpeedClean.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
