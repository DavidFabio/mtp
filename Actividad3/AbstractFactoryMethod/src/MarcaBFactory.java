class MarcaBFactory implements VehiculoFactory {
    @Override
    public Coche crearCoche() {
        return new CocheMarcaB();
    }

    @Override
    public Moto crearMoto() {
        return new MotoMarcaB();
    }
}