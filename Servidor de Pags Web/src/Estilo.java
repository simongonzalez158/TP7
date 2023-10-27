import java.util.ArrayList;
import java.util.List;

public class Estilo {
    List<Transformacion> transformaciones;
    public Estilo(){
        this.transformaciones = new ArrayList<>();
    }
    public void addTransformacion(Transformacion transformacion){
        transformaciones.add(transformacion);
    }

    public List<Transformacion> getTransformaciones() {
        return transformaciones;
    }
}
