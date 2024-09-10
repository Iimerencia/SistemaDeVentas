
package modelo;

/**
 *
 * @author Martina
 */
public class Productos {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int stock;
    private double valor;
    private String categoria;

    public Productos(int idProducto, String nombre, String descripcion, int stock, double valor, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.valor = valor;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock + ", valor=" + valor + ", categoria=" + categoria + '}';
    }

   
    
}
