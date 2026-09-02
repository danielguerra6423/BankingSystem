package com.Cesde.BankingSystem.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="cuenta_corriente")
public class MCuentaCorriente {
    @Id
    @Column(length = 11,nullable = false)
    private int id;
    @Column(length = 50,nullable = false)
    private String numerocuenta;
    @Column(length = 50,nullable = false)
    private String propietario;
    @Column(length = 15,nullable = false)
    private Double saldo;
    @Column(length = 15,nullable = false)
    private Double sobregiro;
    @Column(nullable = false)
    private LocalDateTime createdat;

    //Relacion

    //Conctructores
    //Lleno

    public MCuentaCorriente(int id, String numerocuenta, String propietario, Double saldo, Double sobregiro, LocalDateTime createdat) {
        this.id = id;
        this.numerocuenta = numerocuenta;
        this.propietario = propietario;
        this.saldo = saldo;
        this.sobregiro = sobregiro;
        this.createdat = createdat;
    }

    //Vacio

    public MCuentaCorriente() {
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

    public Double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(Double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }
}
