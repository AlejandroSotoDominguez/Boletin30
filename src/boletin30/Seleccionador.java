
package boletin30;

public class Seleccionador extends SeleccionFutbol {
    private String nombre;
    private int id;
    private String apellidos;
    private int edad;
    
    public void seleccionarXogador(){
        
    }

    public Seleccionador(String nombre, int id, String apellidos, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println("se concentra el seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("viaja el seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("entrena el seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("juega el seleccionador");
    }
}
