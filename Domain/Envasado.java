package Domain;

public class Envasado extends Comestible{
    private String tipoEnvase;
    private boolean esImportado;

    public Envasado() {
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public boolean isEsImportado() {
        return esImportado;
    }

    public void setEsImportado(boolean esImportado) {
        this.esImportado = esImportado;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = 0;
        if (this.isEsImportado()) {
            precioFinal = this.getPrecioUnitario() * (1 + this.getPorcentajeGanancia() / 100) * (1 + this.getPorcentajeDescuento() / 100) * 1.10;
        } else {
            precioFinal = this.getPrecioUnitario() * (1 + this.getPorcentajeGanancia() / 100) * (1 + this.getPorcentajeDescuento() / 100);
        }
        return precioFinal;
    }

    @Override
    public boolean verificarID(String id) {
        //El String debe ser convertido a mayusculas y compobar que siga el siguiente patron de caracteres AB123 donde se respete que las primeras letras sean AB

        //Convertir a mayusculas
        id = id.toUpperCase();

        //Comprobar que el String tenga 5 caracteres
        if (id.length() != 5) {
            return false;
        }

        //Comprobar que los primeros 2 caracteres sean letras A y B y los siguientes 3 caracteres sean cualquier número usando expresiones regulares
        if (id.matches("[A][B][0-9][0-9][0-9]")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Envasado{" + "tipoEnvase=" + tipoEnvase + ", esImportado=" + esImportado + '}';
    }
}
