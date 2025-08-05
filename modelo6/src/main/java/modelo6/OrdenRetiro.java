package modelo6;

public class OrdenRetiro extends Orden {
    private Sucursal sucursal;

    public OrdenRetiro(Usuario comprador, Usuario vendedor, int numero, double monto, Sucursal sucursal) {
        super(comprador, vendedor, numero, monto);
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "OrdenRetiro{" +
                "sucursal=" + sucursal +
                '}';
    }
}
