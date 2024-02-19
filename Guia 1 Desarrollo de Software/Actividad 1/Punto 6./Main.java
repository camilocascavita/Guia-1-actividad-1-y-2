import java.util.Date;


class Universidad {
    private String nombre;
    private String nombreRector;
    private String ciudad;

    public Universidad(String nombre, String nombreRector, String ciudad) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.ciudad = ciudad;
    }
}


class Facultad {
    private String nombre;
    private int codigo;
    private Universidad universidad;

   
    public Facultad(String nombre, int codigo, Universidad universidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.universidad = universidad;
    }
}


class Profesor {
    private String nombre;
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad facultad;

    
    public Profesor(String nombre, String profesion, String nacionalidad, double sueldo, Facultad facultad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
    }
}


class Carrera {
    private String nombre;
    private int creditosTotales;
    private int numSemestres;
    private String nivel;
    private Facultad facultad;

    
    public Carrera(String nombre, int creditosTotales, int numSemestres, String nivel, Facultad facultad) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.numSemestres = numSemestres;
        this.nivel = nivel;
        this.facultad = facultad;
    }
}


class Estudiante {
    private String nombre;
    private String colegioBachillerato;
    private Date fechaIngreso;
    private Carrera[] carreras;

    
    public Estudiante(String nombre, String colegioBachillerato, Date fechaIngreso, Carrera[] carreras) {
        this.nombre = nombre;
        this.colegioBachillerato = colegioBachillerato;
        this.fechaIngreso = fechaIngreso;
        this.carreras = carreras;
    }
}


class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private String numeroSalon;
    private String nombreEdificio;
    private Profesor[] profesores;
    private Carrera carrera;

    
    public Curso(int codigo, String nombre, int creditos, String numeroSalon, String nombreEdificio, Profesor[] profesores, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.numeroSalon = numeroSalon;
        this.nombreEdificio = nombreEdificio;
        this.profesores = profesores;
        this.carrera = carrera;
    }
}


class Persona {
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    private String lugarNacimiento;

   
    public Persona(String cedula, String nombre, Date fechaNacimiento, String lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }
}

public class Main {
    public static void main(String[] args) {
     
    }
}
