package com.grupom.SpeedClean.service;

import com.grupom.SpeedClean.model.Servico;
import com.grupom.SpeedClean.repository.IServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    IServicoRepository repository;

    public Servico salvarServico(Servico servico) {
        return repository.save(servico);
    }

    public List<Servico> buscarServicos() {
        return repository.findAll();
    }

    public Optional<Servico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarServico(Long id) {
        repository.deleteById(id);
    }
}
