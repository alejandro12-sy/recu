/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pymvc.model;

/**
 *
 * @author SERGESAN PCS2021
 */
public class Producto {
    int idproducto;
    String nombre;
    int precio;
    int stock;
    int CATEGORIA_IDCATEGORIA;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, int precio, int stock, int CATEGORIA_IDCATEGORIA) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.CATEGORIA_IDCATEGORIA = CATEGORIA_IDCATEGORIA;
    }

    
    
    
    
    
    
    
    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCATEGORIA_IDCATEGORIA() {
        return CATEGORIA_IDCATEGORIA;
    }

    public void setCATEGORIA_IDCATEGORIA(int CATEGORIA_IDCATEGORIA) {
        this.CATEGORIA_IDCATEGORIA = CATEGORIA_IDCATEGORIA;
    }
    
    
    
    
    
    
}
