package com.grupom.SpeedClean.controller;

import com.grupom.SpeedClean.model.Servico;
import com.grupom.SpeedClean.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/servicos")
public class ServicoController {

    @Autowired
    ServicoService service;

    @PostMapping
    public ResponseEntity<Servico> salvarServico(@RequestBody Servico servico) {
        return ResponseEntity.ok(service.salvarServico(servico));
    }

    @GetMapping
    public ResponseEntity<List<Servico>> buscarServicos() {
        return ResponseEntity.ok(service.buscarServicos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Servico>> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarServico(id);
    }
}
