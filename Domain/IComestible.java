package Domain;

import java.util.Calendar;

public interface IComestible {
    public int getCalorias();
    public void setCalorias(int calorias);
    public Calendar getFechaVencimiento();
    public void setFechaVencimiento(Calendar fechaVencimiento);
}
