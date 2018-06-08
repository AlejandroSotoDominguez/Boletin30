
package boletin30;

import java.util.ArrayList;

public class Boletin30 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> lista = new ArrayList();
        
        SeleccionFutbol entrenador = new Entrenador(423,9372,"Manuel","Rodríguez Sánchez", 38);
        SeleccionFutbol futbolista = new Futbolista(47,"Centro",7345,"Daniel","Pérez Sousa", 29);
        SeleccionFutbol masajista = new Masajista("Fisioterapeuta",12,324,"Paco","Domínguez Otero", 42);
        SeleccionFutbol seleccionador = new Seleccionador("Paco",123,"Domínguez Otero", 42);
        
        lista.add(entrenador);
        lista.add(futbolista);
        lista.add(masajista);
        lista.add(seleccionador);
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
    }
    
}
