package com.carsapi.cars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.cars.dto.carDTO;

@RestController
@RequestMapping("/api/car")

public class CarsController {
  @PostMapping
  public void create(@RequestBody carDTO req) {
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Fabricante: " + req.fabricante());
    System.out.println("Data de fabricação: " + req.dataFabricacao());
    System.out.println("Valor: R$" + req.valor() + ",00");
    System.out.println("Ano do modelo: " + req.anoModelo());
  }
}
