package modelo6;

public class OrdenPuerta extends Orden{
    private boolean envioGratis;

    public OrdenPuerta(Usuario comprador, Usuario vendedor, int numero, double monto, boolean envioGratis) {
        super(comprador, vendedor, numero, monto);
        this.envioGratis = envioGratis;
    }

    @Override
    public String toString() {
        return "OrdenPuerta{" +
                "envioGratis=" + envioGratis +
                '}';
    }

    public boolean isEnvioGratis() {
        return envioGratis;
    }
}
