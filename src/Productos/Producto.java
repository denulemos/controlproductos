/*
En un supermercado se manejan productos que se venden por unidad y otros por peso.
Para un mismo proucto puede haber diferentes marcas y formas de envase.
Los productos marcados como precios cuidados solo puede modificarse su precio a
traves de un porcentaje fijo para todos.
Para los productos que no son de precios cuidados existen dos descuentos, uno de
5% que se otorga los dias jueves si hay mas de 1,5 veces el stock minimo y otro de
10% para productos con precio unitario mayor a $500 que se otorga los viernes.
Confeccine un programa que me permita dado el codigo de un producto conocer su precio
de compra, categoria, precio de venta y cantidad en stock en este momento.
 */
package Productos;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Producto {
    private String codigo; //Codigo que identifica al producto
    private double PVenta;
    private double PCompra;
    private String marca;
    private double stock;
    private double stockm;
    private String Tenvase;
    private boolean PCuidado; //verdadero si esta en la lista de precios cuidados
    private boolean unidad; //verdadero si es por unidades, falso para kg
    private Categoria cate;
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPVenta() {
        return PVenta;
    }

    public void setPVenta(double PVenta) {
        this.PVenta = PVenta;
    }

    public double getPCompra() {
        return PCompra;
    }

    public void setPCompra(double PCompra) {
        this.PCompra = PCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getStockm() {
        return stockm;
    }

    public void setStockm(double stockm) {
        this.stockm = stockm;
    }

    public String getTenvase() {
        return Tenvase;
    }

    public void setTenvase(String Tenvase) {
        this.Tenvase = Tenvase;
    }

    public boolean isPCuidado() {
        return PCuidado;
    }

    public void setPCuidado(boolean PCuidado) {
        this.PCuidado = PCuidado;
    }

    public boolean isUnidad() {
        return unidad;
    }

    public void setUnidad(boolean unidad) {
        this.unidad = unidad;
    }

    public Categoria getCate() {
        return cate;
    }

    public void setCate(Categoria cate) {
        this.cate = cate;
    }
        
    public void CPVenta()
    {
        
    }
    
    public void Venta()
    {
        
    }
    
    public void Compra()
    {
        
    }
    
    public void CambioP()
    {
        
    }
}
