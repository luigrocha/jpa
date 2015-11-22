/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rocha.rivadeneira.vera.tallerhibernate.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luig Rocha
 */
@Entity
@Table(name = "CUENTA")

public class Cuenta implements Serializable{
    @Id
    @Column(name = "COD_CUENTA",nullable = false)
    private String codigo;
    @Column(name = "COD_CLIENTE",nullable = false)
    private Integer codigoCliente;
    @Column(name = "COD_TIPO_CUENTA",nullable = false)
    private String tipoCuenta;
    @Column(name = "FECHA_ULT_MOVIMIENTO",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUtl;
    @Column(name = "SALDO",nullable = false)
        private BigDecimal saldo;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        hash = 17 * hash + Objects.hashCode(this.codigoCliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.codigoCliente, other.codigoCliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", codigoCliente=" + codigoCliente + ", tipoCuenta=" + tipoCuenta + ", fechaUtl=" + fechaUtl + ", saldo=" + saldo + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Date getFechaUtl() {
        return fechaUtl;
    }

    public void setFechaUtl(Date fechaUtl) {
        this.fechaUtl = fechaUtl;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
