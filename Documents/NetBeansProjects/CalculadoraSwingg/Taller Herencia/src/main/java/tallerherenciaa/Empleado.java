/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerherenciaa;

/**
 *
 * @author Usuario
 */
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected int numeroSeguroSocial;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, String apellido, int numeroSeguroSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salarioBase = salarioBase;
    }

    // Método para calcular el salario devengado (base)
     public double calcularDevengado() {
        return salarioBase;
    }

    public double calcularDeducciones() {
        double deducciones = salarioBase * 0.1; // Supongamos un 10% de deducciones
        return deducciones;
    }

    public double calcularSalarioNeto() {
        return calcularDevengado() - calcularDeducciones();
    }

    public String getInformacion() {
        return "Nombre: " + nombre + " " + apellido + "\nNúmero de Seguro Social: " + numeroSeguroSocial + "\nSalario Base: " + salarioBase;
    }
}
