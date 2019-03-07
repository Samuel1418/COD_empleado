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
public class Empleado {
   
    private String newLastName = "";
    private String newMiddleName = "";
    private String newFirstName;
    private long newId;
    private int newBirthYear = 0;
    private int newBirthMonth = 0;
    private int newBirthDate = 0;
    private int newHireYear = 0;
    private int newHireMonth = 0;
    private int newHireDate=0;

    public Empleado(final long newId,final String newFirstName) {
        this.newId=newId;
        this.newFirstName=newFirstName;   
    }

    public Empleado setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    public Empleado setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    public Empleado setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
        return this;
    }

    public Empleado setNewId(long newId) {
        this.newId = newId;
        return this;
    }

    public Empleado setNewBirthYear(int newBirthYear) {
        this.newBirthYear = newBirthYear;
        return this;
    }

    public Empleado setNewBirthMonth(int newBirthMonth) {
        this.newBirthMonth = newBirthMonth;
        return this;
    }

    public Empleado setNewBirthDate(int newBirthDate) {
        this.newBirthDate = newBirthDate;
        return this;
    }

    public Empleado setNewHireYear(int newHireYear) {
        this.newHireYear = newHireYear;
        return this;
    }

    public Empleado setNewHireMonth(int newHireMonth) {
        this.newHireMonth = newHireMonth;
        return this;
    }

    public Empleado setNewHireDate(int newHireDate) {
        this.newHireDate = newHireDate;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(newLastName, newMiddleName, newFirstName, newId, newBirthYear, newBirthMonth, newBirthDate, newHireYear, newHireMonth, newHireDate);
    }

}