public class AgregarPiePagina implements Transformacion{
    public AgregarPiePagina(){};

    @Override
    public void aplicar(Pagina p) {
        Texto parrafoNuevo = new Texto("Este es un pie de pagina");
        p.addContenido(parrafoNuevo);
    }
}
