
package boletin30;

public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    
    public void planificarEntrenamiento(){    
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
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
