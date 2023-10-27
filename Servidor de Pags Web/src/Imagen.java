public class Imagen extends Componente{
    private int tamanio;
    public Imagen (int tamanio){
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public void setTamanio(int tasa) {
        this.tamanio = tamanio*tasa;
    }
}
