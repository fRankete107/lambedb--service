package com.lambe.lambedb.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "vendidos")
@ToString
@EqualsAndHashCode
@Getter @Setter
public class Vendido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String color;
    private String modelo;
    private int idfabricante;
    private int preciocompra;
    private int precioventa;
    private int idfactura;
    private Date fecha;
}
