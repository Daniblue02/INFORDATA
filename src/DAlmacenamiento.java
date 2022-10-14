public class DAlmacenamiento extends Producto{

    int capacidad;

    public DAlmacenamiento() {
    }

    public DAlmacenamiento(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, int capacidad) {
        super(codigo, modelo, alquilar, fabricante);
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
        return "DAlmacenamiento{" +
                "capacidad=" + capacidad +
                '}';
    }
}
