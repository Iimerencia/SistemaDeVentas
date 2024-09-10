
package modelo;

/**
 *
 * @author Martina
 */
public class Cliente extends Persona {
    private int idCliente;
    private int idPedido;
    private int idPago;

    public Cliente(int idCliente, int idPedido, int idPago, String Nombre, String Apellido, long dni, long celular, String domicilio) {
        super(Nombre, Apellido, dni, celular, domicilio);
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.idPago = idPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    
}
