public class AgregarTamanio implements Transformacion{
    public AgregarTamanio(){};

    @Override
    public void aplicar(Pagina p) {
        Texto parrafoNuevo = new Texto("Tamaño de la página: " + p.getTamanio() +  " bytes");
        p.addContenido(parrafoNuevo);
    }
}
