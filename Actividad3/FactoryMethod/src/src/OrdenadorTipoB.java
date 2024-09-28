package src;
public class OrdenadorTipoB extends Ordenador {

    public OrdenadorTipoB(String ram, int capacidadram, String discoduro, int capacidaddiscoduro, int dimensionpantalla, String calidad){
        super(ram, capacidadram, discoduro, capacidaddiscoduro, dimensionpantalla, calidad);
    }

    @Override
    public String getTipo() {
        return "Soy un ordenador tipo B";
    }
}
