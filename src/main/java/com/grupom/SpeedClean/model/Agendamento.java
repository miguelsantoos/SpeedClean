package com.grupom.SpeedClean.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agendamento {

    @Id
    @GeneratedValue

    private Long id;
    private Data date;
    private String local;
    private String status;
    private User user;
    private Servico servico;
}
