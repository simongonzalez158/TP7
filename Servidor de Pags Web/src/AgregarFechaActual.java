import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class AgregarFechaActual implements Transformacion{
    private Date fecha;
    public AgregarFechaActual(){
        fecha = Date.from(Instant.now());
    }

    @Override
    public void aplicar(Pagina p) {
        Texto parrafoNuevo = new Texto("La fecha de hoy es: " + fecha);
        p.addContenido(parrafoNuevo);
    }
}
