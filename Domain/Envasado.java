package Domain;

public class Envasado extends Comestible{
    private String tipoEnvase;
    private boolean esImportado;

    public Envasado() {
    }

    @Override
    public void setId(String id) {
        if (verificarID(id, "[A][B][0-9][0-9][0-9]")) {
            this.id = id;
        } else {
            System.out.println("El ID no cumple con el patron");
        }
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
    public String toString() {
        return "Envasado{" + "tipoEnvase=" + tipoEnvase + ", esImportado=" + esImportado + '}';
    }
}
