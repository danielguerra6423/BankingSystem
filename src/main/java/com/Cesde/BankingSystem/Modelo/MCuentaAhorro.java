package com.Cesde.BankingSystem.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="cuenta_ahorros")
public class MCuentaAhorro {
    @Id
    @Column(length = 11,nullable = false)
    private int id;
    @Column(length = 50,nullable = false)
    private String numerocuenta;
    @Column(length = 50,nullable = false)
    private String propietario;
    @Column(length = 15,nullable = false)
    private Double saldo;
    @Column(length = 5,nullable = false)
    private Double tasainteres;
    @Column(nullable = false)
    private LocalDateTime createdat;

    //Relacion

    //Contructores
    //Lleno
    public MCuentaAhorro(int id, String numerocuenta, String propietario, Double saldo, Double tasainteres, LocalDateTime createdat) {
        this.id = id;
        this.numerocuenta = numerocuenta;
        this.propietario = propietario;
        this.saldo = saldo;
        this.tasainteres = tasainteres;
        this.createdat = createdat;
    }

    //Vacio
    public MCuentaAhorro() {
    }

    //Emcapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTasainteres() {
        return tasainteres;
    }

    public void setTasainteres(Double tasainteres) {
        this.tasainteres = tasainteres;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }
}

