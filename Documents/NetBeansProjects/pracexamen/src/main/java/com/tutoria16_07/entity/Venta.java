/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutoria16_07.entity;

/**
 *
 * @author SERGESAN PCS2021
 */
public class Venta {
    String fecha;
    String tipodoc;
    int    idsucursal;   
            int idcliente;

    public Venta(String fecha, String tipodoc, int idsucursal, int idcliente) {
        this.fecha = fecha;
        this.tipodoc = tipodoc;
        this.idsucursal = idsucursal;
        this.idcliente = idcliente;
    }

    public Venta() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
            
    
}
