package modelo6;

public abstract class Orden {
    private Usuario comprador;
    private Usuario vendedor;
    private int numero;
    private double monto;

    public Orden(Usuario comprador, Usuario vendedor, int numero, double monto) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.numero = numero;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "comprador=" + comprador +
                ", vendedor=" + vendedor +
                ", numero=" + numero +
                ", monto=" + monto +
                '}';
    }
}
