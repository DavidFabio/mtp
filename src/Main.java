public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.comer();
        perro.cagar();
        perro.gritar();

        Animal gato = new Gato();
        gato.comer();
        gato.cagar();
        gato.gritar();

        Pajaro pajaro = new Pajaro();
        pajaro.comer();
        pajaro.cagar();
        pajaro.gritar();
        pajaro.volar();
    }
}
