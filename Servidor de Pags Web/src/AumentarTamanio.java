public class AumentarTamanio implements Transformacion{
    private int tasa;
    public AumentarTamanio (int tasa){
        this.tasa = tasa;
    }

    @Override
    public void aplicar(Pagina p) {
        p.cambiarTamanio(tasa);
    }
}
