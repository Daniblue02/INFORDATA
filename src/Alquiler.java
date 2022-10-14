import java.util.Date;

public class Alquiler extends Operacion{

    Float precioHora;
    Producto codigo;
    int tiempoAlquiler;

    public Alquiler() {
    }

    public Alquiler(Date fecha, Cliente cliente, Provedor provedor, Float precioHora, Producto codigo, int tiempoAlquiler) {
        super(fecha, cliente, provedor);
        this.precioHora = precioHora;
        this.codigo = codigo;
        this.tiempoAlquiler = tiempoAlquiler;
    }

    public Float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Float precioHora) {
        this.precioHora = precioHora;
    }

    public Producto getCodigo() {
        return codigo;
    }

    public void setCodigo(Producto codigo) {
        this.codigo = codigo;
    }

    public int getTiempoAlquiler() {
        return tiempoAlquiler;
    }

    public void setTiempoAlquiler(int tiempoAlquiler) {
        this.tiempoAlquiler = tiempoAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "precioHora=" + precioHora +
                ", codigo=" + codigo +
                ", tiempoAlquiler=" + tiempoAlquiler +
                '}';
    }
}
