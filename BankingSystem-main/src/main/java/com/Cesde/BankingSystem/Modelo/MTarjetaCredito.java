package com.Cesde.BankingSystem.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="targeta_credito")
public class MTarjetaCredito {
    @Id
    @Column(length =11,nullable = false)
    private int id;
    @Column(length = 50,nullable = false)
    private String numerotarjeta;
    @Column(length = 50,nullable = false)
    private String propietario;
    @Column(length = 3,nullable = false)
    private String cvv;
    @Column(length = 15,nullable = false)
    private Double limitecredito;
    @Column(length = 15,nullable = false)
    private Double deudaactual;
    @Column(length = 5,nullable = false)
    private LocalDate  fechavencimiento;
    @Column(nullable = false)
    private Boolean activo;
    @Column(nullable = false)
    private LocalDateTime createdat;

    //Relacion entre las tablas tarjeta de credito y cuenta
    @ManyToOne
    @JoinColumn(name = "pkcuenta",referencedColumnName = "id")
    @JsonBackReference
    private MCuenta cuenta;

    //Constructores
    //Lleno

    public MTarjetaCredito(int id, String numerotarjeta, String propietario, String cvv, Double limitecredito, Double deudaactual, LocalDate fechavencimiento, Boolean activo, LocalDateTime createdat) {
        this.id = id;
        this.numerotarjeta = numerotarjeta;
        this.propietario = propietario;
        this.cvv = cvv;
        this.limitecredito = limitecredito;
        this.deudaactual = deudaactual;
        this.fechavencimiento = fechavencimiento;
        this.activo = activo;
        this.createdat = createdat;
    }

    //Vacio

    public MTarjetaCredito() {
    }

    //Emcapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Double getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(Double limitecredito) {
        this.limitecredito = limitecredito;
    }

    public Double getDeudaactual() {
        return deudaactual;
    }

    public void setDeudaactual(Double deudaactual) {
        this.deudaactual = deudaactual;
    }

    public LocalDate getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(LocalDate fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }
}
