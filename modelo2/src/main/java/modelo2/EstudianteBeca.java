package modelo2;

public class EstudianteBeca extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBeca(String dni, String nombre, double porcentajeBeca) {
        super(dni, nombre);
        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double devolverCuota(){
        return super.devolverCuota() - this.calcularDescuento(this.porcentajeBeca);
    }
}
