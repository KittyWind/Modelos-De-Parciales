package modelo2;

public class EstudianteMayor extends Estudiante{
    private int edad;

    public EstudianteMayor(String dni, String nombre, int edad) {
        super(dni, nombre);
        this.edad = edad;
    }

    @Override
    public double devolverCuota() {
        return super.devolverCuota() - calcularDescuento(this.determinarDescuento());
    }

    public double determinarDescuento(){
        double descuento = 0.0;
        int anioinicial = 50;
        for (int i = anioinicial; i <= this.edad; i++) {
            if (i > 50){
                descuento += 2.0;
            }

        }
        if(descuento > 15.0){
            descuento = 15.0;
        }
        descuento = descuento / 100-0;
        return descuento;
    }
}
