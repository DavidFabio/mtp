class MarcaAFactory implements VehiculoFactory {
    @Override
    public Coche crearCoche() {
        return new CocheMarcaA();
    }

    @Override
    public Moto crearMoto() {
        return new MotoMarcaA();
    }
}