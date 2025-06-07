package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiante> estudiantes;
    private String nombre;

    public Curso(String nombre) {
        estudiantes = new ArrayList<Estudiante>();
        this.nombre = nombre;
    }
    public Curso() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEst(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    @Override
    public String toString() {
        return "Curso{" +
                "estudiantes=" + estudiantes +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
