import java.util.ArrayList;
import java.util.List;

public class Pagina {
    private List<Componente> contenido;
    public Pagina(){
        this.contenido = new ArrayList<>();
    }

    public List<Componente> getContenido() {
        return contenido;
    }

    public void addContenido(Componente c){
        contenido.add(c);
    }
    public int getTamanio(){
        int res = 0;
        for (Componente c: contenido){
            res += c.getTamanio();
        }
        return res;
    }
    public int getCantComponentes(){
        return contenido.size();
    }
    public void cambiarTamanio(int tasa){
        for (Componente c: contenido){
            c.setTamanio(tasa);
        }
    }
}
