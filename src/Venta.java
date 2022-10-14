import java.util.Date;

public class Venta extends Operacion{

    Float precio;
    Producto codigo;

    public Venta() {
    }

    public Venta(Date fecha, Cliente cliente, Provedor provedor, Float precio, Producto codigo) {
        super(fecha, cliente, provedor);
        this.precio = precio;
        this.codigo = codigo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Producto getCodigo() {
        return codigo;
    }

    public void setCodigo(Producto codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "precio=" + precio +
                ", codigo=" + codigo +
                '}';
    }
}
