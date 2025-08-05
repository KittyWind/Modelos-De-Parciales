package modelo6;

import java.util.ArrayList;

public class TodoLibre {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Orden> ordenes;

    public TodoLibre(){
        this.ordenes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void aniadirOrden(Orden orden){
        if (orden != null){
            this.ordenes.add(orden);
        }
    }

    public void aniadirUsuario(Usuario usuario){
        if(usuario != null){
            this.usuarios.add(usuario);
        }
    }

    @Override
    public String toString() {
        return "TodoLibre{" +
                "usuarios=" + usuarios +
                ", ordenes=" + ordenes +
                '}';
    }
}
