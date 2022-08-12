package com.aionsoft.controllers;

import com.aionsoft.estructuras.Cliente;
import com.aionsoft.estructuras.OrdenCompra;
import com.aionsoft.estructuras.Producto;

import java.util.Date;
import java.util.Scanner;
// cree un programa en el cual se ingresen 3 productos con su fabricante, nombre del producto y su preci, luego genere una orden de compra que muestre
// la fecha en la cual se realizo la orden de compra, una descripcion breve de la compra, el cliente de la compra y el precio total de la orden de compra.
public class ordenDeCompraController {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        OrdenCompra ordenCompra1 = new OrdenCompra("primera orden de compra");
        ordenCompra1.setCliente(new Cliente("juanito", "perez"));
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese un producto");
            System.out.println("Fabricante del producto:");
            String fabricante = strScanner.nextLine();
            System.out.println("Nombre del producto:");
            String nombreProducto = strScanner.nextLine();
            System.out.println("Precio del producto:");
            int precio = intScanner.nextInt();
            Producto producto = new Producto(fabricante, nombreProducto, precio);
            ordenCompra1.addProducto(producto);
        }

        long milisegundos = System.currentTimeMillis();
        Date hoy = new Date(milisegundos);
        ordenCompra1.setFecha(hoy);
        for (Producto productos : ordenCompra1.getProductos()) {

            System.out.println(productos);

        }
        ordenCompra1.precioTotal();
        System.out.println(ordenCompra1);


    }
}
