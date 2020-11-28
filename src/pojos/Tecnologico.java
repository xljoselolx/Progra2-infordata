package pojos;
import java.util.Date;

public class Tecnologico extends Producto{
    protected String paisOrigen;
    private Date fechaFabricacion;
    private Empresa fabricante;

    public Tecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante) {
        super(codigo, modelo);
        this.setPaisOrigen(paisOrigen);
        this.setFechaFabricacion(fechaFabricacion);
        this.setFabricante(fabricante);
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Tecnologico{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + getCodigo() + '\''+
                ", modelo='" + getModelo() + '\''+
                '}';
    }
}
