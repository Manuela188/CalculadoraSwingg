/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerherenciaa;

/**
 *
 * @author Usuario
 */
public class EmpleadoGerente extends Empleado{
    private double bono;
    
    public EmpleadoGerente(String nombre, String apellido, int numeroSeguroSocial, double sueldoMensual, double bonoGerente) {
        super(nombre, apellido, numeroSeguroSocial, sueldoMensual);
        this.bono = bono;
    }

    public double calcularDevengado() {
        return super.calcularDevengado() + bono; // Salario base + bono
    }

    public double calcularDeducciones() {
        double deducciones = calcularDevengado() * 0.1; // Supongamos un 10% de deducciones
        return deducciones;
    }
}
