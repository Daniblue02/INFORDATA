public class Producto {
    String codigo;
    String modelo;
    Boolean alquilar;
    Fabricante fabricante;

    public Producto() {
    }

    public Producto(String codigo, String modelo, Boolean alquilar, Fabricante fabricante) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.alquilar = alquilar;
        this.fabricante = fabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getAlquilar() {
        return alquilar;
    }

    public void setAlquilar(Boolean alquilar) {
        this.alquilar = alquilar;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", alquilar=" + alquilar +
                ", fabricante=" + fabricante +
                '}';
    }
}
