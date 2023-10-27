import java.util.ArrayList;
import java.util.List;

public class Texto extends Componente{
    private String parrafo;
    private int tamanioFuente = 12;
    public Texto (String parrafo){
        this.parrafo = parrafo;
    }
    public Texto (String parrafo, int tamanioFuente){
        this.parrafo = parrafo;
        this.tamanioFuente = tamanioFuente;
        //this.parrafos = new ArrayList<>();
    }

    public String getParrafo() {
        return parrafo;
    }

    public int getTamanioFuente() {
        return tamanioFuente;
    }

    @Override
    public int getTamanio() {
        int contadorLetras = 0;
        for (int i = 0; i < parrafo.length(); i++) {
            char caracter = parrafo.charAt(i);
            if (Character.isLetter(caracter)) {
                contadorLetras++;
            }
        }
        return contadorLetras;
    }

    public void setTamanio(int tasa) {
        this.tamanioFuente = tamanioFuente*tasa;
    }
/*
    public void addParrafo(String parrafo){
        parrafos.add(parrafo);
    }


    public List<String> getParrafos() {
        return parrafos;
    }

    public int getTamanio(){        // el tamaño es la cantidad de letras de todos los parrafos
        int contadorLetras = 0;
        for (String parrafo: parrafos){
            for (int i = 0; i < parrafo.length(); i++) {
                char caracter = parrafo.charAt(i);
                if (Character.isLetter(caracter)) {
                    contadorLetras++;
                }
            }
        }
        return contadorLetras;
    }
     */
}
