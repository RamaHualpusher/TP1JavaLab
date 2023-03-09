package Domain;

public abstract class Producto implements IDescuento{
    protected String id;
    protected String descripcion;
    protected int cantidadStock;
    protected double precioUnitario;
    protected double porcentajeGanancia;
    protected double porcentajeDescuento;
    protected double precioFinal;

    protected boolean disponible;

    //CONSTRUCTOR
    public Producto() {
        this.disponible = true;
    }


    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public abstract void setId(String id);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public boolean isDisponible() {
        return disponible = cantidadStock > 0;
    }


    @Override
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioUnitario + (precioUnitario * porcentajeGanancia / 100);
    }

    //METODOS
    public boolean verificarID(String id, String patron){
        return id.toUpperCase().matches(patron);
    }

}
