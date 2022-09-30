package Intranet;
import java.util.*;
public class Curso {
    private List<Alumno> alumnos;
    public Curso(){
        this.alumnos = new ArrayList<Alumno>();
    }
    public boolean agregarAlumnos(String nombre, String apellido, String rut, String matricula){
        if(ValidarRut.validarDigito(rut)){
            Alumno alumno = new Alumno(nombre,apellido,rut,matricula);
            this.alumnos.add(alumno);
            return true;
        }
        return false;
    }
    public boolean removerAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos) {
            if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido) && alumno.getRut().equals(rut) && alumno.getMatricula().equals(matricula)){
                this.alumnos.remove(alumno);
                return true;
            }
        }
        return false;
    }
    public void modificarRutAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido) && alumno.getMatricula().equals(matricula)){
                alumno.setRut(rut);
                break;
            }
        }
    }
    public void modificarMatriculaAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getRut().equals(rut) && alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)){
                alumno.setMatricula(matricula);
                break;
            }
        }
    }
    public void modificarNombreAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getApellido().equals(apellido) && alumno.getRut().equals(rut) && alumno.getMatricula().equals(matricula)){
                alumno.setNombre(nombre);
                break;
            }
        }
    }
    public void modificarApellidoAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getNombre().equals(nombre) && alumno.getRut().equals(rut) && alumno.getMatricula().equals(matricula)){
                alumno.setNombre(nombre);
                break;
            }
        }
    }
}
