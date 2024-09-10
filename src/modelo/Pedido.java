/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Martina
 */
public class Pedido {
    private int idPedido;
    private boolean estado;
    private int idCliente;
    private int cantProductos;
    private double precioXProducto;
    private double Total;

    public Pedido(int idPedido, boolean estado, int idCliente, int cantProductos, double precioXProducto, double Total) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.idCliente = idCliente;
        this.cantProductos = cantProductos;
        this.precioXProducto = precioXProducto;
        this.Total = Total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public double getPrecioXProducto() {
        return precioXProducto;
    }

    public void setPrecioXProducto(double precioXProducto) {
        this.precioXProducto = precioXProducto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", estado=" + estado + ", idCliente=" + idCliente + ", cantProductos=" + cantProductos + ", precioXProducto=" + precioXProducto + ", Total=" + Total + '}';
    }
    
}
