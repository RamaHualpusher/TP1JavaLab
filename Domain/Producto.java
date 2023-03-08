package Domain;

public abstract class Producto implements IDescuento{
    private String id;
    private String descripcion;
    private int cantidadStock;
    private double precioUnitario;
    private double porcentajeGanancia;
    private double porcentajeDescuento;
    private double precioFinal;

    //CONSTRUCTOR
    public Producto() {
    }


    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
    public abstract boolean verificarID(String id);

}
