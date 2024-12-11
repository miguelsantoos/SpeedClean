package com.grupom.SpeedClean.service;

import com.grupom.SpeedClean.model.Agendamento;
import com.grupom.SpeedClean.repository.IAgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    IAgendamentoRepository repository;

    public Agendamento salvarAge(Agendamento agendamento) {
        //pendenciar(agendamento);
        return repository.save(agendamento);
    }

    public void daletarAge(Long id) {
        repository.deleteById(id);
    }

    public List<Agendamento> todosAge() {
        return repository.findAll();
    }

    public Optional<Agendamento> bascarAge(Long id) {
        return repository.findById(id);
    }


    public void deletar(Long id) {
        repository.deleteById(id);
    }

    //Serve para deixar o status como pendente
    public void pendenciar(Agendamento agendamento) {
        if (agendamento.getStatus() == ""){
            agendamento.setStatus("Pendente");
        }
    }
}
