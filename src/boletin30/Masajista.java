
package boletin30;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("se concentra el masajista");
    }

    @Override
    public void viajar() {
        System.out.println("viaja el masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("entrena el masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("juega el masajista");
    }
}
