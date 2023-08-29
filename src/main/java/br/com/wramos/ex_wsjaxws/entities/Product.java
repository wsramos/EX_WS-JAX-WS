package br.com.wramos.ex_wsjaxws.entities;

import lombok.Data;

@Data
public class Product {

    private int id;
    private String name;
    private double price;
    private int qtd;

}