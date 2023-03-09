package Domain;

public class Bebida extends Comestible {
    private double graduacionAlcoholica;
    private boolean esImportado;

    public Bebida() {
    }

    @Override
    public void setId(String id) {
        if (verificarID(id, "[A][C][0-9][0-9][0-9]")) {
            this.id = id;
        } else {
            System.out.println("El ID no cumple con el patron");
        }
    }

    public double getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(double graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public boolean isEsImportado() {
        return esImportado;
    }

    public void setEsImportado(boolean esImportado) {
        this.esImportado = esImportado;
    }
}
