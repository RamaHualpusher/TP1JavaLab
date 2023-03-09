package Domain;

public class Limpieza extends Producto {
    private ETipoAplicacion tipoAplicacion;

    public Limpieza() {
    }

    @Override
    public void setId(String id) {
        if (verificarID(id, "[A][Z][0-9][0-9][0-9]")) {
            this.id = id;
        } else {
            System.out.println("El ID no cumple con el patron");
        }
    }

    public ETipoAplicacion getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(ETipoAplicacion tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }
}
