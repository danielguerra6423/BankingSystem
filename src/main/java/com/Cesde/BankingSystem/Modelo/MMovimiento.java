package com.Cesde.BankingSystem.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimientos")
public class MMovimiento {
    @Id
    @Column(length = 11,nullable = false)
    private int id;
    @Column(length = 50,nullable = false)
    private String numerocuenta;
    @Column(length = 20,nullable = false)
    private String  tipomovimiento;
    @Column(length = 15,nullable = false)
    private Double monto;
    @Column(length = 15,nullable = false)
    private Double saldoanterior;
    @Column(length = 15,nullable = false)
    private Double  saldoposterior;
    @Column(length = 255,nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private LocalDateTime fecha;

    //Relacion entre las tablas movimientos y cuenta
    @ManyToOne
    @JoinColumn(name = "pkcuenta",referencedColumnName = "id")
    @JsonBackReference
    private MCuenta cuenta;

    //Constructores
    //Lleno

    public MMovimiento(int id, String numerocuenta, String tipocuenta, Double monto, Double saldoanterior, Double saldoposterior, String descripcion, LocalDateTime fecha) {
        this.id = id;
        this.numerocuenta = numerocuenta;
        this.tipomovimiento = tipocuenta;
        this.monto = monto;
        this.saldoanterior = saldoanterior;
        this.saldoposterior = saldoposterior;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    //Vacio

    public MMovimiento() {
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

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipocuenta) {
        this.tipomovimiento = tipocuenta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getSaldoanterior() {
        return saldoanterior;
    }

    public void setSaldoanterior(Double saldoanterior) {
        this.saldoanterior = saldoanterior;
    }

    public Double getSaldoposterior() {
        return saldoposterior;
    }

    public void setSaldoposterior(Double saldoposterior) {
        this.saldoposterior = saldoposterior;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
