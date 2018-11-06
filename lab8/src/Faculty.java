import java.util.ArrayList;
import java.util.Arrays;

public class Faculty implements StructureUnit {
    private String title;
    private ArrayList<Department> departments;
    private ArrayList<String> employees;

    public Faculty() {
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
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

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    @Override
    public String getInfo() {
        int num = this.employees.size();
        String info = "Title: " + this.title + " | Number of employees: " + num + " | Employees: " + Arrays.toString(this.employees.toArray());
        info += "\nInfo from departments: \n";
        for (Department d : departments) {
            info += d.getInfo() + "\n";
        }
        return info;
    }
}

