/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerherenciaa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        } else {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // Otros métodos que quieras implementar
}