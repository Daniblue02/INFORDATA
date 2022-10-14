public class Monitor extends Producto{
    String resolucion;

    public Monitor() {
    }

    public Monitor(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, String resolucion) {
        super(codigo, modelo, alquilar, fabricante);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolucion='" + resolucion + '\'' +
                '}';
    }
}
