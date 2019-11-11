package staff;

public abstract class Employee {

    private String name;
    private int NIN;
    private double salary;

    public Employee(String name, int NIN, double salary) {
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        if ( newName != null) {
            this.name = newName;
        }
        return this.name;
    }

    public int getNIN() {
        return this.NIN;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary*0.01;
    }

}
