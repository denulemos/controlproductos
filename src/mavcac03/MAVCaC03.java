/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavcac03;

import HerenciaGene.Hijo0;
import HerenciaGene.MuestraM0;
import Productos.EntraPro;
import Productos.Producto;
import java.time.LocalDate;


/**
 *
 * @author alumno
 */
public class MAVCaC03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //La clase padre hereda a sus hijos todos sus atributos y metodos.
       /* MuestraM0 m0 = new MuestraM0();
        m0.Mostrar();
        m0.Mostrar2();
        
        Hijo0 h0 = new Hijo0();
        h0.mostrarH();
        
        h0.Mostrar();
        h0.Mostrar2();
        
        h0.Integrar();
        h0.Mostrar2();
        */
        /* Al sobreescribir lo que hago son dos metodos con el mismo nombre
        pero diferentes el del padre es disstinto del del hijo aunque se llamen igual
        */
        
        /*Productos.EntraPro entra0 = new Productos.EntraPro();
        Llamar a una clase poniendo el nombre del paquete es una alternativa para
        no colocar el import arriba, se puede hacer de cualquiera de las dos formas
        */
       EntraPro e0 = new EntraPro();
        Producto pro0 = new Producto();
        if(!e0.isError())
        {
            pro0.setCodigo(e0.getCodigo());
            pro0.setMarca(e0.getMarca());
            pro0.setPCompra(e0.getPCompra());
            pro0.setPCuidado(e0.isPCuidado());
            pro0.setPVenta(e0.getPVenta());
            pro0.setStock(e0.getStock());
            pro0.setStockm(e0.getStockm());
            pro0.setTenvase(e0.getTenvase());
            pro0.setUnidad(e0.isUnidad());
        }
        
        pro0.CPVenta();
        
        System.out.println(pro0.getPVenta());
        
       /* Comentarios varios a tener en cuenta
       
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfWeek().getValue());
        
        Productos.Categoria cate1 = new Productos.Categoria(0, "Nombre", true, true, 0, 0);
        Producto pro1 = new Producto();
        
        pro1.setCate(cate1);
*/
        
        
        
    }
    
}
