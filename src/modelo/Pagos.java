/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Martina
 */
public class Pagos {
    private int idPago;
    private Double total;
    private int idCliente;
    private String FormaDePago;
    private boolean Factura;

    public Pagos(int idPago, Double total, int idCliente, String FormaDePago, boolean Factura) {
        this.idPago = idPago;
        this.total = total;
        this.idCliente = idCliente;
        this.FormaDePago = FormaDePago;
        this.Factura = Factura;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }

    public void setFormaDePago(String FormaDePago) {
        this.FormaDePago = FormaDePago;
    }

    public boolean isFactura() {
        return Factura;
    }

    public void setFactura(boolean Factura) {
        this.Factura = Factura;
    }

    @Override
    public String toString() {
        return "Pagos{" + "idPago=" + idPago + ", total=" + total + ", idCliente=" + idCliente + ", FormaDePago=" + FormaDePago + ", Factura=" + Factura + '}';
    }
    
}
