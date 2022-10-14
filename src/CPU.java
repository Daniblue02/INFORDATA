public class CPU extends Producto{
    int memoriaP;

    public CPU() {
    }

    public CPU(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, int memoriaP) {
        super(codigo, modelo, alquilar, fabricante);
        this.memoriaP = memoriaP;
    }

    public int getMemoriaP() {
        return memoriaP;
    }

    public void setMemoriaP(int memoriaP) {
        this.memoriaP = memoriaP;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "memoriaP=" + memoriaP +
                '}';
    }
}
