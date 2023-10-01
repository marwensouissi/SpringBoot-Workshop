package com.example.souissimarwen4twin7.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Chambre {
    @Id
    private long idChambre;
    private long numeroChambre;
    private TypeChambre TypeC;
}
