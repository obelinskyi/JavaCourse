package basiс5;

import java.util.Objects;
import java.util.Set;

public class Employee {

    private int startingYear;
    private String name;

    public Employee(int startingYear, String name) {
        this.startingYear = startingYear;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return startingYear == employee.startingYear &&
                name.equals(employee.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(startingYear, name);
    }
}
