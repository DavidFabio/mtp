package src;

public class OrdenadorFactory implements OrdenadorFactoryInterfaz {

    @Override
    public Ordenador crearOrdenador( String ram, int capacidadram, String discoduro, int capacidaddiscoduro, int dimensionpantalla, String calidad){
        if ((ram == "DDR3") && (capacidadram <= 4) && (discoduro == "HDD") && (capacidaddiscoduro <=500) && (dimensionpantalla <=24) && (calidad == "Mala calidad")){
            return new OrdenadorTipoC(ram, capacidadram, discoduro, capacidaddiscoduro, dimensionpantalla, calidad);
        }
        else if ((ram == "DDR4") && (capacidadram <= 8) && (discoduro == "SSD") && (capacidaddiscoduro <=1000) && (dimensionpantalla <=27) && (calidad == "Buena calidad")){
            return new OrdenadorTipoB(ram, capacidadram, discoduro, capacidaddiscoduro, dimensionpantalla, calidad);
        }
        else {
            return new OrdenadorTipoA(ram, capacidadram, discoduro, capacidaddiscoduro, dimensionpantalla, calidad);
        }
        
    }
}