package com.grupom.SpeedClean.service;

import com.grupom.SpeedClean.model.Agendamento;
import com.grupom.SpeedClean.repository.IAgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Autowired
    IAgendamentoRepository repository;

    public Agendamento salvarAge(Agendamento agendamento) {
        pendenciar(agendamento);
        return repository.save(agendamento);
    }

    public void daletarAge(Long id) {
        repository.deleteById(id);
    }

    // Serve para deixar o status como pendente
    public void pendenciar(Agendamento agendamento) {
        if (agendamento.getStatus() == ""){
            agendamento.setStatus("Pendente");
        }
    }
}
