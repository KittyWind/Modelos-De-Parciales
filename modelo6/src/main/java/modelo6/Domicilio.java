package modelo6;

public class Domicilio {
    private String calle;
    private int altura;
    private int comuna;

    public Domicilio(String calle, int altura, int comuna) {
        this.calle = calle;
        this.altura = altura;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", altura=" + altura +
                ", comuna=" + comuna +
                '}';
    }

    public boolean verificarComuna(Domicilio domicilio){
        return this.comuna == domicilio.comuna;
    }
}
