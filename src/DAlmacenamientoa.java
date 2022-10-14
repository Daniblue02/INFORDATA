import java.util.Date;

public class DAlmacenamientoa extends AltaGama {

    int capacidad;

    public DAlmacenamientoa() {
    }

    public DAlmacenamientoa(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, String paisOrigen, Date fechaFab, int capacidad) {
        super(codigo, modelo, alquilar, fabricante, paisOrigen, fechaFab);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DAlmacenamientoa{" +
                "capacidad=" + capacidad +
                '}';
    }
}
