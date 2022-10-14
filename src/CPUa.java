import java.util.Date;

public class CPUa extends AltaGama{

    int memoriaP;

    public CPUa() {
    }

    public CPUa(String codigo, String modelo, Boolean alquilar, Fabricante fabricante, String paisOrigen, Date fechaFab, int memoriaP) {
        super(codigo, modelo, alquilar, fabricante, paisOrigen, fechaFab);
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
        return "CPUa{" +
                "memoriaP=" + memoriaP +
                '}';
    }
}
