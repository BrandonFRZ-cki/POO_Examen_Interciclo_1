package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Calificacion> calificaciones;

    public Estudiante() {
        calificaciones = new ArrayList();
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        calificaciones = new ArrayList<Calificacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
    public void agregarCal(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }
}
