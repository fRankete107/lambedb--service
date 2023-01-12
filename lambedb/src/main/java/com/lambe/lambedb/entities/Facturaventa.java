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
@Table(name = "facturaventa")
@ToString
@EqualsAndHashCode
@Getter @Setter
public class Facturaventa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipofactura;
    private String idcliente;
    private String nombreproducto;
    private int idenvio;
    private int preciounitario;
    private int cantidad;
    private int precioenvio;
    private int preciofinal;
    private int idformadepago;
    private Date fecha;
}
