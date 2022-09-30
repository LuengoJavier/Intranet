package Intranet;

public class Alumno {
    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;
    // constructor
    public Alumno(String nombre, String apellido, String rut, String matricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getRut() {
        return rut;
    }
    public String getMatricula() {
        return matricula;
    }
}
