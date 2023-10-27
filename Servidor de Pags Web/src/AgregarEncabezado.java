public class AgregarEncabezado implements Transformacion{
    public AgregarEncabezado(){};

    @Override
    public void aplicar(Pagina p) {
        Texto parrafoNuevo = new Texto("Este es un encabezado");
        p.addContenido(parrafoNuevo);
    }
}
