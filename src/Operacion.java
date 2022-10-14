import java.util.Date;

public class Operacion {

    Date fecha;
    Cliente cliente;
    Provedor provedor;

    public Operacion() {
    }

    public Operacion(Date fecha, Cliente cliente, Provedor provedor) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.provedor = provedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "fecha=" + fecha +
                ", cliente=" + cliente +
                ", provedor=" + provedor +
                '}';
    }
}
