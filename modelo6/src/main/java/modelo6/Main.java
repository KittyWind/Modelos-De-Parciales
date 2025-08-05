package modelo6;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio("Irigoyen", 1506,10);
        Domicilio domicilio1 = new Domicilio("bruselas",1699,10);
        Domicilio domicilio2 = new Domicilio("Triunvirato",5040,4);
        Usuario usuario = new Usuario("43123254","Lady","Night",domicilio);
        Usuario usuario1 = new Usuario("85849395","Kimi","Akiyama",domicilio1);
        Sucursal sucursal = new Sucursal("Sucursal a",domicilio2);
        Orden orden = new OrdenPuerta(usuario,usuario1,101,123.43,true);
        Orden orden1 = new OrdenRetiro(usuario1,usuario,2,560.54,sucursal);
        TodoLibre todoLibre = new TodoLibre();
        todoLibre.aniadirUsuario(usuario);
        todoLibre.aniadirUsuario(usuario1);
        todoLibre.aniadirOrden(orden);
        todoLibre.aniadirOrden(orden1);
        todoLibre.mostrarCantidadDeOrdenesConEnvioGratis();
        todoLibre.ordenConMismaColumna();
    }
}