/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical3Patient;

/**
 *
 * @author k
 */
public class Patient implements Comparable {
    String name;
    int severity;
    double time;

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", severity=" + severity + ", time=" + time + '}';
    }

    public Patient(String name, int severity, double time) {
        this.name = name;
        this.severity = severity;
        this.time = time;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSeverity(int severity) {
        this.severity = severity;
    }

    private void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public double getTime() {
        return time;
    }

    @Override
    public int compareTo(Object o) {
        return ((Patient)o).getSeverity() - this.severity;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
