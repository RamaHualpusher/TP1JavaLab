package Domain;

public interface IDescuento {
    public double getPorcentajeDescuento();
    public void setPorcentajeDescuento(double porcentajeDescuento);
    public double getPrecioFinal();
    public double calcularPrecioFinal();

}
