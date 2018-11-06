import java.util.ArrayList;
import java.util.Arrays;

public class Department implements StructureUnit {
    private String title;
    private ArrayList<String> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void hireEmployee(String name) {
        this.employees.add(name);
    }

    @Override
    public void fireEmployee(String name) {
        this.employees.remove(name);
    }

    @Override
    public String getInfo() {
        int num = this.employees.size();
        return "Title: " + this.title + " | Number of employees: " + num + " | Employees: " + Arrays.toString(this.employees.toArray());
    }
}
