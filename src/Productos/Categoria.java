/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author Ale
 */
public class Categoria {
    
    private int Codigo;
    private String Nombre;
    private boolean PesoUnidad;
    private boolean DtoDia;
    private int DiaSem;
    private float Pdesc;
    public Producto[] produ;
    
    public Categoria(int Codigo, String Nombre, boolean PesoUnidad,
            boolean DtoDia, int DiaSem, float Pdesc)
    {
        this.Codigo = Codigo;
        this.DiaSem = DiaSem;
        this.DtoDia = DtoDia;
        this.Nombre = Nombre;
        this.Pdesc = Pdesc;
        this.PesoUnidad = PesoUnidad;
    }    
    
    
}
