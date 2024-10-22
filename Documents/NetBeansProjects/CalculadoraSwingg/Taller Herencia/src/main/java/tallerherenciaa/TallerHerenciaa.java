/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tallerherenciaa;

/**
 *
 * @author Usuario
 */
public class TallerHerenciaa {

    public static void main(String[] args) {
       Empresa miEmpresa = new Empresa();

        // Crear empleados de diferentes tipos
        Empleado gerente = new EmpleadoGerente("Carlos", "Ramírez", 12345, 5000, 1000);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Juan", "Pérez", 54321, 50, 40); // 50 por hora, 40 horas trabajadas
        Empleado empleadoPorSueldo = new EmpleadoPorSueldo("Ana", "Gómez", 67890, 3000); // Sueldo fijo

        // Agregar empleados a la empresa
        miEmpresa.agregarEmpleado(gerente);
        miEmpresa.agregarEmpleado(empleadoPorHoras);
        miEmpresa.agregarEmpleado(empleadoPorSueldo);

        // Mostrar información sobre los empleados
        for (Empleado emp : miEmpresa.getEmpleados()) {
            System.out.println("Empleado: " + emp.getClass().getSimpleName());
            System.out.println("Devengado: " + emp.calcularDevengado());
            System.out.println("Deducciones: " + emp.calcularDeducciones());
            System.out.println("Salario Neto: " + (emp.calcularDevengado() - emp.calcularDeducciones()));
            System.out.println("-------------------------");
        }
    }
}