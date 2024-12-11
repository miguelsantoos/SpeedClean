package com.grupom.SpeedClean.controller;

import com.grupom.SpeedClean.model.Agendamento;
import com.grupom.SpeedClean.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/usaario/agendamento")
public class AgendamentoController {

    @Autowired
    AgendamentoService service;

    @PostMapping
    public ResponseEntity<Agendamento> salvarAge(@RequestBody Agendamento agendamento) {
        return ResponseEntity.ok(service.salvarAge(agendamento));
    }

    @GetMapping
    public ResponseEntity<List<Agendamento>> todosAge() {
        return ResponseEntity.ok((service.todosAge()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Agendamento>> buscarAge(@PathVariable Long id) {
        return ResponseEntity.ok(service.bascarAge(id));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
        ResponseEntity.noContent().build();
    }
}
