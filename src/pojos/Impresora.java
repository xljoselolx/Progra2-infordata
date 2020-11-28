package pojos;

public class Impresora extends Producto{
    private int velicidad;

    public Impresora(String codigo, String modelo, int velicidad) {
        super(codigo, modelo);
        this.setVelicidad(velicidad);
    }

    public int getVelicidad() {
        return velicidad;
    }

    public void setVelicidad(int velicidad) {
        this.velicidad = velicidad;
    }
}
