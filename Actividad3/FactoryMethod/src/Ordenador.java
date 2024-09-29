package src;
public abstract class Ordenador {
    private String ram;
    private int capacidadram;
    private String discoduro;
    private int capacidaddiscoduro;
    private int dimensionpantalla;
    private String calidad;


    //Método constructor

    public Ordenador(String ram, int capacidadram, String discoduro, int capacidaddiscoduro, int dimensionpantalla, String calidad){
        this.ram = ram;
        this.capacidadram = capacidadram;
        this.discoduro = discoduro;
        this.capacidaddiscoduro = capacidaddiscoduro;
        this.dimensionpantalla = dimensionpantalla;
        this.calidad = calidad;
    }

    //Getters

    public String getRam() {
        return ram;
    }
    public int getCapacidadRam(){
        return capacidadram;
    }
    public String getDiscoduro(){
        return discoduro;
    }
    public int getCapacidadDiscoduro(){
        return capacidaddiscoduro;
    }
    public int getDimensionPantalla(){
        return dimensionpantalla;
    }
    public String getCalidad(){
        return calidad;
    }

    //Setters

    public void setRam(){
        this.ram = ram;
    }
    public void setCapacidadRam(){
        this.capacidadram = capacidadram;
    }
    public void setDiscoDuro(){
        this.discoduro = discoduro;
    }
    public void setCapacidadDiscoDuro(){
        this.discoduro = discoduro;
    }
    public void setDimensionPantalla(){
        this.dimensionpantalla = dimensionpantalla;
    }
    public void setCalidad(){
        this.calidad = calidad;
    }

    //Métodos que se definen en las subclases

    public abstract String getTipo();
    
}
