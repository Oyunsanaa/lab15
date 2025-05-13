// src/main/java/lab15/sict/must/edu/mn/Division.java
package lab15.sict.must.edu.mn;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
