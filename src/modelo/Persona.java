
package modelo;

/**
 *
 * @author Martina
 */
public abstract class Persona {
    protected String Nombre;
    protected String Apellido;
    protected long dni;
    protected long celular;
    protected String domicilio;

    public Persona(String Nombre, String Apellido, long dni, long celular, String domicilio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.celular = celular;
        this.domicilio = domicilio;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public long getDni() {
        return dni;
    }

    public long getCelular() {
        return celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", celular=" + celular + ", domicilio=" + domicilio + '}';
    }
    
    
    
}
