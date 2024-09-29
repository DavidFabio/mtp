package src;
public class OrdenadorTipoC extends Ordenador {

    public OrdenadorTipoC(String ram, int capacidadram, String discoduro, int capacidaddiscoduro, int dimensionpantalla, String calidad){
        super(ram, capacidadram, discoduro, capacidaddiscoduro, dimensionpantalla, calidad);
    }

    @Override
    public String getTipo() {
        return "Soy un ordenador tipo C";
    }
}
