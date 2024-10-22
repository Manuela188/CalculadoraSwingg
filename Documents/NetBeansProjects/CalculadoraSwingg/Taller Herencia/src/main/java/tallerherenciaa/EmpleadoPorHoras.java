/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerherenciaa;

/**
 *
 * @author Usuario
 */
public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, int numeroSeguroSocial, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, apellido, numeroSeguroSocial, 0); // salario base = 0
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

   @Override
    public double calcularDevengado() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public double calcularDeducciones() {
        double deducciones = calcularDevengado() * 0.1; // Supongamos un 10% de deducciones
        return deducciones;
    }
}
