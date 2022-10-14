import java.util.Date;

public class AltaGama extends Producto{
    String paisOrigen;
    Date fechaFab;

    public AltaGama() {
    }

    public AltaGama(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, String paisOrigen, Date fechaFab) {
        super(codigo, modelo, alquilar, fabricante);
        this.paisOrigen = paisOrigen;
        this.fechaFab = fechaFab;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(Date fechaFab) {
        this.fechaFab = fechaFab;
    }

    @Override
    public String toString() {
        return "AltaGama{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFab=" + fechaFab +
                '}';
    }
}
