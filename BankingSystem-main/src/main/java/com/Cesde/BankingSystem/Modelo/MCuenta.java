package com.Cesde.BankingSystem.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cuenta")
public class MCuenta {
    @Id
    @Column(length = 11,nullable = false)
    private int id;
    @Column(length = 50,nullable = false)
    private String numerocuenta;
    @Column(length = 50,nullable = false)
    private String propietario;
    @Column(length = 15,nullable = false)
    private String tipocuenta;
    @Column(length = 15,nullable = false)
    private Double saldo;
    @Column(nullable = false)
    private Boolean estado;
    @Column(nullable = false)
    private LocalDateTime createdat;

    //Relaciones entre las tablas cuenta y la tabla cuenta corriente

    @OneToMany(mappedBy = "cuenta")
    @JsonManagedReference
    private List<MCuentaCorriente> cuentaCorrientes;

    //Relación entre las tablas cuenta y la tabla cuenta de ahorros
    @OneToMany(mappedBy = "cuenta")
    @JsonManagedReference
    private List<MCuentaAhorro> cuentaAhorros;

    // Relación entre las tablas cuenta y la tabla Mmovimiento
    @OneToMany(mappedBy = "cuenta")
    @JsonManagedReference
    private List<MMovimiento> movimientos;

    //Relación entre las tablas cuenta y la tabla MTarjetaCredito
    @OneToMany(mappedBy = "cuenta")
    @JsonManagedReference
    private List<MTarjetaCredito> tarjetaCreditos;

    //Relación entre las tablas cuenta y la tabla MPersona
    @ManyToOne
    @JoinColumn(name = "pkpersona",referencedColumnName = "idperson")
    @JsonBackReference
    private MPerson persona;

    //Constructores
    //Lleno

    public MCuenta(int id, String numerocuenta, String propietario, String tipocuenta, Double saldo, Boolean estado, LocalDateTime createdat) {
        this.id = id;
        this.numerocuenta = numerocuenta;
        this.propietario = propietario;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.createdat = createdat;
    }


    //Vacio

    public MCuenta() {
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

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }
}
