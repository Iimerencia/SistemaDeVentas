
package modelo;

/**
 *
 * @author Martina
 */
public class Categoria {
   private int idCategoria;
   private String Descripcion;
   private int estado;

    public Categoria() {
        this.idCategoria =0;
        this.Descripcion = "";
        this.estado = 0;
    }

    public Categoria(int idCategoria, String Descripcion, int estado) {
        this.idCategoria = idCategoria;
        this.Descripcion = Descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", Descripcion=" + Descripcion + ", estado=" + estado + '}';
    }
    
   
   
}
