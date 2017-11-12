/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class EntraPro {
    
    private boolean error = true;
    private String codigo;
    private double PCompra;
    private double PVenta;
    private String marca;
    private double stock;
    private double stockm;
    private String Tenvase;
    private boolean PCuidado;
    private boolean unidad;

    public boolean isError() {
        return error;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPCompra() {
        return PCompra;
    }

    public double getPVenta() {
        return PVenta;
    }

    public String getMarca() {
        return marca;
    }

    public double getStock() {
        return stock;
    }

    public double getStockm() {
        return stockm;
    }

    public String getTenvase() {
        return Tenvase;
    }

    public boolean isPCuidado() {
        return PCuidado;
    }

    public boolean isUnidad() {
        return unidad;
    }
    
    
    public EntraPro()
    {
        Scanner entrada0 = new Scanner(System.in);
        
        System.out.println("Codigo: ");
        codigo = entrada0.next();
        
        System.out.println("Precio de compra: ");
        PCompra = entrada0.nextDouble();
        
        System.out.println("Precio de venta: ");
        PVenta = entrada0.nextDouble();
        
        System.out.println("Marca: ");
        marca = entrada0.next();
        
        System.out.println("Stock: ");
        stock= entrada0.nextDouble();
        
        System.out.println("Stock minimo: ");
        stockm=entrada0.nextDouble();
        
        System.out.println("Tipo de envase: ");
        Tenvase = entrada0.next();
        
        System.out.println("Precio cuidado?: ");
        PCuidado = entrada0.nextBoolean();
        
        System.out.println("Unidad: ");
        unidad = entrada0.nextBoolean();
       
    }
}
