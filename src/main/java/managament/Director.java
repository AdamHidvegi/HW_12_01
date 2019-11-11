package managament;

public class Director extends Manager {

    private int budget;

    public Director(int budget, String name, int NIN, double salary, String deptName) {
        super(name, NIN, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return super.payBonus()*2;
    }

}
