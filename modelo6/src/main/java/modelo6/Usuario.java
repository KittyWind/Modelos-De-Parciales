package modelo6;

public class Usuario {
    private String ID;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Usuario(String ID, String nombre, String apellido, Domicilio domicilio) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}
