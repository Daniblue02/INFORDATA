import java.util.List;

public class Fabricante {
    String nombre;
    String direccion;
    int numeroEmp;
    List<Producto> productos;

    public Fabricante() {
    }

    public Fabricante(String nombre, String direccion, int numeroEmp, List<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmp = numeroEmp;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmp() {
        return numeroEmp;
    }

    public void setNumeroEmp(int numeroEmp) {
        this.numeroEmp = numeroEmp;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroEmp=" + numeroEmp +
                ", productos=" + productos +
                '}';
    }
}
