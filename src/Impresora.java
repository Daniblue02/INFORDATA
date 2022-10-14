public class Impresora extends Producto{
    int velocidad;

    public Impresora() {
    }

    public Impresora(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, int velocidad) {
        super(codigo, modelo, alquilar, fabricante);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "velocidad=" + velocidad +
                '}';
    }
}
