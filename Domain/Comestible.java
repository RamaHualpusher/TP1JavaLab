package Domain;

import java.util.Calendar;

public abstract class Comestible extends Producto implements IComestible {
    Calendar fechaVencimiento;
    int calorias;

    public Comestible() {
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    @Override
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


}
