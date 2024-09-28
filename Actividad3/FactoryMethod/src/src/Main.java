package src;

public class Main {
    public static void main(String[] args) {
        OrdenadorFactoryInterfaz factoria = new OrdenadorFactory();
        Ordenador ordenador1 = factoria.crearOrdenador("DDR3", 4, "HDD", 500, 24, "Mala calidad");
        Ordenador ordenador2 = factoria.crearOrdenador("DDR4", 8, "SSD", 1000, 27, "Buena calidad");
        Ordenador ordenador3 = factoria.crearOrdenador("DDR5", 16, "NVME", 2000, 32, "Excelente calidad");

        System.out.println(ordenador1.getTipo());
        System.out.println(ordenador2.getTipo());
        System.out.println(ordenador3.getTipo());


    }
}