import java.util.ArrayList;
import java.util.List;

public class ServidorWeb {
    private List<Pagina> paginas;
    private List<Estilo> estilos;

    public ServidorWeb(List<Pagina> paginas, List<Estilo> estilos) {
        this.paginas = new ArrayList<>();
        this.estilos = new ArrayList<>();
    }
    public void addPagina (Pagina p){
        paginas.add(p);
    }
    public void addEstilo (Estilo e){
        estilos.add(e);
    }
    public Pagina solicitarPagina(Pagina P, Estilo e){
        Pagina paginaNueva = copiarPagina(P);
        return aplicarEstilo(paginaNueva, e);
    }
    private Pagina aplicarEstilo (Pagina p, Estilo e){
        for (Transformacion transformacion: e.getTransformaciones()){
            transformacion.aplicar(p);
        }
        return p;
    }
    private Pagina copiarPagina(Pagina p){
        Pagina res = new Pagina();
        for (int i = 0; i<p.getContenido().size(); i++){
            Componente nuevoComponente = p.getContenido().get(i);
            res.addContenido(nuevoComponente);
        }
        return res;
    }
}
