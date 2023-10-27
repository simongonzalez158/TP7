public class AgregarCantComponentes implements Transformacion{
    AgregarCantComponentes(){};

    @Override
    public void aplicar(Pagina p) {
        Texto parrafoNuevo = new Texto ("La cantidad de componentes de la pagina es: " + p.getCantComponentes());
        p.addContenido(parrafoNuevo);
    }
}
