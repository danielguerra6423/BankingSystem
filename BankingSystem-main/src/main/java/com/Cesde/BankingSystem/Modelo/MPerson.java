package com.Cesde.BankingSystem.Modelo;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "person")
public  class MPerson{
    @Id
    @Column(length = 11,nullable = false)
    private int idperson;
    @Column(length = 60,nullable = false)
    private String name;
    @Column(length = 20,nullable = false)
    private String  telephone;
    @Column(length = 50,nullable = false)
    private String email;
    @Column(length = 10,nullable = false)
    private String  username;
    @Column(length = 10,nullable = false)
    private String userpassword;
    @Column(nullable = false)
    private Boolean activo;
    @Column(length = 11,nullable = false)
    private int failedAttempts;

    //Relacion entre las tablas persona y cuenta
    @OneToMany(mappedBy = "persona")
    @JsonManagedReference
    private List<MCuenta> cuentas;


    //Constructores
    //Lleno
    public MPerson(int idperson, String name, String telephone, String email, String username, String userpassword, Boolean activo, int failedAttempts) {
        this.idperson = idperson;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.username = username;
        this.userpassword = userpassword;
        this.activo = activo;
        this.failedAttempts = failedAttempts;
    }

    //Vacio
    public MPerson() {
    }

    //Encapsulamiento
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int faled_attempts) {
        this.failedAttempts = faled_attempts;
    }
}

