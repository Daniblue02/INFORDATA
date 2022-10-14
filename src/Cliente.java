import java.util.List;

public class Cliente {
    int NIT;
    String clienteAp;
    int clienteTel;
    String clienteDirec;
    List<Operacion> operaciones;

    public Cliente() {
    }

    public Cliente(int NIT, String clienteAp, int clienteTel, String clienteDirec, List<Operacion> operaciones) {
        this.NIT = NIT;
        this.clienteAp = clienteAp;
        this.clienteTel = clienteTel;
        this.clienteDirec = clienteDirec;
        this.operaciones = operaciones;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getClienteAp() {
        return clienteAp;
    }

    public void setClienteAp(String clienteAp) {
        this.clienteAp = clienteAp;
    }

    public int getClienteTel() {
        return clienteTel;
    }

    public void setClienteTel(int clienteTel) {
        this.clienteTel = clienteTel;
    }

    public String getClienteDirec() {
        return clienteDirec;
    }

    public void setClienteDirec(String clienteDirec) {
        this.clienteDirec = clienteDirec;
    }

    public List<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NIT=" + NIT +
                ", clienteAp='" + clienteAp + '\'' +
                ", clienteTel=" + clienteTel +
                ", clienteDirec='" + clienteDirec + '\'' +
                ", operaciones=" + operaciones +
                '}';
    }
}
