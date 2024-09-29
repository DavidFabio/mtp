public class Main {
    public static void main(String[] args) {
        // Usar la fábrica de MarcaA
        VehiculoFactory fabricaA = new MarcaAFactory();
        Coche cocheA = fabricaA.crearCoche();
        Moto motoA = fabricaA.crearMoto();
        
        cocheA.conducir();
        motoA.manejar();
        
        // Usar la fábrica de MarcaB
        VehiculoFactory fabricaB = new MarcaBFactory();
        Coche cocheB = fabricaB.crearCoche();
        Moto motoB = fabricaB.crearMoto();
        
        cocheB.conducir();
        motoB.manejar();
    }
}