public class ReducirTamanio implements Transformacion{
    private int tasa;
    public ReducirTamanio (int tasa){
        this.tasa = tasa;
    }

    @Override
    public void aplicar(Pagina p) {
        p.cambiarTamanio(tasa);
    }
}
