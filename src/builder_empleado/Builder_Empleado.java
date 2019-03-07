/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_empleado;

/**
 *
 * @author Samuel
 */
public class Builder_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Employee miEmpleado = new Empleado(123,"Pepe").setNewBirthDate(2000).setNewMiddleName("Fernandez").setNewHireYear(2020).createEmployee();
         System.out.println(miEmpleado);
        
    }
    
}
