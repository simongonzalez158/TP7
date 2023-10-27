public class Vinculo extends Componente{
    private Pagina referencia;
    public Vinculo (Pagina referencia){
        this.referencia = referencia;
    }
    @Override
    public int getTamanio() {
        return referencia.getTamanio();
    }

    @Override
    public void setTamanio(int tasa) {
        referencia.cambiarTamanio(tasa);
    }
}
