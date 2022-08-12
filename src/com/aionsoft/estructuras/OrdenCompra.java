package com.aionsoft.estructuras;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[3];
    private int sumapreciosproductos;
    private int contador;
    private int indiceProductos = 0;
    private int precioTotal;

    public OrdenCompra(String descripcion) {

        this.descripcion = descripcion;

    }

    public String getDescripcion() {

        return descripcion;

    }

    public Date getFecha() {

        return fecha;

    }

    public Cliente getCliente() {

        return cliente;

    }

    public Producto[] getProductos() {
        if (productos.length < 2) {

            Producto productosOrdenDeCompra[] = this.productos;

        }

        return productos;

    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;

    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;

    }

    public void setProducto(Producto producto) {
        this.productos[contador++] = producto;

    }

    public OrdenCompra addProducto(Producto producto) {
        this.productos[indiceProductos++] = producto;
        return this;
    }

    public void precioTotal() {
        int sumaTotal = 0;

        for (int i = 0; i < productos.length; i++) {

            sumaTotal = sumaTotal + productos[i].getPrecio();

        }

        this.precioTotal = sumaTotal;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
