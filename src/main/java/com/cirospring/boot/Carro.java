package com.cirospring.boot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer id;
        String marca;
        String modelo;
        Integer ano;
}
