package com.reinel.market.persistence.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nombre;

    private String apellidos;

    private BigInteger celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;


    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


}
