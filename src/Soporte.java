import java.util.Date;

public class Soporte {
    Cliente cliente;
    String problema;
    Date fechaSolicitud;
    Boolean solucionado;
    Fabricante fabricante;

    public Soporte() {
    }

    public Soporte(Cliente cliente, String problema, Date fechaSolicitud, Boolean solucionado, Fabricante fabricante) {
        this.cliente = cliente;
        this.problema = problema;
        this.fechaSolicitud = fechaSolicitud;
        this.solucionado = solucionado;
        this.fabricante = fabricante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Boolean getSolucionado() {
        return solucionado;
    }

    public void setSolucionado(Boolean solucionado) {
        this.solucionado = solucionado;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Soporte{" +
                "cliente=" + cliente +
                ", problema='" + problema + '\'' +
                ", fechaSolicitud=" + fechaSolicitud +
                ", solucionado=" + solucionado +
                ", fabricante=" + fabricante +
                '}';
    }
}
