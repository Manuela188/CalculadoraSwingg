/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerherenciaa;

/**
 *
 * @author Usuario
 */
public class EmpleadoPorSueldo extends Empleado {
    public EmpleadoPorSueldo(String nombre, String apellido, int numeroSeguroSocial, double salarioBase) {
        super(nombre, apellido, numeroSeguroSocial, salarioBase);
    }
    
    public double calcularDevengado() {
        return super.calcularDevengado();
    }

    public double calcularDeducciones() {
        double deducciones = calcularDevengado() * 0.1; // Supongamos un 10% de deducciones
        return deducciones;
    }
}
