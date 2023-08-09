package Ejercicio13POO.entidad;

public class Curso {
    private String nombreCurso;
    private int cantidaHorasDia;
    private int cantidaDiaSemana;
    private String turno;
    private double precioHora;
    private String [] alumnos= new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidaHorasDia, int cantidaDiaSemana, String turno, double precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidaHorasDia = cantidaHorasDia;
        this.cantidaDiaSemana = cantidaDiaSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidaHorasDia() {
        return cantidaHorasDia;
    }

    public void setCantidaHorasDia(int cantidaHorasDia) {
        this.cantidaHorasDia = cantidaHorasDia;
    }

    public int getCantidaDiaSemana() {
        return cantidaDiaSemana;
    }

    public void setCantidaDiaSemana(int cantidaDiaSemana) {
        this.cantidaDiaSemana = cantidaDiaSemana;
    }

    public String isTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
